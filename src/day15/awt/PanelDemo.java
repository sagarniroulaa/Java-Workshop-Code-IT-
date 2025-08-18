package day15.awt;

import java.awt.*;

/*
    Panel:
        -> Concrete subclass of Container.
        -> Components can be added to a Panel by add() method.
        -> These components can be positioned and resized manually.
 */
public class PanelDemo {
    public static void main(String[] args) {
        Frame f = new Frame("Panel Demo");
        f.setSize(400, 200);

        Panel panel = new Panel();
        panel.setBackground(Color.LIGHT_GRAY);

        panel.add(new Label("Inside Panel1"));
        panel.add(new Button("Click"));

        Panel panel2 = new Panel();
        panel2.setBackground(Color.GRAY);

        panel2.add(new Label("Inside Panel2"));
        panel2.add(new Button("Click"));

        f.add(panel);
        f.add(panel2);
        f.setVisible(true);
    }
}
