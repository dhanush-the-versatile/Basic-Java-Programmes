/* Java program to create Class as Registration with properties with user input */
import java.util.Scanner;
class Registration_scanner{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your Full name:");
        char name=s.next().charAt(0);
        System.out.println("Name: "+name);
    }
}
