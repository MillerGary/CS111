import java.util.Scanner;
public class switchDemoCalc {
 	public static void main ( String args[] )
 	{
 	 	double left, right, result;
 		char operator;
		Scanner input = new Scanner ( System.in );
 		System.out.print ( "Enter a simple expression: " );
		left = input.nextDouble();		// requires spaces /between int values and char 						// operator!
 		operator = input.next().charAt(0);	 
 		right = input.nextDouble();		
		System.out.printf ( "%f %s %f = " , left, operator, right );
 		switch ( operator ) 
 	 	{
			case '+' : System.out.printf ( "%f\n", left+right );
 				 break;
			case '-' : System.out.printf ( "%f\n", left-right );
 				 break;
			case '*' : System.out.printf ( "%f\n", left*right );
 				 break;
			case '/' : System.out.printf ( "%f\n", left/right );
 				 break;
            case '%' : System.out.printf ( "%f\n", left%right );
                 break;
			default  : System.out.println ( "Unknown Value" );
 		}
 	}
}

