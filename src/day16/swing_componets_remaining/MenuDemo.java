package day16.swing_componets_remaining;

/*
    JMenuBar -> Container for menus
    JMenu -> drop-down menu (File, Edit, etc.)
    JMenuItem -> clickable item inside menu.
 */

import javax.swing.*;

public class MenuDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Menu Demo");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        JMenuItem newItem = new JMenuItem("New");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem exitItem = new JMenuItem("Exit");

        exitItem.addActionListener(e -> System.exit(0));

        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);

        frame.setJMenuBar(menuBar);
        frame.setVisible(true);
    }
}
