//************************************
// Gary Miller
// CMPSC 111 Spring 2014
// Lab4
// Date: 02 13 2014
//
// defines variables for ATM program
//************************************
public class Account
{  
    private double checking;
    public Account ( double initial )
    {
        // init to argument, otherwise 0.0 by default
        if ( initial > 0.0 ) {
            checking = initial;
        }
     }
     public void value ( double deposit )
     {
         checking = checking - deposit;
     }
     public void transfer (double deposit)
     {
         checking = checking + deposit;
     }
     public double getBalance ()
     {
         return checking;
     }
}
