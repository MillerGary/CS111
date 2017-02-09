
//************************************
// Gary Miller
// CMPSC 111 Spring 2014
// Lab2
// Date: 01 23 2014
//
// This program will calculate the final value of a paycheck
//************************************

import java.util.Date; // needed for printing today's date

public class Lab2
{
    //----------------------------
    // main method: program execution begins here
    //----------------------------
    public static void main(String[] args)
    {
        // Label output with name and date:
        System.out.print.ln("Gary Miller\n Lab 2\n" + new Date() + "\n");

        // Variable dictionary:
        int totalpay;             //total money earned
        int hourwage = 10;        //how much paid per hour
        int hoursworked = 12;     //total numbers of hours worked
        int taxwithheld = 18;     //tax withheld in one week
        int week2;                //total money earned after 2 weeks
        int moneyaftertax;        //total money earned after tax

        // Compute values:
        totalpay = hourwage * hoursworked;
        week2= totalpay + totalpay;
        moneyaftertax= totalpay - taxwithheld;


        System.println("Total money earned: " +totalpay);
        System.println("Total money earned after 2 weeks: " +week2);
        System.println("total money earned after tax: " +moneyaftertax);
     }
}
