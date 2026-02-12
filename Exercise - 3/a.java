/* Java program to take input as Decimal number and convert into Roman Number */
import java.util.Scanner;
class DecimalToRoman
{
    public static void main (String args[])
    {
        String roman[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"}; 
        int decimal [] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the decimal number: ");
        int num = Sc.nextInt();
        String result = "";
        for (int i = 0; i < decimal.length; i++) 
            {
            while (num >= decimal[i]) 
                {
                result += roman[i];
                num -= decimal[i];
            }
        }
        System.out.println("The Roman numeral is: " + result);
    }
}
