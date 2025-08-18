package day15.swing;

/*
    Allows users to select one or more options.
    Can be checked or unchecked.

    Methods:

    setSelected(boolean b)
    isSelected()
    setText(String text)
    setEnabled(boolean b)
 */

import javax.swing.*;

public class JCheckBoxDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JCheckBox Methods Demo");
        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JCheckBox check1 = new JCheckBox("Option 1");
        check1.setBounds(30, 30, 120, 30);
        check1.setSelected(true);
        check1.setEnabled(true);

        frame.add(check1);
        frame.setVisible(true);

        System.out.println("Option 1 selected? : " + check1.isSelected());

        check1.setText("First Option");
    }
}
