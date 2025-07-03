import java.util.*;
public class Largesttwo{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        float num1 = sc.nextFloat();
        System.out.print("Enter second number: ");
        float num2 = sc.nextFloat();
        if(num1>num2){
            System.out.println(num1 +" is largest");
        }else {
            System.out.println(num2 +" is largest");
        }
    }
}