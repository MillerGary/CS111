//************************************
// Gary Miller
// CMPSC 111 Spring 2014
// Lab#
// Date: 04 07 2014
//
// Purpose: Declare and intialize an array,
// print out the value of the array
// change thw values and print the new values
//************************************

import java.util.Date; // needed for printing today's date
import java.util.Random;

public class ArrayExample
{
    //----------------------------
    // main method: program execution begins here
    //----------------------------
    public static void main(String[] args)
    {
        // Label output with name and date:
        System.out.println("Gary Miller\n4/7 Exercise\n" + new Date() + "\n");

        // Variable dictionary:
        
        Random rand = new Random();
        final int SIZE = 2000;
        int array[] = new int [SIZE];
        int sum = 0;
        for(int i=0; i<SIZE; i++)
        {
            //initialize to random numbers
            
            System.out.println("Value at index: "+i+" is :: " +array[i]);
            sum += rand.nextInt();
            array[i] = sum;
            System.out.println("Value at index: "+i+" is :: " +array[i]); 
        }


     }
}

