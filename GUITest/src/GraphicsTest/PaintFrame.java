package GraphicsTest;

import java.awt.*;

public class PaintFrame extends Frame {
    public void launchFrame() {
        setBounds(200, 200, 640, 480); //设置窗口起始位置和窗口大小
        setVisible(true);
    }
    //画图方法，paint方法是自动调用的一个方法，不需要调用
    public void paint(Graphics g) {
        Color c = g.getColor();//获取画笔颜色
        g.setColor(Color.red);//设置画笔为红色
        g.fillOval(50, 50, 30, 30);//画一个椭圆，50，50是相对于frame的位置坐标，30，30是宽度跟高度
        g.setColor(Color.green);//设置画笔为绿色
        g.fillRect(80, 80, 40, 40);//画一个矩形，80，80是位置，40，40是大小
        g.setColor(c);//恢复默认画笔颜色
    }

    public static void main(String[] args) {
        new PaintFrame().launchFrame();
    }
}
