
//************************************
// Gary Miller
// CMPSC 111 Spring 2014
// Practical3
// Date: 01 31 2014
//
// Purpose: Basic input with dialog boxes
//************************************

import javax.swing.JOptionPane;

public class Practical3
{
    public static void main(String[] args)
    {
        // display a dialog with a message
        JOptionPane.showMessageDialog( null, "Welcome!" );

        // promt user to enter name
        String name = JOptionPane.showInputDialog(" What is you name?");
        //create a message
        String message = String.format ("Thank you, %s ", name);
        // promt user to enter birthday
        String birthday = JOptionPane.showInputDialog(" What is your birthday?");
        //create a message
        String msg = String.format ("Thank you, that is my birthday too, %s ", birthday);
        //display the message to welcome the user by name
         JOptionPane.showMessageDialog(null, msg);       
     }
}

