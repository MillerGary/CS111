//************************************
// Gary Miller
// CMPSC 111 Spring 2014
// Exercise 03/31
// Date: 03 31 2014
//
// Purpose: ...
//************************************

import java.util.Date; // needed for printing today's date
import java.util.Scanner;

public class RestaurantSelection
{
    //----------------------------
    // main method: program execution begins here
    //----------------------------
    public static void main(String[] args)
    {
        // Label output with name and date:
        System.out.println("Gary Miller\nexercise 03/31\n" + new Date() + "\n");

        // Variable dictionary:
        Scanner input = new Scanner(System.in);
        int number;
        int exit = 0;

        System.out.println("Welcome to the restaurant selection helper");

        //do while loop
        //continuously suggest restaurants based on the cuisine preference of the user
        //until the user is satisfied with the given choice
        do
        {
            System.out.println("Please enter '1' for American, '2' for Asian, '3' for Idian, '4' for italian, '5' for Mexican");
            //save the user's input
            number = input.nextInt();

            if(number == 1)
            {
                System.out.println("We suggest Timber creek restaurant");
            }
            else if(number == 2)
            {
                System.out.println("We suggest Grace asian restaurant");
            }
            else if(number == 3)
            {
                System.out.println("We suggest Taj restaurant");
            }
            else if(number == 4)
            {
                System.out.println("We suggest Chovy's restaurant");
            }
            else if (number == 5)
            {
                System.out.println("We suggest Compadres restaurants");
            }
            else
            {
                System.out.println("This is not a valid selection");
            }

            //ask the user if he/she is satisfied with the given selection
            System.out.println("Please enter 0 if you are satisfied with the selection or '-1' if not");

            //save the user's input
            exit = input.nextInt();
        }
        while(exit == -1);
        

    }
}

