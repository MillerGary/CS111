//************************************
// Gary Miller
// CMPSC 111 Spring 2014
// Lab#
// Date: 02 29 2014
//
// Purpose: ...
//************************************

import java.util.Date; // needed for printing today's date
import java.util.Scanner;

public class ForLoopExample
{
    //----------------------------
    // main method: program execution begins here
    //----------------------------
    public static void main(String[] args)
    {
        // Label output with name and date:
        System.out.println("Gary Miller\n" + new Date() + "\n");

        // Variable dictionary:
        String name;
        int length;
        Scanner scan = new Scanner (System.in);

        System.out.println("Enter a name");
        name = scan.next();
        length = name.length();

        for(int i=0; i<length; i++)
        {
            System.out.println("length is: " +length);
            System.out.println("i is :: "+i);
            System.out.println("The letter at position "+i+" is: "+name.charAt(i));
                        
        }
    }
}
