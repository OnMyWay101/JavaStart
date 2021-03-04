package WindowEventTest;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyEventTest extends Frame {
    public static void main(String[] args) {
        new KeyEventTest();
    }

    KeyEventTest() {
        setSize(200, 200);
        setLocation(300, 300);
        addKeyListener(new MyKeyMonitor());
        setVisible(true);
    }

    class MyKeyMonitor extends KeyAdapter
    {
        public void keyPressed(KeyEvent e)
        {
            if(e.getKeyCode() == 38)
            {
                System.out.println("按下了向上的箭头");
            }
        }
    }
}
