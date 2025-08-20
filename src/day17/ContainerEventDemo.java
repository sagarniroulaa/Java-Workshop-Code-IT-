package day17;

/*
    1. A component is added to a container.
    2. A component is removed from a container.

    Constructor:
        ContainerEvent(Container source, int id, Component child)

        Here,
        source
        id -> (COMPONENT_ADDED, COMPONENT_REMOVED)
        child -> Component that was added or removed.

        Methods:
        Component getChild() -> Returns the child that was added or removed.
        Container getContainer() -> Returns the container where the event occured.

        Integer constants:
        COMPONENT_ADDED, COMPONENT_REMOVED
 */

import javax.swing.*;
import java.awt.event.ContainerEvent;
import java.awt.event.ContainerListener;

public class ContainerEventDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ActionEvent Demo");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);

        panel.addContainerListener(new ContainerListener() {
            @Override
            public void componentAdded(ContainerEvent e) {
                System.out.println("Component Added: " + e.getChild());
            }

            @Override
            public void componentRemoved(ContainerEvent e) {
                System.out.println("Component Removed: " + e.getChild());
            }
        });

        JButton addButton = new JButton("Add Button");
        addButton.addActionListener(e -> panel.add(new JButton("New")));
        frame.add(addButton, "South");

        frame.setVisible(true);
    }
}
