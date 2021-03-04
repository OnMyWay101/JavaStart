package ContainerTest;

import java.awt.*;

public class TestFrame {
    public static void main(String[] args) {
        Frame f = new Frame("My first GUI");
        f.setSize(800, 600);
        f.setBackground(Color.blue);
        f.setVisible(true);
        f.setResizable(false);
        f.setLocation(300, 300);
    }
}
