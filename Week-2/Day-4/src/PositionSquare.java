import javax.swing.*;

import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PositionSquare {

    public static void mainDraw(Graphics graphics){
        // create a function that draws one square and takes 3 parameters:
        // the x and y coordinates of the square's top left corner and the graphics
        // and draws a 50x50 square from that point.
        // draw 3 squares with that function.
        // avoid code duplication.

        for (int i = 0; i < 3; i++) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Parameters needed: ");
        System.out.println("x-Coordinate of starting point: ");
        int xStartingCoordinate = scanner.nextInt();
        System.out.println("y-Coordinate of starting point: ");
        int yStartingCoordinate = scanner.nextInt();
        System.out.println("What color, Dude?");
        System.out.println("R-value");
        int R = scanner.nextInt();
        System.out.println("G-value");
        int G = scanner.nextInt();
        System.out.println("B-value");
        int B = scanner.nextInt();
        graphics.setColor(new Color(R, G, B));
        graphics.fillRect(xStartingCoordinate, yStartingCoordinate, 50, 50);
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