import java.util.Scanner;      // program uses class Scanner
public class Addition1
{
 	public static void main( String args[] )
 	{
   		int first; 	// first number to add
 		int second; 	// second number to add
 	  	// create Scanner to obtain input from command window
 		// System.in is the input complement to System.out
 	  	Scanner input = new Scanner( System.in );
 	 	System.out.print( "Enter first integer: " );
 		first = input.nextInt(); 	// read from user
      		System.out.print( "Enter second integer: " );
   		second = input.nextInt();  	// read from user
 		System.out.printf( "Sum is %d\n", first + second ); 
   	}
}

