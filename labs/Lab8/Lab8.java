//************************************
// Gary Miller
// CMPSC 111 Spring 2014
// Lab#
// Date: 03 27 2014
//
// Purpose: Program to generate a numerology report
//************************************

import java.util.Date; // needed for printing today's date
import java.util.Scanner;

public class Lab8
{
    //----------------------------
    // main method: program execution begins here
    //----------------------------
    public static void main(String[] args)
    {
        // Label output with name and date:
        System.out.println("Gary Miller\nLab 8\n" + new Date() + "\n");

        // Variable dictionary:
        int day;
        int month;
        int year;
        String date;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please enter your date of birth with spaces and forward slahses in between (mm / dd / yyyy)");
        date = scan.nextLine();
        
        month = date.substring(0,2);
        day = date.substring(5,7);
        year = date.substring(10,14);

        if (date.length == 14)
        {    
            if (year < 1880 || year > 2280  )
                System.out.println("Invalid year, enter a new year");
                date = scan.nextLine;
               
     }
}

        
        


 
