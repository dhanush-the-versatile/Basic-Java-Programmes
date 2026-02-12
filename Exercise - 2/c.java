/*Java program to take input as Amount in rupees and print their denominations nd total number notes.*/
import java.util.Scanner;
class denominations{
    public static void main(String args[])
    {
        int amount [] = {500, 200, 100};
        int notes [] = new int[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount in rupees (only 500, 200, 100 notes are available): ");
        int rupees = sc.nextInt();
        if (rupees % 100 != 0) {
            System.out.println("Please enter an amount that is a multiple of 100.");
            return;
        }
        else {
        for (int i = 0; i < amount.length; i++) 
            {
            notes[i] = rupees / amount[i];
            rupees = rupees % amount[i];
        }
        System.out.println("Denominations:");
        for (int i = 0; i < amount.length; i++) 
            {
            System.out.println(amount[i] + " : " + notes[i]);
        }
    }
    }
}
