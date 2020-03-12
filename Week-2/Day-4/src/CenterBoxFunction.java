import javax.swing.*;

import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CenterBoxFunction {

    public static void mainDraw(Graphics graphics){
        // create a function that draws one square and takes 2 parameters:
        // the square size and the graphics
        // and draws a square of that size to the center of the canvas.
        // draw 3 squares with that function.
        // avoid code duplication.
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("This program draws 3 squares to the Center. Pretty cool, right? ");

        for (int i = 0; i < 3; i++) {
            System.out.println("Biggest Square first: Whats the size of the square " + (i+1) +" ?");
            int seizeSquare = scanner.nextInt();
            System.out.println("What color, Dude?");
            System.out.println("R-value");
            int R = scanner.nextInt();
            System.out.println("G-value");
            int G = scanner.nextInt();
            System.out.println("B-value");
            int B = scanner.nextInt();
            graphics.setColor(new Color(R, G, B));
            graphics.fillRect(WIDTH/2 - seizeSquare/2, HEIGHT/2 - seizeSquare/2, seizeSquare, seizeSquare);
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
