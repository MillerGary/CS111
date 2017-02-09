//==========================================
// NAME: Gary Miller
// DATE: 03 04 14
//
// Purpose: This program sets up a window with a "drawing
// canvas". To add things to the drawing, you must
// edit the file "DrawingCanvas.java" and create your own class.
//==========================================
import javax.swing.*;
import java.util.Date;

public class Lab6
{
    public static void main(String[] args)
    {
      // Create an empty window with a title at the top:
        JFrame window = new JFrame("Gary Miller \n "+new Date());

      // Add the drawing canvas and do necessary things to
      // make the window appear on the screen!
        window.getContentPane().add(new DrawingCanvas());
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        window.pack();
    }
}
