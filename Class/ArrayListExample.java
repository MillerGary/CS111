//************************************
// Gary Miller
// CMPSC 111 Spring 2014
// Lab#
// Date: mmm dd yyyy
//
// Purpose: Read a text file (words.txt) and we will print out all the words
// in the text file, print the words in reverse order, remove plural words
//************************************

import java.util.Date; // needed for printing today's date
import java.util.*;
import java.io.*;

public class ArrayListExample
{
    //----------------------------
    // main method: program execution begins here
    //----------------------------
    public static void main(String[] args) throws IOException
    {
        // Label output with name and date:
        System.out.println("Gary Miller\nClassExample\n" + new Date() + "\n");

        // Variable dictionary:
        ArrayList<String> allWords = new ArrayList<String>();

        // read file
        File file = new File("Words.txt");
        Scanner scan = new Scanner(file);

        //iterate through the file
        while(scan.hasNext())
        {
            String word = scan.next();
            allWords.add(word);
        }
        System.out.println(allWords);

     }
}

