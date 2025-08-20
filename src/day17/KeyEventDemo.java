package day17;

/*
    A key is pressed, released or typed.

    Methods:
    int getKeyCode() -> Returns key code.
    VK_ALT, VK_DOWN, VK_SHIFT
    char getKeyChar() -> Returns typed character.
    int getModifiers() ->
 */

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyEventDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("FocusEvent Demo");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField textField = new JTextField();
        frame.add(textField);

        // KeyListener -> KeyAdapter
        textField.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                System.out.println("Key Pressed: " + e.getKeyChar());
                System.out.println("Key Code: " + e.getKeyCode());
                System.out.println("Modifiers: " + e.getModifiers());
            }
        });

        frame.setVisible(true);
    }
}
