//************************************
// Gary Miller
// CMPSC 111 Spring 2014
// Lab7
// Date: 03 11 2014
//
// Purpose: Determine if a random year has certain occurances
//************************************
import java.util.Scanner;

public class Lab7Run
{
    public int year;

    Scanner scan = new Scanner(System.in);
    int input;

    //Constructor
    public Lab7Run(int year)
    {
        year = input;    
    }
    
    //Method to determine characteristics of input year
    public void getDetermine()
    {
    while (year != -1)
    {
        if (year % 4 != 0)
            System.out.println("it is not leap year");
        else 
            System.out.println("it is a leap year");
        
        if (year % 17 == 7)
            System.out.println("It's an emergence year of Brood II");
        else
            System.out.println("It's not an emergence year for Brood II");
    
        if (year % 11 == 0)
            System.out.println("It's a peak sunspot year");
        else
            System.out.println("It's not a peak sunspot year");
            
            System.out.println("Please enter another year or '-1' twice to quit");
            year = scan.nextInt();
        if (year == -1)
            input = year;
           
    }
    }
} 

