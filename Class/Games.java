//************************************
// Gary Miller
// CMPSC 111 Spring 2014
// Class Exercise
// Date: 02 17 2014
//
// Purpose: Simulate rock paper scissors
//************************************

import java.util.Date; // needed for printing today's date
import java.util.Scanner;
public class Games
{
    //----------------------------
    // main method: program execution begins here
    //----------------------------
    public static void main(String[] args)
    {
        // Label output with name and date:
        System.out.print.ln("Gary Miller" + new Date() + "\n");

        RockPaperScissors game1 = new RockpaperScissors();

        Scanner scan = new Scanner (system.in);

        //Ask user to enter players' names
        System.out.println(" Please enter the first user's name ");
        String name1 = scan.next();
        System.out.println(" Please the the sencond player's name ");
        String name2 = scan.next();

        //call the random player selection method
        //notify the user who will go first
        game1.setFirstPlayer(name1, name2);
        System.out.println(" Based on random selection, a person with initial "+game1.getFirstPlayer()+ "will start the game first");
