//************************************
// Gary Miller
// CMPSC 111 Spring 2014
// Lab#
// Date: 04 25 2014
//
// Purpose: count the number of distinct words in a book
//************************************

import java.util.*;
import java.io.*;

public class Practical9
{
    //----------------------------
    // main method: program execution begins here
    //----------------------------
    public static void main(String[] args) throws IOException
    {
        // Label output with name and date:
        System.out.println("Gary Miller\nPractical9\n" + new Date() + "\n");

        // Variable dictionary:
        int numwords = 0;
        int a = 0;
        File file = new File("WarAndPeace.txt");

        ArrayList<String> words = new ArrayList<String>();
        Scanner in = new Scanner(file);
        while (in.hasNext());
        {
            String x = in.next().toLowerCase(); // ignore case
            if (words.contains(x))
                ++a;
            else
                ++numwords;               
              

        }
        System.out.println("Number of distinct words: " +numwords);
    }
}     

