import javax.swing.*;
import java.awt.*;

public class Entry extends JFrame{
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame();
                frame.setSize(400,300);
                //---------------测试一:根面板的背景色--------------
                //内容面板改为不可见
                frame.getContentPane().setVisible(false);
                frame.getRootPane().setBackground(Color.RED);
                //---------------测试一代码结束--------------
                //---------------测试二:层次面板的背景色--------------
                frame.getContentPane().setVisible(false);
                //层次面板修改为不透明
                frame.getLayeredPane().setOpaque(true);
                frame.getLayeredPane().setBackground(Color.YELLOW);
                //被黄色覆盖
                frame.getRootPane().setBackground(Color.RED);
                //---------------测试二代码结束--------------
                //---------------测试三:设置玻璃面板的背景色--------------
                //玻璃面板修改为可见
                frame.getGlassPane().setVisible(true);
                //玻璃面板修改为不透明
                ((JPanel)frame.getGlassPane()).setOpaque(true);
                frame.getGlassPane().setBackground(Color.BLUE);
                //下面的黄色被覆盖
                frame.getContentPane().setBackground(Color.YELLOW);
                //下面的红色被覆盖
                frame.getRootPane().setBackground(Color.RED);
                //---------------测试三代码结束--------------
                frame.setVisible(true);
                frame.setVisible(true);
            }
        });
    }
}
