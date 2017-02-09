mport java.util.Scanner;

public class Converter
{
    //instance variables
    // 'E' euro, 'G' pound, 'C' canadian dollar
    private char currency;
    private int amount;

    Scannert scan = new Scanner (System.in);

    /* Constructor - display greeting */
    public converter
    {
        System.out.println("Welcome to the currency conversion machine");
        currency = 'E';
        amount = 0;
    }

    public void convert (char cur, int am)
    {
        currency = cur;
        amount = am;
        switch (currency)
        {
            case 'E' :
                System.out.println("Converted amount is " +(amount*1.29)+ "USD");
            break;
            case 'G' :
                System.out.println("Converted amount is " +(amount*1.59)+ "USD");
            break;
            case 'C' :
                System.out.println("Converted amount is " +(amount*1.02)+ "USD");
            break;
            default :
                System.out.println(" Not a valid currency");
        }
    }
}

