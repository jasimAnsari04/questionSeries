import java.util.*;
public class Rectangle{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length: ");
        int length = sc.nextInt();
        System.out.print("Enter the breadth: ");
        int breadth = sc.nextInt();
        System.out.println("area of rectangle is: "+length*breadth);
        System.out.println("perimeter of rectangle is: "+2*(length+breadth));
    }
}