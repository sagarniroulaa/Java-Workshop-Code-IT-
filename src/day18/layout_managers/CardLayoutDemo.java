package day18.layout_managers;

/*  GridLayout:
    -> Treats each component as a card in a stack.
    -> Only one card is visible at a time.
    -> Cards are identified with a string name when added.

    next(), previous(), show(), first(), last()

    Constructors:
        CardLayout() -> no gaps
        CardLayout(int hgap, int vgap)
 */

import javax.swing.*;
import java.awt.*;

public class CardLayoutDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("CardLayout Demo");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        CardLayout cardLayout = new CardLayout();
        JPanel cardPanel = new JPanel(cardLayout);

        cardPanel.add(new JButton("This is Card 1"), "Card1");
        cardPanel.add(new JLabel("This is Card 2", JLabel.CENTER), "Card2");
        cardPanel.add(new JTextField("This is Card 3"), "Card3");

        JPanel controlPanel = new JPanel();
        JButton btnNext = new JButton("Next");
        JButton btnPrevious = new JButton("Previous");
        JButton btnShow2 = new JButton("Show Card 2");

        controlPanel.add(btnPrevious);
        controlPanel.add(btnNext);
        controlPanel.add(btnShow2);

        btnNext.addActionListener(e -> cardLayout.next(cardPanel));
        btnPrevious.addActionListener(e -> cardLayout.previous(cardPanel));
        btnShow2.addActionListener(e -> cardLayout.show(cardPanel, "Card2"));

        frame.add(cardPanel, BorderLayout.CENTER);
        frame.add(controlPanel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}
