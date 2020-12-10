import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.*;
@SuppressWarnings("serial")

public class GirdBagLayoutDemo extends JFrame {
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new GirdBagLayoutDemo();
                frame.setVisible(true);
            }
        });
    }
    public GirdBagLayoutDemo(){
        initializeComponents();
    }
    private void initializeComponents() {
        GridBagLayout gbl = new GridBagLayout();
        this.setLayout(gbl);
        //顶部菜单栏、工具栏区
        JPanel plTop = new JPanel();
        plTop.setBackground(Color.RED);
        plTop.add(new JLabel("顶部功能区"));
        this.add(plTop,new CustomConstraints(0,0,1,2)
        .setFill(CustomConstraints.BOTH)
        .setPadding(280,50).setWeight(1,0)
        .setMargin(new Insets(4,4,4,4))
        );
        //左侧导航区
        JPanel plLeft = new JPanel();
        plLeft.setBackground(Color.GREEN);
        plLeft.add(new JLabel("左侧导航栏"));
        this.add(plLeft,new CustomConstraints(1,0)
        .setFill(CustomConstraints.BOTH)
                .setPadding(60,100).setWeight(0,1)
                .setMargin(new Insets(0,4,0,4))
        );
        //底部状态区
        JPanel plBotton = new JPanel();
        plBotton.setBackground(Color.CYAN);
        plBotton.add(new JLabel("底部状态区"));
        this.add(plBotton,new CustomConstraints(2,0,1,2)
        .setFill(CustomConstraints.BOTH)
        .setPadding(280,10).setWeight(1,0)
        .setMargin(new Insets(4,4,4,4)));
        //中间工作区
        JPanel plMain = new JPanel();
        plMain.setBackground(Color.WHITE);
        plMain.add(new JLabel("主工作区"));
        this.add(plMain,new CustomConstraints(1,1)
        .setFill(CustomConstraints.BOTH).setWeight(1,1)
        .setMargin(new Insets(0,0,0,4)));


        this.setTitle("网格布局演示");
        this.pack();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    private class CustomConstraints extends GridBagConstraints {
        public CustomConstraints(int r,int c){
            this(r,c,1,1);
        }
        public  CustomConstraints(int r,int c,int rows,int cols){
            gridy = c;
            gridy = r;
            gridheight = rows;
            gridwidth = cols;
        }
        //设置水平和垂直方向的拉伸
        public CustomConstraints setWeight(int wx,int wy){
            this.weightx = wx;
            this.weighty = wy;
            return this;
        }
        //设置填充模式
        public CustomConstraints setFill(int fill){
            this.fill = fill;
            return this;
        }
        //设置对齐方式
        public CustomConstraints setAlign(int anchor){
            this.anchor = anchor;
            return this;
        }
        //设置内边距
        public CustomConstraints setPadding(int ipadx,int ipady){
            this.ipadx = ipadx;
            this.ipady = ipady;
            return this;
        }
        //设置外边距
        public CustomConstraints setMargin(Insets insets){
            this.insets = insets;
            return this;
        }
    }
}
