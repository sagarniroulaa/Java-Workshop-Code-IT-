package day15.swing;

import javax.swing.*;
import java.awt.*;

/*
    Can display text or icon.
    Usually added to a container (JFrame or JPanel).

    Methods:
    setText(String text)
    setIcon(Icon icon)
    addActionListener(ActionListener l)
    setEnabled(boolean b)
    setBackground(Color c)
    setForeground(Color c)
    setFont(Font f)
 */
public class JButtonDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JButtonDemo");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JButton button = new JButton("Click Me!");
        button.setBounds(100, 50, 200, 50);
        button.setBackground(Color.CYAN);
        button.setForeground(Color.MAGENTA);
        button.setFont(new Font("Arial", Font.BOLD, 16));
        button.setEnabled(false);

        frame.add(button);
        frame.setVisible(true);
    }
}
