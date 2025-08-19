package day16.image_handling;
/*
    Image:
    -> java.awt
    -> Abstract superclass for all images, can't be directly instantiated.
    -> Allows scaling, transformations and drawing.

    Methods:
        getScaledInstance(width, height, hints) -> resizes image
        Graphics.drawImage() -> for rendering images

    Hints:
        Image.SCALE_SMOOTH -> Prioritizes quality over speed.
        Image.SCALE_FAST -> Prioritizes speed over quality.
        Image.SCALE_DEFAULT -> Balances speed and quality.
        Image.SCALE_REPLICATE -> Prioritizes speed over quality.
        Image.SCALE_AREA_AVERAGING -> Uses area averaging algorithm.

 */
public class ImageDemo {
}
