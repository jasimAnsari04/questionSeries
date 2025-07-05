import java.util.*;
public class Salary {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Basic Salary: ");
        double basic = sc.nextDouble();
        double insurance = 0.5 * basic; 
        double pf = 0.10 * basic;
        double gross = basic + insurance + pf;
        System.out.println("Gross Salary: " + gross);
    }
}
