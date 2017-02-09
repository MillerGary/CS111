//=================================================
//
//=================================================
import java.awt.*;
import javax.swing.*;
import java.util.*;

public class DrawingCanvas extends JPanel
{
    public static final int WIDTH = 600;   // canvas width, in pixels
    public static final int HEIGHT = 400;  // canvas height, in pixels
    private Random rand;  

    // CONSTRUCTOR:
    //------------------------------------------------
    // Construct a new DrawingCanvas of fixed size and
    // a white background. Initialize a random number generator
    //------------------------------------------------
    public DrawingCanvas()
    {
        this.setPreferredSize(new Dimension(WIDTH,HEIGHT));
        this.rand = new Random();
    }

    //-------------------------------------------------
    // Use Graphics methods to add content to the drawing canvas
    //-------------------------------------------------
    public void paintComponent(Graphics page)
    {
        page.setColor(Color.red);
        page.drawOval (200, 100, 80, 160);
        page.drawLine (300, 250, 350, 100);
        page.drawLine (230, 160 , 260, 160);
        page.drawLine (350, 250, 300, 100);
        page.drawString ("Prints letters for theta chi", 50, 50);
         

    }
}
