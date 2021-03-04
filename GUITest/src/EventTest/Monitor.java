package EventTest;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Monitor implements ActionListener {
    public void actionPerformed(ActionEvent e)
    {
        System.out.println("a button has been pressed");
    }
}
