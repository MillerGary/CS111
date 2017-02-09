//************************************
// Gary Miller
// CMPSC 111 Spring 2014
// Practical4
// Date: 02 14 2014
//
// Practice with random class
//************************************

import java.util.Random;

public class Practical4
{
    public static void main(String[] args)
    {
        Random generator = new Random();
        int num1;
        String flipcoin = "HT";
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        double num2;
        String myname = "GaryM";

        num1 = generator.nextInt(9) -3;
        System.out.println ("a random integer from -3 to 5 " +num1);
        char ht = flipcoin.charAt(2);
        System.out.println ("A random coin flip: " +ht);
        char randletter = alphabet.charAt(26);
        System.out.println ("A random letter: " +randletter);
        num2 = generator.nextDouble();
        System.out.println ("A random decimal number: " +num2);
        char garym = myname.charAt(5);
        System.out.println ("A random letter in my name: " +garym);
    }
}







