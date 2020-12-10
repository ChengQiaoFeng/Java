import javax.swing.*;
@SuppressWarnings("serial")
public class SplitDemo extends JFrame{
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new SplitDemo();
                frame.setVisible(true);
            }
        });
    }
    public SplitDemo(){
        initializeComponents();
    }
    private void initializeComponents(){
        JScrollPane pane = new JScrollPane();
        JScrollPane pane2 = new JScrollPane();
        JTextArea txtLeft = new JTextArea();
        JTextArea txtRight = new JTextArea();
        pane.setViewportView(txtLeft);
        pane2.setViewportView(txtRight);
        JSplitPane sPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,pane,pane2);
        //设置滚动面板嵌套在左右两边窗口；
        sPane.setDividerLocation(100);//设置分割条位置
        sPane.setOneTouchExpandable(true);//设置可折叠箭头
        this.add(sPane);
        this.setTitle("拆分面板演示");
        this.setSize(400,300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
