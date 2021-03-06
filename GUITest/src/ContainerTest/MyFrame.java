package ContainerTest;

import java.awt.*;

public class MyFrame extends Frame {
    static int id = 0;
    MyFrame(int x, int y, int w, int h, Color color)
    {
        super("My Frame" + (++id));
        setBackground(color);
        setLayout(null);
        setBounds(x, y , w, h);
        setVisible(true);
    }

    public static void main(String[] args) {
        MyFrame f1 = new MyFrame(100, 100, 200, 200, Color.black);
        MyFrame f2 = new MyFrame(300, 100, 200, 200, Color.blue);
        MyFrame f3 = new MyFrame(100, 300, 200, 200, Color.red);
        MyFrame f4 = new MyFrame(300, 300, 200, 200, Color.yellow);
    }
}
