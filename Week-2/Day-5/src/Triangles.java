import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
    public static void mainDraw(Graphics graphics){

        int length = 20; 
        int singleHeight = HEIGHT/21;
        int xStart = 0;
        int rowWidth = WIDTH;

        for (int i = HEIGHT; i > 0; i -= singleHeight) { // goes up the y-Axis
            for (int j = xStart; j < rowWidth; j +=length) { // draws n-amount of Triangles per line
               graphics.setColor(Color.BLUE);
                graphics.drawPolygon(new int[] {j, length + j, length/2 + j}, new int[] {i, i, i-singleHeight}, 3);
            }
            rowWidth += -10;
            xStart += length/2;
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
