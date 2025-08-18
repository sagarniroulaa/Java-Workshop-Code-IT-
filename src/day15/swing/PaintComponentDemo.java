package day15.swing;

/*
    AWT -> paint()
    Swing -> paintComponent()
 */

import javax.swing.*;
import java.awt.*;

public class PaintComponentDemo extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Clear the background to prevent painting over old drawings.
        g.setColor(Color.BLUE);
        g.drawLine(50, 50, 200, 50);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Drawing Demo");
        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new PaintComponentDemo());
        frame.add(new JLabel("Student"));
        frame.setVisible(true);
    }
}
