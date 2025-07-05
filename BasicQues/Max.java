import java.util.*;

public class Max {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter four numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        
        int max = a;
        
        if(b > max) {
            max = b;
        }
        if(c > max) {
            max = c;
        }
        if(d > max) {
            max = d;
        }
        
        System.out.println("The maximum number is: " + max);
    }
}
