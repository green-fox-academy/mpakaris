import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ChessBoard {
    public static void mainDraw(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern.

        int length = WIDTH/8, height = HEIGHT/8;
        int xStart = 0, yStart = 0;


        for (int k = 0; k < HEIGHT; k++) {

            for (int i = 0; i < WIDTH; i++) {
                graphics.setColor(Color.BLACK);
                graphics.fillRect(xStart, yStart, length, height);
                xStart += length*2;
            }
            xStart = 0;
            for (int j = 0; j < WIDTH; j++) {
                graphics.fillRect(xStart+length, yStart+length +length*k, length, length);
                xStart += length*2;
            }
            yStart = yStart+length*k;
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