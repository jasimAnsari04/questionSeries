import java.util.*;
public class WeekDays {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total number of days: ");
        int totalDays = sc.nextInt();
        int weeks = totalDays / 7;
        int days = totalDays % 7;
        System.out.println(totalDays + " days = " + weeks + " weeks and " + days + " days");
    }
}
