package day15.swing;

import javax.swing.*;

/*
    Top-level window

    JFrame()
    JFrame(String title)

    Methods:
        setSize()
        setVisible()
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) -> closes on exit
        setTitle(String title)
 */
public class JFrameDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My First Swing Frame");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
