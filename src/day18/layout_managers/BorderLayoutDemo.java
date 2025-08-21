package day18.layout_managers;

/*
    Five regions:
    NORTH, SOUTH, EAST, WEST, CENTER (by default)

    -> CENTER region expands to fill any unused space.

    Constructors:
        BorderLayout() -> No gaps.
        BorderLayout(int hgap, int vgap)
 */

import javax.swing.*;
import java.awt.*;

public class BorderLayoutDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("BorderLayout Demo");
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout(10, 10));

        frame.add(new JButton("North"), BorderLayout.NORTH);
        frame.add(new JButton("South"), BorderLayout.SOUTH);
//        frame.add(new JButton("West"), BorderLayout.WEST);
//        frame.add(new JButton("East"), BorderLayout.EAST);
        frame.add(new JButton("CENTER"), BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
