package day16.image_handling;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class BufferedImageGraphicsDemo {
    public static void main(String[] args) {
//        width, height, BufferedImage.TYPE_INT_ARGB
        BufferedImage img = new
                BufferedImage(200, 200, BufferedImage.TYPE_INT_ARGB);

        Graphics2D g = img.createGraphics();
        g.setColor(Color.YELLOW);
        g.fillRect(0, 0, 200, 200);
        g.setColor(Color.RED);
        g.fillOval(50, 50, 100, 100);
        g.dispose();

        JFrame frame = new JFrame("BufferedImage Graphics Demo");
        frame.setSize(250, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new JLabel(new ImageIcon(img)));

        frame.setVisible(true);
    }
}
