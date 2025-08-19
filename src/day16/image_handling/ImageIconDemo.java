package day16.image_handling;

/*
    ImageIcon Class:
    -> javax.swing
    -> Purpose: Convenient class for loading and displaying
                images in Swing components (JLabel, JButton).
    -> Usage: We don't have to worry about image formats.
            .jpg, .png, .gif
    -> Lightweight, but not good for advanced processing.
 */

import javax.swing.*;
import java.awt.*;

public class ImageIconDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ImageIcon Demo");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon icon = new ImageIcon("test.jpg");
        Image img = icon.getImage();
        Image scaled = img.getScaledInstance(400, 400, Image.SCALE_FAST);

        JLabel label = new JLabel(new ImageIcon(scaled));

        frame.add(label, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}
