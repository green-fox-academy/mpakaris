import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ColoredBox {
    public static void mainDraw(Graphics graphics) {
        // Draw a box that has different colored lines on each edge.
        graphics.setColor(new Color(0, 0, 200));
        graphics.drawLine(0, 10, 100, 10);
        // Line 2
        graphics.setColor(new Color(100, 0, 200));
        graphics.drawLine(100, 10, 100, 50);
        // Line 3
        graphics.setColor(new Color(100, 10, 100));
        graphics.drawLine(100, 50, 0, 50);
        //Line 4
        graphics.setColor(new Color(1, 50, 0));
        graphics.drawLine(0, 10, 0, 50);


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