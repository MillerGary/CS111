//************************************
// Gary Miller
// CMPSC 111 Spring 2014
// Practical9
// Date: 04 25 2014
//
// Purpose: count the number of words in a program
//************************************
import java.util.ArrayList;

public class Count
{
    int array [];

    // empty constructor
    public Count()
    {
    }

    // method that prints out the array list from the other class
    public void setArrayList(ArrayList<String> a)
    {
        System.out.println("Printing from OTHER class: "+a);
    }

    // method that takes an array,  changes its values and prints it out
    public int[] changeArray(int[] a)
 
