import javax.swing.*;
@SuppressWarnings("serial")
public class ScrollDemo extends JFrame{
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new ScrollDemo();
                frame.setVisible(true);
            }
        });
    }
    public ScrollDemo(){
        initializeComponents();
    }
    private void initializeComponents(){
        JScrollPane spane = new JScrollPane();
        spane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        spane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        JTextArea txt = new JTextArea();//多行文本组件
        spane.setViewportView(txt);//为多行文本组件添加滚动支持
        this.add(spane);
        this.setTitle("滚动面板演示");
        this.setSize(300,300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
