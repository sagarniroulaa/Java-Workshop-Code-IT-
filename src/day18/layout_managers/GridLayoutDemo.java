package day18.layout_managers;

/*
    -> Rectangular grid arrangement (rows x columns)
    -> Each cell is the same size (width and height)
    -> Components are row by row, left to right.
    -> If the container is resized, all cells resize equally.

    Constructors:
        GridLayout() -> 1 row, 0 column (as many columns as needed)
        GridLayout(int rows, int cols)
        GridLayout(int rows, int cols, int hgap, int vgap)
 */

import javax.swing.*;
import java.awt.*;

public class GridLayoutDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GridLayout Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        frame.setLayout(new GridLayout(6, 1));

        for(int i=1;i<=6;i++) {
            frame.add(new JButton("Button " + i));
        }

        frame.setVisible(true);
    }
}
