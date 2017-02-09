//************************************
// Gary Miller
// CMPSC 111 Spring 2014
// Class Exercise
// Date: 02 17 2014
//
// Purpose: Create methods for rock paper scisssors game
//***********************************
import java.util.random
public class RockPaperScissors
{
    //create instance variables
    private char rps;
    private char firstplayer;
    Random rand = new random();

    //Default Constructor
    public RockPaperScissors
    {
    
    }
    
    //Method to select a random player
    public void setFirstplayer (String name1, String name2)
    {
        char character1 = name1.chatAt(0);
        char character2 = name2.chatAt(0);
        String comboname = ""+character1+""+character2;

        int position = rand.nextInt(2);
        firstPlayer = comboname.chatAt(position);

    }
    //method to return random player
    public char getFirstPlayer ()
    {
        return firstPlayer;
    }

    //Method to select rock, paper, or scissor as 'R', 'P', or 'S'
    public void setRPS (String input)
    {
        int position = rand.nextInt(3);
        rps = input.chatAt(position);
    }

    //Method to return the 'R', 'P', or 'S'
    public char getRPS ();
    {
        return rps;
    }

}
