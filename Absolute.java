import java.util.*;
public class Absolute{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value: ");
        int num = sc.nextInt();
        if(num < 0){
            num = -num;
            System.out.println("absolute value is: "+num);
        }else {
            System.out.println("absolute value is: "+num);
        }
    }
}