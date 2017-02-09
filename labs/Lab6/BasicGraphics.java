import javax.swing.JApplet;
import java.awt.*;

public class BasicGraphics extends javax.swing.JApplet  {
   public void paint(Graphics g) {
       int x = 50;
       int y = 60;
       int z = 200;
       int q = 200;
      /* Draw ten ovals. */
       for(int i=0; i < 10; i++)
       {
            g.setColor(Color.red);
            g.fillOval(x, y, z, q);
            x = x+50;
            y = y+30;
            z = z-20;
            q = q-20;
       }
    }  // end paint()
} // end class BasicSwingGraphics
