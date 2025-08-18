package day15.awt;

import java.awt.*;

/*
    Window -> Top-level window, it is not contained within any other object.

    Frame:
        -> Frame is a subclass of Window.
        -> 1. Title Bar
            2. Menu Bar
            3. Borders
            4. Resizing corners.

    HeadlessException -> If an attempt is made to create a Frame instance in an
    environment that does not support user interaction.

     Constructors:
        Frame() throws HeadlessException
        Frame(String title) throws HeadlessException

    Methods:
        setSize(), getSize(), setVisible(), setTitle()
 */

public class ContainerDemo {
    public static void main(String[] args) {
        Frame f = new Frame();
        f.setTitle("Container Demo");
        f.setSize(400, 200);
        f.setLayout(new FlowLayout());

        Label label = new Label("Name: ");
        TextField tf = new TextField(20);
        Button btn = new Button("Submit");

        f.add(label);
        f.add(tf);
        f.add(btn);

        f.setVisible(true);
    }
}
