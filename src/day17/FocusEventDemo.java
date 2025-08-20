package day17;

/*
    1. A component gains focus.
    2. A component loses focus.
 */

import javax.swing.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class FocusEventDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("FocusEvent Demo");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JTextField text1 = new JTextField();
        text1.setBounds(50, 50, 100, 30);
        JTextField text2 = new JTextField();
        text2.setBounds(50, 100, 100, 30);

        FocusListener focusListener = new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                System.out.println("Focus gained on: " + e.getComponent());
            }

            @Override
            public void focusLost(FocusEvent e) {
                System.out.println("Focus lost on: " + e.getComponent());
            }
        };

        text1.addFocusListener(focusListener);
        text2.addFocusListener(focusListener);

        frame.add(text1);
        frame.add(text2);
        frame.setVisible(true);
    }
}
