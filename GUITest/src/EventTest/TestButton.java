package EventTest;

import java.awt.*;

public class TestButton {
    public static void main(String[] args) {
        Frame f = new Frame("Test");//new一个frame
        Button b = new Button("Press me");//new一个按钮
        Monitor bh = new Monitor();//new一个监听器
        b.addActionListener(bh);//把监听器添加到按钮中，一旦按钮触发则运行监听器中的内容
        f.add(b, BorderLayout.CENTER);//把按钮加到frame中
        f.pack();//设置窗口大小为按钮默认大小
        f.setVisible(true);
    }
}
