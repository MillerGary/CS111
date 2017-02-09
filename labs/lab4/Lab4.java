//************************************
// Gary Miller
// CMPSC 111 Spring 2014
// Lab4
// Date: 02 13 2014
//
// defines variables for ATM program
//************************************
public class Lab4
{  
    private double checking;
    private double savings;
    public Lab4 ( double initial )
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
         savings = savings - deposit;
     }
     public void transfer1 (double deposit)
     {
         checking = checking + deposit;
     }
     public double getBalance ()
     {
         return checking;
     }
}
