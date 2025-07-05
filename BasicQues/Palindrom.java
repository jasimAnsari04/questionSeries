import java.util.*;
public class Palindrom{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int temp=num;
        int lastDigit;
        int rev = 0;
        while(temp>0){
            lastDigit = temp%10;
            rev = (rev*10)+lastDigit;
            temp=temp/10;
        }
        if(num==rev){
            System.out.println(num+" is palindrome number");
        }else{
            System.out.println(num+" is not palindrome number");
        }
    }
}