//************************************
// Gary Miller
// CMPSC 111 Spring 2014
// LabExercise March 31
// Date: 03 31 2014
//
// Purpose: Read a sentence and count the number of p's in that sentence
//************************************

import java.util.Date; // needed for printing today's date
import java.util.Scanner;

public class ContinueExample
{
    //----------------------------
    // main method: program execution begins here
    //----------------------------
    public static void main(String[] args)
    {
        // Label output with name and date:
        System.out.println("Gary Miller\nClass Exercise 3/31\n" + new Date() + "\n");

        // Variable dictionary:
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a sentence");
        String sentence = scan.nextLine();
        int length = sentence.length();
        int numP = 0;
        int nonP = 0;

        // go through the whole sentence
        for(int i =0; i < length; i++)
        {
            //interested only in p's
            if(sentence.charAt(i) !='p')
            {
                nonP++;
                continue;
            }
            //process
            numP++;
        }    
        System.out.println("Number of P's found: " +numP);
        System.out.println("Number of non P's found: " +nonP);
     }
}

