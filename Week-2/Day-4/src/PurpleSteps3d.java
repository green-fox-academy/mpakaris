import javax.swing.*;

import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps3d {
    public static void mainDraw(Graphics graphics) {
        // Reproduce this:
        // [https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/drawing/assets/r4.png]

        Scanner scanner = new Scanner(System.in);
        System.out.println("");

        System.out.println("How many squares do you want? max 7");
        int amountSquares = scanner.nextInt();

        if (amountSquares < 8) {
            int xStartingPoint = 0, yStartingPoint = 0;
            int seize = 10;

            for (int i = 0; i < amountSquares; i++) {
                graphics.setColor(new Color(218,112,214));
                graphics.fillRect(xStartingPoint, yStartingPoint, seize, seize);
                xStartingPoint = xStartingPoint +seize;
                yStartingPoint = yStartingPoint +seize;
                seize+=10;
            }
        } else
            System.out.println("Sorry, start over!");

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