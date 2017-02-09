//************************************
// Gary Miller
// CMPSC 111 Spring 2014
// Lab#
// Date: mmm dd yyyy
//
// Purpose: ...
//************************************

import java.util.Date; // needed for printing today's date
import java.util.Scanner;

public class Calc
{
    //----------------------------
    // main method: program execution begins here
    //----------------------------
    public static void main(String[] args)
    {
        // Label output with name and date:
        System.out.println("Gary Miller\nLab #\n" + new Date() + "\n");

        // Variable dictionary:
        Scanner scan = new Scanner(System.in);
        int num;
        int output;
        num = scan.nextInt();
        output = num % 4;
        System.out.println("answer is: " +output);
        

     }
}
