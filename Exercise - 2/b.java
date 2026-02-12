/* Java program to check whether given number is Extension number.
The extension number is the number which is present in the last digit(s) of its
square.(Eg.N=25, 625 is Extension number since it contains 25).*/
import java.util.Scanner;
class ExtensionNumber
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        String numStr = String.valueOf(num);
        int sqr = num * num;
        String SquareStr = String.valueOf(sqr);
        if (SquareStr.endsWith(numStr)) 
        {
            System.out.println("The number is an Extension Number.");
        } else {
            System.out.println("The number is not an Extension Number.");
        }
    }
}
