package day15.awt;

/*
    AWT -> Abstract Window Toolkit
    -> java.awt package
    -> Top-down hierarchy, makes it easier to understand classes.
    -> Component, Container, Panel, Frame, Label, Button, TextField, etc.
    ->
    Component -> An abstract superclass for various AWT components.
    Container -> A subclass of Component that can hold other components.

        Component -> Button, TextField, etc.
                  -> Container
                            -> Window -> Frame
                            -> Panel

    Why AWT?
    1. A basic working of its fundamentals is still important.
    2. Many AWT classes will be used directly or indirectly by Swing.

 */

/*
    Component Class:
    -> At the top of AWT hierarchy.
    -> An abstract class that encapsulates all of attributes
    of visual component.
    -> This class also defines many default methods:
        E.g., setSize(int width, int height) -> sets size of component
        setBounds(int x, int y, int width, int height)
        setVisible(boolean b)
        setEnabled(boolean b)
        setForeground(Color c)
        setFont(Font f)
        addMouseListener(MouseListener l)
        getX(), getY()
        getWidth(), getHeight()
 */

/*
    Container Class:
        -> Subclass of Component.
        -> Allows other components to be nested within them.
        -> Can store other Container objects.
        -> Container is responsible to lay out components.
 */

public class IntroToAwt {
}
