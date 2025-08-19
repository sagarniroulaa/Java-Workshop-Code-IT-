package day16.swing_componets_remaining;

/*
    JTable:
    -> Display tabular data.
    -> Constructed using 2D array.
 */

import javax.swing.*;

public class JTableDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JTable Demo");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] columns = {"ID", "Name", "Age"};
        Object[][] data = {
                {1, "Ram", 14},
                {2, "Shyam", 22},
                {3, "Hari", 50}
        };

        JTable table = new JTable(data, columns);
        System.out.println("Value at row0, col0: " + table.getValueAt(0, 0));
        table.setValueAt("Krishna", 1, 1);

        JScrollPane scroll = new JScrollPane(table);

        frame.add(scroll);
        frame.setVisible(true);
    }
}
