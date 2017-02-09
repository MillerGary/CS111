
//************************************
// Gary Miller
// CMPSC 111 Spring 2014
// Lab#3
// Date: 01 30 2013
//
// Purpose: calculate tip and total for a bill
//************************************

import java.util.Date; // needed for printing today's date
import java.util.Scanner;

public class Lab3
{
    //----------------------------
    // main method: program execution begins here
    //----------------------------
    public static void main(String[] args)
    {
        // Label output with name and date:
        System.out.println("Gary Miller\nLab 3\n" + new Date() + "\n");

        // Variable dictionary:
        double bill;            //cost of bill
        double tip;             //desired tip percentage
        double totalcost;        //cost of bill and tip
        int numberpeople;       //number of people splitting the bill
        double personalcost;    //cost for each person
        double tipvalue;        //total value of the tip
        
        System.out.println("Hello");
        Scanner scan = new Scanner (System.in);
        System.out.print ("Enter the total of your bill: ");
        bill = scan.nextDouble();
        System.out.print ("Enter the percentage you wish to tip: ");
        tip = scan.nextDouble();
        System.out.println("Your bill was: " + bill);
        tipvalue = tip / 100 * bill;
        System.out.println("Your tip was: " + tipvalue);
        totalcost = bill + tipvalue;
        System.out.println("Your total is: " + totalcost);
        System.out.println("Enter the number of people splitting the bill: ");
        numberpeople = scan.nextInt();
        personalcost = totalcost / numberpeople;
        System.out.println("Each person should pay: " + personalcost);
        System.out.println("thank you, have a nice day!");
    }
}

