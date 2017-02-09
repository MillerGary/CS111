//************************************
// Gary Miller
// CMPSC 111 Spring 2014
// Lab#
// Date: mmm dd yyyy
//
// Purpose: ...
//************************************

import java.util.Date; // needed for printing today's date

public class Check
{
    //----------------------------
    // main method: program execution begins here
    //----------------------------
    public static void main(String[] args)
    {
        // Label output with name and date:
        System.out.println("Gary Miller\nLab #\n" + new Date() + "\n");

        // Variable dictionary:
        String a = "x1";
        String b = a.substring(1,2);
        int c = Integer.parseInt(b);
        System.out.println("" +c);

     }
}
