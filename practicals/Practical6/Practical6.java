//************************************
// Gary Miller
// CMPSC 111 Spring 2014
// Practical6
// Date: 03 07 2014
//
// Purpose: practice while loop
//************************************

import java.util.Date; // needed for printing today's date
import java.util.Scanner;

public class Practical6
{
    //----------------------------
    // main method: program execution begins here
    //----------------------------
    public static void main(String[] args)
    {
        // Label output with name and date:
        System.out.println("Gary Miller\nPractical 6\n" + new Date() + "\n");

        // Variable dictionary:
        int randomNumber = 13;
        int attempts = 1;
        int input;
        
        System.out.println("Guess a random number between 1 and 100");
        Scanner scan = new Scanner(System.in);
        input = scan.nextInt();

        while (input != randomNumber)
        {
            if (input < randomNumber)
            {
                System.out.println("Too low! Attempts taken is equal to: " + attempts);
                attempts++;
                System.out.println("Guess a random number between 1 and 100");
                input = scan.nextInt();
            }
            if (input > randomNumber)
            {    
                System.out.println("Too high! Attempts taken is equal to: " + attempts);
                attempts ++;
                System.out.println("Guess a random number between 1 and 100");
                input = scan.nextInt();
            }
        }
    }
            
}
