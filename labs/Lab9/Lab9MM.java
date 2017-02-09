//************************************
// Daniel Conroy
// Gary Miller
// Keith Danley
// Zack Hudac
// CMPSC 111 Spring 2014
// Lab 9 
// Date: 04 10 2014
// 
// Purpose: Lab 9 Main Method Baseball Calc. Display
//************************************

import java.util.Date;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Lab9MM
{
    //-----------------------------
    // main method: program execution begins here
    //-----------------------------
    public static void main (String[] args)
    {
        // Variable dictionary:
        Scanner input = new Scanner (System.in);
        int number;
        int exit = 0;
        Stats name = new Stats();

        System.out.println("Welcome to the Baseball Calculator!");

        //do while loop
        // Displays Key Stats for a specific year from Andrew McCutchen  
        do
        {
            System.out.println("Please enter '1' for Batting Average, '2' for Hits, '3' for Home Runs, '4' for Runs, '5' for RBI's, '6' for On Base Percentage (OBP)");
            
            //save the users input
            DecimalFormat fmt = new DecimalFormat ("0.###");
            number = input.nextInt();

            if(number==1)
            {
                System.out.println("Andrew's Batting Average for his career is: " + name.getAverageBA());
            }
            else if(number==2)
            {
                System.out.println("Andrew's Hits for his career are: " + name.getTotalH());
            }
            else if(number==3)
            {
                System.out.println("Andrew's Home Runs for his career are: " + name.getTotalHR());
            }
            else if(number==4)
            {
                System.out.println("Andrew's Runs Scored for his career are: " + name.getTotalR());
            }
            else if(number==5)
            {
                System.out.println("Andrew's RBI's for his career are: " + name.getTotalRBI());
            }
            else if(number==6)
            {
                System.out.println("Andrew's OBP for his career is: " + fmt.format(name.getAverageOBP()));
            }

            else
            {
                System.out.println("There are no stats for this number");
            }

            // ask the user if he/she is satisfied with the selection
            System.out.println("Please enter '0' if you are satisfied, or -1 for a different Stat.");

            // save user input
            exit = input.nextInt();
        }

        while(exit==-1);
    }
}
