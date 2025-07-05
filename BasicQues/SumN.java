import java.util.*;
public class SumN {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int Sum = 0;
        for(int i=1;i<=num;i++){
            Sum = Sum+i;
        }
        System.out.println(Sum);
    }
}