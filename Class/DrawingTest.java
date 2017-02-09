//==========================================
// gary Miller
// February 17, 2014
//
// Purpose: This program sets up a window with a "drawing
// canvas". To add things to the drawing, you must
// edit the file "DrawingCanvas.java".
//==========================================
import javax.swing.*;
import java.util.Date;

public class DrawingTest
{
    public static void main(String[] args)
    {
      // Create an empty window with a title at the top:
        JFrame window = new JFrame("Gary Miller"+new Date());

      // Add the drawing canvas and do necessary things to
      // make the window appear on the screen!
        window.getContentPane().add(new BasicGraphics());
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        window.pack();
    }
}
