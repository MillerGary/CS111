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

public class Lab5Run
{
    //Program execution begins here
        
        //Declare variables
        Scanner scan = new Scanner(System.in);
        String dnaString; //user input
        Random rand = new Random(); //random number generator
        String mutation, insert, remove, change;
        int len, location;
        char gene;
        int randomnumber1;
        int randomnumber2;
        int randomnumber3;
        
      public Lab5Run(String a)
      {
          dnaString = a;
      }
        

        //Methods
        public void setComplement(String a)
        {
            mutation = a; 
            mutation = mutation.replace('a','T');
            mutation = mutation.replace('c','G');
            mutation = mutation.replace('t','A');
            mutation = mutation.replace('g','C');            
        }

        public String getComplement ()
        {
            return mutation;
        }
        
        public void setInsert()
        {
            len = dnaString.length();
            location = rand.nextInt(len+1);
            gene = "catg".charAt(rand.nextInt(4));
            insert = dnaString + ""+gene; 
                               
        }
        public char getGene()
        {
            return gene;
            }
        public int getLocation()
        { 
            return location;
            }
        public int getLen()
        {
            return len;
            }
        public String getInsert() 
        {
            return insert;
        }

        public void setRemove()
        {
             remove = dnaString;
             randomnumber1 = rand.nextInt(len-1); // System.out.println (randomnumber1);
             remove = dnaString.substring(0, randomnumber1)+dnaString.substring(randomnumber1+1);     
        }

        public String getRemove()
        {
             return remove;       
        }

        public void setChange()
        {
            
            randomnumber2 = rand.nextInt(dnaString.length());
            char catg = dnaString.charAt(randomnumber2);
            randomnumber3 = rand.nextInt(dnaString.length());
            char catg2 = dnaString.charAt(randomnumber3);

            change = dnaString.replace(catg,catg2);
            gene = "catg".charAt(rand.nextInt(4));
            location = rand.nextInt(len-1);
            change = dnaString.substring(0, location)+gene+dnaString.substring(location+1);
           

        }
        public int getrandomNumber1()
        {
            return randomnumber1;
            }

        public int getrandomNumber2()
        { 
            return randomnumber2;
        }

        public int getrandomNumber3()
        {
            return randomnumber3;
            }

        public String getChange()
        {
            return change;
        }          
}
