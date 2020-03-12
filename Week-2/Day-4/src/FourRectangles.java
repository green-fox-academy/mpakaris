import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

    public static void mainDraw(Graphics graphics){
        // draw four different size and color rectangles.
        // avoid code duplication.

        Random random = new Random(); // Creates random RGB Number for the first Rectangle
        int X = 5, Y = 50;
        int R = 100, G = 50, B = 20;

        while (R < 0 || R > 255) {
            R = random.nextInt();
            System.out.println(R);
        }
        while (B < 0 || B > 255) {
            B = random.nextInt();
            System.out.println(B);
        }
        while (G < 0 || G > 255) {
            G = random.nextInt();
            System.out.println(G);
        }

        for (int i = 0; i < 4; i++) {
            int xCoordinate;
            graphics.setColor(new Color(R, G, B));
            graphics.fillRect(X, Y, 30, 30);
            X += 50;

            // Fun Solution: Random RBG Colour!
            while (R < 0 || R > 255) {
                R = random.nextInt();
            }
            while (B < 0 || B > 255) {
                B = random.nextInt();
            }
            while (G < 0 || G > 255) {
                G = random.nextInt();
            }
            // Solution 1
            // R += 30;
            // B += 30;
            // G += 30;
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