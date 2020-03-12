import javax.swing.*;
import java.io.InterruptedIOException;
import java.util.Date;
import java.util.Timer;
import java.awt.*;
import java.util.TimerTask;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
    public static void mainDraw(Graphics graphics) {
        // Create a square drawing function that takes 3 parameters:
        // The square size, the fill color, graphics
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares
        // (red, orange, yellow, green, blue, indigo, violet).

        System.out.println();
        System.out.println("See how the square changes colours every 5 seconds....");
        int seize = 200;
        /*Color red = new Color(255, 0, 0);
        Color orange = new Color(255,165,0);
        Color yellow = new Color(255,255,0);
        Color green = new Color(0,255,0);
        Color blue = new Color(65,105,225);
        Color indigo = new Color(75,0,130);
        Color violet = new Color(218,112,214); */

        Color[] colorArray = new Color[]{Color.red, Color.orange, Color.yellow, Color.green, Color.blue};

        for (int i = 0; i < colorArray.length; i++) {

            Color colorSet = colorArray[i];
            graphics.setColor(colorSet);
            graphics.fillRect(WIDTH/2-seize/2, HEIGHT/2-seize/2, seize, seize);

            for(int j = 0; j< 5; j++) {
                try {
                    //sending the actual Thread of execution to sleep X milliseconds
                    Thread.sleep(1000);
                } catch(Exception e) {
                    System.out.println("Exception : "+e.getMessage());
                }
                System.out.println("Hello world!");
            }
        }
    }



    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}