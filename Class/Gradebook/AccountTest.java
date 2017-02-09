//************************************
// Gary Miller
// CMPSC 111 Spring 2014
// Lab4
// Date: 02 13 2014
//
// contains main method for ATM program
//************************************
import java.util.Scanner;
public class AccountTest
{  
    public static void main ( String args[] )
    {
        Account checking = new Account ( 573 );
        Account savings = new Account ( 1000 );
        System.out.printf ("the balance for your checking account is: $%.2f\n",
        checking.getBalance() );
        System.out.printf ("the balance for your savings account is: $%.2f\n",
        savings.getBalance() );
         
        Scanner input = new Scanner ( System.in );
        System.out.print ( "Enter withdraw for checking: ");
        double amount = input.nextDouble();
        System.out.printf ( "Subtracting $%.2f to checking\n\n", amount );
        checking.value ( amount );
        checking.transfer (amount );

        System.out.printf ("checking balance: $%.2f\n", checking.getBalance() );
        System.out.printf ("savings balance: $%.2f\n", savings.getBalance() );
        System.out.print ( "Enter value to move from savings to checking: ");   
        amount = input.nextDouble();
        System.out.printf ( "Subtracting $%.2f from savings ", amount );
        System.out.printf ( "and adding $%.2f to checking\n\n", amount );
        savings.value ( amount );
        checking.transfer ( amount );
        System.out.printf ("checking balance: $%.2f\n", checking.getBalance() );
        System.out.printf ("savings balance: $%.2f\n", savings.getBalance() );
    }
} 

