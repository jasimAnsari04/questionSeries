import java.util.*;
public class EvenSum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int Sum = 0;
        for(int i=2;i<=num;i+=2){
            Sum = Sum+i;
        }
        System.out.println(Sum);
    }
}