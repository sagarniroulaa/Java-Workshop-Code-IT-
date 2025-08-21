package day18.layout_managers;

/*
    FlowLayout:
        -> By default, direction of layout is left to right,
        and top to bottom.
        -> A small space is left between each component, above and below
        as well as left and right.

        Constructors:
            FlowLayout() (By default gives 5px space)
            FlowLayout(int how)
            FlowLayout(int how, int horz, int vert)

            how: FlowLayout.LEFT, CENTER, RIGHT, LEADING, TRAILING
 */

import javax.swing.*;
import java.awt.*;

public class FlowLayoutDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("FlowLayout Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FlowLayout layout = new FlowLayout(FlowLayout.RIGHT);
        JPanel panel = new JPanel(layout);

        for (int i=1;i<=5;i++) {
            panel.add(new JButton("Button " + i));
        }

        frame.add(panel);
        frame.setSize(400, 200);
        frame.setVisible(true);
    }
}
