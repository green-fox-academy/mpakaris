import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
    public static void mainDraw(Graphics graphics){

        // Violet lines
        int xStartTopLeft = 20, yStartTopLeft = 10, yOffset = 30;
        int xStartBottomRight = WIDTH-10, yStartBottomRight = HEIGHT-20, xOffset = 300;

        for (int i = 0; i < 7;  i++) {
        graphics.setColor(new Color(238,130,238));
        graphics.drawLine(xStartTopLeft, yStartTopLeft, WIDTH, yOffset);
        yOffset +=30;
        }

        for (int i = 0; i <7;  i++) {
            graphics.setColor(new Color(238,130,238));
            graphics.drawLine(xStartBottomRight, yStartBottomRight, xOffset, 0);
            xOffset -=30;
        }

        // Green Lines
       /*xOffset = 10; yOffset = 10;

        for (int i = 0; i < 11;  i++) {
            graphics.setColor(new Color(50,205,50));
            graphics.drawLine(xStartTopLeft, yStartTopLeft, xOffset, HEIGHT);
            xOffset +=30;
        }

        for (int i = 0; i < 11;  i++) {
            graphics.setColor(new Color(50,205,50));
            graphics.drawLine(xStartBottomRight, yStartBottomRight, 0, yOffset);
            yOffset +=30;
        } */

        // Draw an ellipse to cover the lines in the Middle

        //graphics.drawOval(0, 0, 100, 320);




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
