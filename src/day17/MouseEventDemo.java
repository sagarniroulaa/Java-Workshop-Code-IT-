package day17;

// Remaining!!

// ItemEvent -> ItemListener
// TextEvent -> TextListener
// WindowEvent -> WindowListener

/*
    Click, press, release, enter, exit, drag, move.

    Constructors:
    MouseEvent(int id, ......)

    Methods:
    int getX(), int getY() -> Mouse coordinates.
    int getClickCount() -> No. of clicks.
    int getModifiers() -> Modifiers keys pressed.

    Integer constants:
    MOUSE_PRESSED, MOUSE_RELEASED, etc.
 */

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseEventDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("FocusEvent Demo");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Click Me");
        frame.add(button);

        button.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                System.out.println("Mouse clicked at (" + e.getX()
                + "," + e.getY() + ")");
                System.out.println("Click count: " + e.getClickCount());
                System.out.println("Modifiers: " + e.getModifiers());
            }
        });

        frame.setVisible(true);
    }
}
