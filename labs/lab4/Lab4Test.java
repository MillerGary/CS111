//************************************
// Gary Miller
// CMPSC 111 Spring 2014
// Lab4
// Date: 02 13 2014
//
// contains main method for ATM program
//************************************
import java.util.Scanner;
import java.util.Date;
public class Lab4Test
{  
    public static void main ( String args[] )
    {
        System.out.println("Gary Miller\nLab4\n" + new Date()); 
        Lab4 checking = new Lab4 ( 573 );
        Lab4 savings = new Lab4 ( 1000 );
        System.out.printf ("the balance for your checking account is: $%.2f\n",
        checking.getBalance() );
        System.out.printf ("the balance for your savings account is: $%.2f\n",
        savings.getBalance() );
         
        Scanner input = new Scanner ( System.in );
        System.out.print ( "Enter withdraw for checking: ");
        double amount = input.nextDouble();
        System.out.printf ( "Subtracting $%.2f from checking\n\n", amount );
        checking.value ( amount );
               
        System.out.printf ("checking balance: $%.2f\n", checking.getBalance() );
        System.out.printf ("savings balance: $%.2f\n", savings.getBalance() );
        System.out.print ( "Enter value to move from savings to checking: ");   
        double move = input.nextDouble();
        System.out.printf ( "Subtracting $%.2f from savings ", move );
        System.out.printf ( "and adding $%.2f to checking\n\n", move );
        savings.value ( move );
        checking.transfer1 ( move );
        System.out.printf ("checking balance: $%.2f\n", checking.getBalance() );
        System.out.printf ("savings balance: $%.2f\n", savings.getBalance() );
        System.out.println("Thanks for using our ATM service, have a nice day");
    }
} 

