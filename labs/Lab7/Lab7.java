//************************************
// Gary Miller
// CMPSC 111 Spring 2014
// Lab7
// Date: 03 11 2014
//
// Purpose: Determine if a random year is in the desired interval
//************************************

import java.util.Date; // needed for printing today's date
import java.util.Scanner;

public class Lab7
{
    //----------------------------
    // main method: program execution begins here
    //----------------------------
    public static void main(String[] args)
    {
        int input;
        int year;

        // Label output with name and date:
        System.out.println("Gary Miller\nLab 7\n" + new Date() + "\n");
        
        System.out.println("Please enter a year between 1000 and 3000 \nenter -1 to end program");
        Scanner scan = new Scanner (System.in);
        input = scan.nextInt();
        Lab7Run name = new Lab7Run (input);

        
       {
            while (input != -1)
            {
                if (input <= 3000 && input >=1000)
                    {
                        name.getDetermine();
                        input = scan.nextInt();
                        
                    }
                    
                else
                {
                    
                    System.out.println("Incorrect Range, enter a new value");
                        input = scan.nextInt();
                        if (input >= 1000 && input <=3000)
                            name.getDetermine();


                            
                }
            }
        }
            System.out.println("Goodbye");

        
    }
}
