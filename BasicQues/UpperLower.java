import java.util.*;
public class UpperLower{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Char: ");
        char ch = sc.next().charAt(0);
        if(ch >='a' && ch <='z'){
            System.out.println("lower case");
        }else if(ch >='A' && ch <='Z'){
            System.out.println("upper case");
        }else{
            System.out.println("This is not character");
        }
    }
}