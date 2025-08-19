package day16.swing_componets_remaining;

import javax.swing.*;

// Rem -> Event Handlers and Layout Managers

public class JRadioButtonDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JScrollPane Demo");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

        JRadioButton rb1 = new JRadioButton("Option 1");
        JRadioButton rb2 = new JRadioButton("Option 2");
        JRadioButton rb3 = new JRadioButton("Option 3");

        ButtonGroup group = new ButtonGroup();
        group.add(rb1);
        group.add(rb2);
        group.add(rb3);

        frame.add(rb1);
        frame.add(rb2);
        frame.add(rb3);

        frame.setVisible(true);
    }
}
