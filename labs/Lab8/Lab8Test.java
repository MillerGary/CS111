//************************************
// Gary Miller
// CMPSC 111 Spring 2014
// Lab#
// Date: 04 09 2014
//
// Purpose: Verifiy a date is in the correct range, crunch it down to a single 
// digit and give a numerology report assigned to each single digit number
//************************************

import java.util.Date; // needed for printing today's date
import java.util.Scanner;
import java.util.Random;

public class Lab8Test
{
    //----------------------------
    // main method: program execution begins here
    //----------------------------
    public static void main(String[] args)
    {
        // Label output with name and date:
        System.out.println("Gary Miller\nLab 8\n" + new Date() + "\n");

        // Variable dictionary:
        System.out.println("Enter a date in the format mm / dd / yyyy");
        Scanner scan = new Scanner(System.in);
        String date;
        date = scan.nextLine();
        int datenum;
                
        //substring each number from input string to individual values
        String month = date.substring(0,2);
        String day = date.substring(5,7);
        String year = date.substring(10,14);
        //Verify date given
        int valyear = Integer.parseInt(year);
        int valmonth = Integer.parseInt(month);
        int valday = Integer.parseInt(day);
        
        while (date.length() != 14)
        {
            System.out.println("Invalid date enter a valide date");
            date = scan.nextLine();
        }
        
        while (date.length() == 14)
        {    
            if (valyear > 1879 && valyear < 2281)
            {    if (valmonth > 0 && valmonth < 13)
                    if (valday > 0 && valday < 32)
                        System.out.println("Date valid!");                                              date = date + 0; //prevent infinite loop
            }
            else
            
                System.out.println("Invalid date please enter a valid date");
                date = scan.nextLine();
                              
        }
        String a = month.substring(0,1);
        String b = month.substring(1,2);
        String c = day.substring(0,1);
        String d = day.substring(1,2);
        String e = year.substring(0,1);
        String f = year.substring(1,2);
        String g = year.substring(2,3);
        String h = year.substring(3,4);
               
          
        
        //Convert data from input string to int
        int i = Integer.parseInt(a);
        int j = Integer.parseInt(b);
        int k = Integer.parseInt(c);
        int l = Integer.parseInt(d);
        int m = Integer.parseInt(e);
        int n = Integer.parseInt(f);
        int o = Integer.parseInt(g);
        int p = Integer.parseInt(h);

        //Crunch numbers form birthday
        int q = i + j; //single value for month
        int r = k + l; //single value for day
        int s = m + n + o + p; //single value for year
        int t = q + r + s; //final single value

        if (t > 10) //verify final value is a single digit
        {
            String u = "" +t;
            String v = u.substring(0,1);
            String w = u.substring(1,2);
            int x = Integer.parseInt(v);
            int y = Integer.parseInt(w);
            t = x + y;
            
        }
        if (t > 10) //same loop is ran again to verify t did not become a double digit number again
        {
            String u = "" +t;
            String v = u.substring(0,1);
            String w = u.substring(1,2);
            int x = Integer.parseInt(v);
            int y = Integer.parseInt(w);
            t = x + y;
            
        }

                  
        datenum = t;
        switch ( datenum ) //run the numerology report
        {
            case 1 : System.out.println("It will be a good year");
                break;
            case 2 : System.out.println("It will not be such a good year");
                break;
            case 3 : System.out.println("Good fortune is nearby");
                break;
            case 4 : System.out.println("Money is not the greatest source of happiness");
                break;
            case 5 : System.out.println("Keep your best friends close");
                break;
            case 6 : System.out.println("Enjoy what you have, your luck will run out soon");
                break;
            case 7 : System.out.println("Keep on, keeping on");
                break;
            case 8 : System.out.println("Your true love is already in your life");
                break;
            case 9 : System.out.println("Prepare yourself for a great tragidy");
                break;
            default : System.out.println("Incorrect Value");       

        }    
    }
}




