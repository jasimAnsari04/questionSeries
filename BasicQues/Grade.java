import java.util.*;
public class Grade{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks: ");
        int marks = sc.nextInt();
        if(marks >= 90 && marks <= 100){
            System.out.println("Grade A");
        }else if(marks >=70 && marks <90){
            System.out.println("Grade B");
        }else if(marks >=50 && marks <70){
            System.out.println("Grade C");
        }else if(marks >=33 && marks <50){
            System.out.println("Grade D");
        }else if(marks >= 0 && marks <=33){
            System.out.println("Grade Fail");
        }else {
            System.out.println("Invalid marks");
        }
    }
}