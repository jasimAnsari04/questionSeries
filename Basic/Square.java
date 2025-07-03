import java.util.*;
public class Square{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int square = num*num;
        System.out.println("square of "+ num +" is "+square);
    }
}