//************************************
// Ayouba Swaray
// CMPSC 111 Spring 2014
// Lab5
// Date: 02 13 2014
//
// use instance variables
//************************************

import java.util.Random;
import java.util.Date;
import java.util.Scanner;

public class Lab5Test
{
    //Program execution will begin here
    public static void main(String[] args)
    {
        //Variable Dictionary
        Scanner scan = new Scanner(System.in); //used for input scanning
        Random rand = new Random(); // random number generator
        String dnaString, mutation, insert; //input by user
      
        
        //methods
        System.out.println("Gary Miller\nLab5 DNA program\n" + new Date()); 
        System.out.println("Enter a dna string (no blanks only lowercase, use a c g and t");
        dnaString = scan.next();
        
        Lab5Run name = new Lab5Run(dnaString);

        name.setComplement(dnaString);
        System.out.println("Complement of dna is: " + name.getComplement());

        name.setInsert();
        System.out.println("Inserting "+name.getGene()+ " at position "+name.getLocation()+" gives "+ name.getInsert());
        
        name.setRemove();
        System.out.println("Deleting from position " +name.getrandomNumber1()+" gives " + name.getRemove());
        
        name.setChange();
        System.out.println("Changing position " + name.getrandomNumber3()+" gives " + name.getChange());
        

    
    }
}

