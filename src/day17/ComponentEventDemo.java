package day17;

/*
    This event is generated when:
    1. A component is resized.
    2. A component is moved.
    3. A component is shown or hidden.

    Constructor:
        ComponentEvent(Component source, int id)

        Here,
        source -> Refers to the object that generated this event.
        id -> Type of event (COMPONENT_RESIZED, COMPONENT_MOVED,
        SHOWN, HIDDEN).

        Method:
        Component getComponent() -> Returns the component that
                            triggered the event.
 */

import javax.swing.*;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

public class ComponentEventDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ComponentEvent Demo");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Resize Me");
        frame.add(button);

        frame.addComponentListener(new ComponentListener() {
            @Override
            public void componentResized(ComponentEvent e) {

            }

            @Override
            public void componentMoved(ComponentEvent e) {
                System.out.println("Frame Component was moved!");
            }

            @Override
            public void componentShown(ComponentEvent e) {
                System.out.println("Frame Component was shown!");

            }

            @Override
            public void componentHidden(ComponentEvent e) {
                System.out.println("Frame Component was hidden!");
            }
        });

        button.addComponentListener(new ComponentListener() {
            @Override
            public void componentResized(ComponentEvent e) {
                System.out.println("Component resized! " + e.getComponent().getSize());
            }

            @Override
            public void componentMoved(ComponentEvent e) {
                System.out.println("Component was moved!");
            }

            @Override
            public void componentShown(ComponentEvent e) {
                System.out.println("Component was shown!");
            }

            @Override
            public void componentHidden(ComponentEvent e) {
                System.out.println("Component was hidden!");
            }
        });

        frame.setVisible(true);
    }
}
