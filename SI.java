import java.util.*;
public class SI{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principle: ");
        float p = sc.nextFloat();
        System.out.print("Enter rate: ");
        float r = sc.nextFloat();
        System.out.print("Enter time: ");
        float t = sc.nextFloat();
        float Interest = (p*r*t)/100;
        System.out.println("Simple interest is "+Interest);
    }
}