package day18.layout_managers;

/*
    -> Most flexible layout manager in Swing.
    -> Unlike GridLayout:
        Cells can have different sizes.
        A component can span multiple rows and/or columns.
        Space can be distributed unevenly using weights.

    -> We must define a set of rules using GridBagConstraints.

    Key Properties:
    gridx, gridy -> The column(x) and row(y) position of the component.

    gridwidth, gridheight -> How many columns or rows the component should span.

    weightx, weighty -> How extra space is distributed horizontally and vertically.
    E.g., weightx = 1 means the component grows horizontally when window is resized.

    fill -> How the component fills its cell.
        NONE, HORIZONTAL (Stretches horizontally), VERTICAL(Stretches vertically), BOTH

    anchor -> Position inside the cell if it does not fill.
    E.g., GridBagConstraints.NORTH, SOUTH, EAST, WEST, CENTER

    Constructors:
        GridBagLayout()

        Used together with GridBagConstraints for precise control.
 */

import javax.swing.*;
import java.awt.*;

/*
    [0,0] [1,0] [2,0] ...
    [0,1] [1,1] [2,1] ...
 */

public class GridBagLayoutDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GridBagLayout Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();

        JButton b1 = new JButton("Button 1");
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        frame.add(b1, gbc);

        JButton b2 = new JButton("Button 2");
        gbc.gridx = 1;
        gbc.gridy = 0;
        frame.add(b2, gbc);

        JButton b3 = new JButton("Button 3 (span 2 cols)");
        gbc.gridx = 0;
        gbc. gridy = 1;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        frame.add(b3, gbc);

        JButton b4 = new JButton("Button 4 (grows)");
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.fill = GridBagConstraints.BOTH;
        frame.add(b4, gbc);

        JButton b5 = new JButton("Button 5");
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.NONE;
        frame.add(b5, gbc);

        frame.setSize(500, 300);
        frame.setVisible(true);
    }
}
