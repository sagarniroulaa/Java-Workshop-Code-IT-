package day16.swing_componets_remaining;

import javax.swing.*;

public class JScrollPaneDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JScrollPane Demo");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextArea textArea = new JTextArea(20, 30);
        for (int i=1;i<=50;i++) {
            textArea.append("This is a line number " + i + "\n");
        }

        JScrollPane scrollPane = new JScrollPane(
            textArea,
            JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
            JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED
        );

        frame.add(scrollPane);
        frame.setVisible(true);
    }
}
