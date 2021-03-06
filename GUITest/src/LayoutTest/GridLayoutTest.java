package LayoutTest;

import java.awt.*;

public class GridLayoutTest {
    public static void main(String[] args) {
        Frame f = new Frame("GridLayout");
        Button b1 = new Button("b1");
        Button b2 = new Button("b2");
        Button b3 = new Button("b3");
        Button b4 = new Button("b4");
        Button b5 = new Button("b5");
        Button b6 = new Button("b6");
        f.setLayout(new GridLayout(3, 2));//三行两列布局
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.pack();//里面的内容写好后正好把它包起来的大小，相当于是在指定窗口大小了
        f.setVisible(true);//设置窗口可见
    }
}
