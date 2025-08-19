package day16.image_handling;

/*
    Graphics vs Graphics2D:
        Graphics:
            Original Java class for drawing shapes, text and images.
            Methods: drawLine(), drawRect(), drawString(), drawImage()

        Graphics2D:
            Subclass of Graphics.
            Provides advanced features:
                1. Transformations: rotate, scale, shear, translate
                2. Stroke control: line thickness, dashed lines
                3. Rendering hints: smooth edges(antialiasing)
                4. Transparency: semi-transparent colors
                5. Advanced shapes: Ellipse2D, Rectangle2D

//paint() -> paintComponent()

 */

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class GraphicsVsGraphics2DDemo extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON
                );

        g2d.setColor(Color.BLUE);
        g2d.fillRect(50, 50, 100, 50);

        g2d.setColor(Color.RED);
        g2d.fill(new Ellipse2D.Double(50, 120, 80, 80));

        g2d.rotate(Math.toRadians(45), 150, 150);
        g2d.setColor(Color.BLACK);
        g2d.drawString("Rotated Text", 120, 150);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Graphics2D Demo");
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new GraphicsVsGraphics2DDemo());
        frame.setVisible(true);
    }
}
