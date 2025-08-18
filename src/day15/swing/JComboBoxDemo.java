package day15.swing;

import javax.swing.*;

public class JComboBoxDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JComboBox Methods Demo");
        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JComboBox<String> combo = new JComboBox<>();
        combo.addItem("Apple");
        combo.addItem("Banana");
        combo.addItem("Cherry");

        combo.setSelectedItem("Banana");

        System.out.println("Selected item: " + combo.getSelectedItem());

        combo.setBounds(50, 50, 150, 30);
        frame.add(combo);
        frame.setVisible(true);
    }
}

// JList -> List Box
