package LayoutTest;

import java.awt.*;

public class TestFlowLayout {
    public static void main(String[] args) {
        Frame f = new Frame("Flow Layout");

        Button btn1 = new Button("ok");
        Button btn2 = new Button("open");
        Button btn3 = new Button("close");

        f.setLayout(new FlowLayout());
        //f.setLayout(new FlowLayout(FlowLayout.LEFT));
        f.add(btn1);
        f.add(btn2);
        f.add(btn3);
        f.setSize(200, 200);
        f.setVisible(true);
    }
}
