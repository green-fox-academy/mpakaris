import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SuperHexagon {
    public static void mainDraw(Graphics graphics){

        //We assume the length = 30;
        int length = 40;
        double lengthSquared = length*(Math.sqrt(3)); //mathematical formula for Height of Hexagons
        int heightHex = (int) lengthSquared; // double to Integer!
        int x=WIDTH, y=HEIGHT;

        int Xstart = 50, YStart = HEIGHT/2 - 2*heightHex;

        for (int i = 0; i <7 ; i++) {

            if( i < 4) { // Draws column 1-4
                for (int j = 0; j < (i + 4) * heightHex; j += heightHex) {
                    int[] xCoord = {Xstart, Xstart + length, Xstart + length + length / 2, Xstart + length, Xstart, Xstart - length / 2};
                    int[] yCoord = {YStart+ j, YStart + j, YStart + heightHex / 2 + j, YStart + heightHex + j, YStart + heightHex + j, YStart + heightHex / 2 + j};
                    graphics.drawPolygon(xCoord, yCoord, 6);
                }
                Xstart += length + length / 2;
                YStart -= heightHex / 2;
            } else {
                if (i == 4) {
                    YStart += heightHex; // After the middle one --> shift down to start again
                }
                for (int k = 0; k < (10-i) * heightHex; k += heightHex) {
                    int[] x2Coord = {Xstart, Xstart + length, Xstart + length + length / 2, Xstart + length, Xstart, Xstart - length / 2};
                    int[] y2Coord = {YStart + k, YStart + k, YStart + heightHex / 2 + k, YStart + heightHex + k, YStart + heightHex + k, YStart + heightHex / 2 + k};
                    graphics.drawPolygon(x2Coord, y2Coord, 6);
                }
                Xstart += length + length / 2;
                YStart += heightHex / 2;
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
