package day17;

/*
    ActionEvent Class:

    This event is generated:
    1. A button is pressed.
    2. A list item is double-clicked.
    3. A menu item is selected.

    Constructors:
        ActionEvent(Object src, int type, String cmd)
        ActionEvent(Object src, int type, String cmd, int modifiers)
        ActionEvent(Object src, int type, String cmd, long when, int modifiers)

        src -> Reference to object that generated this event.
        type -> Specifies type of event.
        cmd -> Specify command string.
        modifiers -> ALT, CTRL, META, SHIFT were pressed when the event
        was generated.
        when -> Specifies when the event occurred.

        Methods:
        String getActionCommand() => Command name return

        int getModifiers() => Returns a value that indicates which
        modifier keys were pressed when generating that event.

        long getWhen() => Returns the time at which the event took place.

 */

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEventDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ActionEvent Demo");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        /*
            I must set position and size for every component using setBounds(x, y, width, height).
         */

        JButton button = new JButton("Click Me");
        button.setBounds(50, 50, 120, 30);
        frame.add(button);

        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("File");
        JMenuItem menuItem = new JMenuItem("Open");
        menu.add(menuItem);
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);

        button.addActionListener(new ActionListener() { // Anonymous Class
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button is pressed!");
                System.out.println("Action Command: " + e.getActionCommand());
                System.out.println("Modifiers: " + e.getModifiers());
                System.out.println("Event Time: " + e.getWhen());
            }
        });

        menuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Menu item was selected!");
                System.out.println("Action Command: " + e.getActionCommand());
                System.out.println("Modifiers: " + e.getModifiers());
                System.out.println("Event Time: " + e.getWhen());
            }
        });

        frame.setVisible(true);
    }
}
