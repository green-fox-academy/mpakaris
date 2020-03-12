import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {
    public static void mainDraw(Graphics graphics) {
        // Create a function that draws a single line and takes 3 parameters:
        // The x and y coordinates of the line's starting point and the graphics
        // and draws a line from that point to the center of the canvas.
        // Fill the canvas with lines from the edges, every 20 px, to the center.

        int widthHalf = WIDTH/2;
        int heightHalf = HEIGHT/2;

        int x = 0;
        while (x<=WIDTH) {
            graphics.drawLine(widthHalf, heightHalf, x, 0);
            x += 20;
        }

        int y = 0;
        while (y <= HEIGHT) {
            graphics.drawLine(widthHalf, heightHalf, 0, y);
            y += 20;
        }

        int x1 = 0;
        while (x1 <= WIDTH) {
            graphics.drawLine (widthHalf, heightHalf, x1, 320);
            x1 += 20;
        }

        int y1 = 0;
        while (y1 <= HEIGHT) {
            graphics.drawLine (widthHalf, heightHalf, 320, y1);
            y1 += 20;
        }
    }

    // region Don't touch the code below
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
    //endregion
}