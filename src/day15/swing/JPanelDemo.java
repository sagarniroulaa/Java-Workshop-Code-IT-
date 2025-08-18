package day15.swing;

import javax.swing.*;
import java.awt.*;

/*
    Can hold other components like buttons, etc.
    Supports layout managers.

    Useful methods:

    setBackground(Color c)
    setLayout()
    add(Component c)
    remove()
    repaint()
    setPreferredSize(Dimension d)
 */
public class JPanelDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JPanel Demo");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBackground(Color.LIGHT_GRAY);
        frame.add(panel);

        frame.setVisible(true);
    }
}
