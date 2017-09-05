package Authe;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
       String Name,Password;


       System.out.println("Enter User Name");
       Scanner Key1 = new Scanner(System.in);
       Name = Key1.next();

       System.out.println("Enter Password");
       Scanner Key2 = new Scanner(System.in);
       Password = Key2.next();

       System.out.println("Welcome " + Name + " Your Password is " + Password);
    }
}
