package day15.awt;

import java.awt.*;

/*
    Paint() method:
        -> Overridden by Container and Window.

    -> void paint(Graphics context)

    -> repaint()

    -> void drawString(String message, int x, int y)
    E.g., context.drawString("Welcome to My Application", 50, 50);
 */
public class PaintMethodDemo extends Frame {
    String msg;
    public PaintMethodDemo() {
        setSize(400, 300);
        setVisible(true);
    }

    public void paint(Graphics g) {
        g.drawString("Hello AWT!", 100, 100);
        g.drawRect(50, 120, 100, 50);
        // void drawRect(int left, int top, int width, int height)

        g.drawOval(200, 120, 80, 80);
        // void drawOval(int left, int top, int width, int height)

        g.drawLine(50, 200, 200, 200);
        // void drawLine(int startX, int startY, int endX, int endY)
    }

    public static void main(String[] args) {
        new PaintMethodDemo();
    }
}
