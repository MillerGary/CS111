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
    
    String bullseye = "BULLSEYE!!!";  

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
        super.paintComponent(page);
        page.setColor (Color.BLACK);
        int endpoint = 600;
        for (int x = 100; x<= 600; x += 10)
        {
            endpoint = endpoint - 20;
            int y = x + 10;
            page.drawOval(x, y, endpoint, endpoint);

        }
        page.drawString (bullseye, 150, 50);
        page.drawRect (140, 30, 100, 25);
        page.drawLine (250, 400, 390, 400);
        page.drawLine (390, 400, 350, 375);
        page.drawLine (390, 400, 350, 425);


    
    }
}
