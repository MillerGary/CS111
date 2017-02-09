//************************************
// Gary Miller
// CMPSC 111 Spring 2014
// Lab#
// Date: 04 09 2014
//
// Purpose: Birthday Problem - simulate choosing people at random
// and checking the day of the year they were born. If the birthday is the same
// as the one that was seen previously, stop and out output the number of
// people that were checked.
//************************************

import java.util.Date; // needed for printing today's date
import java.util.Random;
import java.util.Scanner;

public class BirthdayProblem
{
    //----------------------------
    // main method: program execution begins here
    //----------------------------
    public static void main(String[] args)
    {
        // Label output with name and date:
        System.out.println("Gary Miller\n4/9 Exercise\n" + new Date() + "\n");

        //for recording the possible birthdays that we have seen so far
        //used [i] means that a person who's birthday is on 'i'th day of
        //the year has been found
        boolean [] used = new boolean[365];
        int count = 0; //the number of people that were checked
        int birthday;
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a birthday between 1 and 365");
        
        
        while(true)
        {
            birthday = scan.nextInt();
            //select a birthday at random, from 1 to 365
            //if the birthday has been seen, quit otherwise record it
            System.out.println("COUNT: " +count);
            
            count++;
            birthday = rand.nextInt(364)+1;
            System.out.println("Birthday is " +birthday);
            if(used[birthday-1]==true)
            {
                System.out.println("Duplicate Found");
                break;
            }
            used[birthday-1] = true;
            
        }
        System.out.println("A duplicate birthday was found after " +count+ " tries.");

            
 }    
}

