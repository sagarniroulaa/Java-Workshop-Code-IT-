package day17;

/*
    AdjustmentEvent Class:

    This event is generated:
    1. A scrollbar is adjusted.
    2. An adjustable component is changed.

    Constructors:
        AdjustmentEvent(Adjustable source, int id, int type, int value)

        Here,
        source -> Reference to the object that generated this event.
        id -> Event type (AdjustmentEvent.ADJUSTMENT_VALUE_CHANGED).
        type -> Type of adjustment (UNIT_INCREMENT, BLOCK_DECREMENT, etc.)
        value -> Current value of the adjustable component.

        Methods:
        int getValue() -> Returns current value.
        int getAdjustmentType() -> Returns type of adjustment.
        Adjustable getAdjustable() -> Returns the adjustable component.

        INTEGER CONSTANT:
        UNIT_INCREMENT, UNIT_DECREMENT,
        BLOCK_INCREMENT, BLOCK_DECREMENT,
        TRACK (The slider was dragged.)
 */

import javax.swing.*;

public class AdjustmentEventDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("AdjustmentEvent Demo");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JScrollBar scrollBar = new JScrollBar(JScrollBar.HORIZONTAL,
                0, 10, 0, 100);
        frame.add(scrollBar);

        scrollBar.addAdjustmentListener(e -> {
            System.out.println("Adjustment Event Occurred!");
            System.out.println("Value: " + e.getValue());
            System.out.println("Adjustment Type: " + e.getAdjustmentType());
        });

        frame.setVisible(true);
    }
}
