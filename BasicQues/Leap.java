import java.util.*;
public class Leap{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = sc.nextInt();
        if((year % 4 == 0 && year % 100 != 0) || (year % 400 ==0)){
            System.out.println(year+" is leap year");
        }else{
            System.out.println(year+" is not leap year");
        }
    }
}