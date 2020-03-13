import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SuperHexagon {
    public static void mainDraw(Graphics graphics){

        //We assume the length = 30;
        int length = 20;
        double lengthSquared = length*(Math.sqrt(3)); //mathematical formula for Height of Hexagons
        int heightHexagon = (int) lengthSquared; // double to Integer!
        int x=WIDTH, y=HEIGHT;

        int XstartingPoint = 50, YstartingPoint = HEIGHT/2 - 2*heightHexagon;

        for (int i = 0; i <7 ; i++) {

            if( i < 4) { // Draws column 1-4
                for (int j = 0; j < (i + 4) * heightHexagon; j += heightHexagon) {
                    int[] xCoord = {XstartingPoint, XstartingPoint + length, XstartingPoint + length + length / 2, XstartingPoint + length, XstartingPoint, XstartingPoint - length / 2};
                    int[] yCoord = {YstartingPoint + j, YstartingPoint + j, YstartingPoint + heightHexagon / 2 + j, YstartingPoint + heightHexagon + j, YstartingPoint + heightHexagon + j, YstartingPoint + heightHexagon / 2 + j};
                    graphics.drawPolygon(xCoord, yCoord, 6);
                }
                XstartingPoint += length + length / 2;
                YstartingPoint -= heightHexagon / 2;
            } else {
                if (i == 4) {

                    YstartingPoint += heightHexagon;
                }
                for (int k = 0; k < (10-i) * heightHexagon; k += heightHexagon) {
                    int[] x2Coord = {XstartingPoint, XstartingPoint + length, XstartingPoint + length + length / 2, XstartingPoint + length, XstartingPoint, XstartingPoint - length / 2};
                    int[] y2Coord = {YstartingPoint + k, YstartingPoint + k, YstartingPoint + heightHexagon / 2 + k, YstartingPoint + heightHexagon + k, YstartingPoint + heightHexagon + k, YstartingPoint + heightHexagon / 2 + k};
                    graphics.drawPolygon(x2Coord, y2Coord, 6);
                }
                XstartingPoint += length + length / 2;
                YstartingPoint += heightHexagon / 2;
            }
        }
    }

    // Don't touch the code below
    static int WIDTH = 420;
    static int HEIGHT = 420;

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
