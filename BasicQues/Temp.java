import java.util.*;
public class Temp{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the tempature in Celsius: ");
        float Celsius = sc.nextFloat();
        float fahrenheit = (9.0f/5 * Celsius) + 32;
        System.out.println(Celsius +"is equal to "+fahrenheit+" fahrenheit");
    }
}