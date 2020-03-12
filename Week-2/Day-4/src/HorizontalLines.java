import javax.swing.*;

import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class HorizontalLines {
    public static void mainDraw(Graphics graphics) {
        // Create a function that draws a single line and takes 3 parameters:
        // The x and y coordinates of the line's starting point and the graphics
        // and draws a 50 long horizontal line from that point.
        // Draw at least 3 lines with that function using a loop.

        System.out.println();
        System.out.println("This program makes some crazy stuff. Try it out.");
        System.out.println("How many Lines do you plan drawing: ");
        Scanner scanner = new Scanner(System.in);
        int amountLines = scanner.nextInt();

        for (int i = 0; i < amountLines; i++) {
            System.out.println();
            System.out.println("Please enter the Coordinates for your line: ");
            System.out.println("X-Coordinate of your Starting Point: ");
            int xCoordinate = scanner.nextInt();
            System.out.println("Y-Coordinate of your Starting Point: ");
            int yCoordinate = scanner.nextInt();
            System.out.println("X-Coordinate of your Landing Point: ");
            int xCoordinateLandingPoint = scanner.nextInt();
            System.out.println("Y-Coordinate of your Landing Point: ");
            int yCoordinateLandingPoint = scanner.nextInt();
            System.out.println("RBG Colour R: ");
            int colourR = scanner.nextInt();
            System.out.println("RBG Colour G: ");
            int colourG = scanner.nextInt();
            System.out.println("RBG Colour B: ");
            int colourB = scanner.nextInt();
            int xCoordinateHorizontalLine = xCoordinate+50;
            //Draws line:
            graphics.setColor(new Color (colourR, colourG, colourB));
            graphics.drawLine(xCoordinate, yCoordinate, xCoordinateLandingPoint, yCoordinateLandingPoint);
            //Draw second horizontal line:
            graphics.drawLine(xCoordinateLandingPoint, yCoordinateLandingPoint, xCoordinateHorizontalLine, yCoordinateLandingPoint);
        }

        System.out.println();
        System.out.println("Thank you for using MPAK-DrawING Services!");

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