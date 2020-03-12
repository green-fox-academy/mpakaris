import javax.swing.*;

import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps {
    public static void mainDraw(Graphics graphics) {
        // Reproduce this:
        // [https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/drawing/assets/r3.png]
        Scanner scanner = new Scanner(System.in);
        System.out.println("");


        System.out.println("How many squares do you want? ");
        int amountSquares = scanner.nextInt();

        if (amountSquares < 33) {
            int xStartingPoint = 0, yStartingPoint = 0;
            for (int i = 0; i < amountSquares; i++) {
            graphics.setColor(new Color(218,112,214));
            graphics.fillRect(xStartingPoint, yStartingPoint, 10, 10);
            xStartingPoint +=10;
            yStartingPoint +=10;
            }
        } else
            System.out.println("Sorry, max amount squares is 32.");
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