import java.util.*;
public class TriangleValid {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first angle of traingle: ");
        int a = sc.nextInt();
        System.out.print("Enter the Second angle of traingle: ");
        int b = sc.nextInt();
        System.out.print("Enter the third angle of traingle: ");
        int c = sc.nextInt();
        int angle = a+b+c;
        if(a > 0 && b > 0 && c > 0 && angle==180){
            System.out.println("It is valid triangle");
        }else{
            System.out.println("It is not valid triangle");
        }
    }
}