package day16.image_handling;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/*
    BufferedImage Class:
        -> Subclass of Image.
        -> Represents an image stored entirely in memory (a raster
        of pixels).
        -> Pixels are stored as 32-bit integers: 8 bits each for
        Alpha, Red, Green, Blue (ARGB).
        -> Unlike ImageIcon or Image, it allows direct pixel-level
        access.

        Methods:
        getRGB(x, y)
        setRGB(x, y, rgb)

        Can draw shapes, text, or other images on top.

        ImageIO.read() and ImageIO.write() for JPG, PNG, GIF, etc.

        Advanced Image processing: Filters, transparency, cropping,
        scaling, drawing overlays.
 */
public class BufferedImageDemo {
    public static void main(String[] args) {
        try {
            BufferedImage img = ImageIO.read(new File("test2.jpeg"));
            System.out.println("Image loaded: " + img.getWidth() + "x" + img.getHeight());

            ImageIO.write(img, "png", new File("buffered_output.png"));
            System.out.println("Image saved as buffered_output.png");
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
