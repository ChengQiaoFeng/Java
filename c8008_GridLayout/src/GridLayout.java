import java.awt.GridLayout;
import javax.swing.*;
@SuppressWarnings("serial")
class GridLayoutDemo extends JFrame {
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new GridLayoutDemo();
                frame.setVisible(true);
            }
        });
    }
    public GridLayoutDemo(){
        initializeComponents();
    }
    private void initializeComponents(){
        JPanel plButtons = new JPanel();
        plButtons.setLayout(new GridLayout(4,4));
        String[] name = {"7","8","9","*","4","5","6","-","1","2","3","+","0",".","/","="};
        for(int i=0;i< name.length;i++){
            plButtons.add(new JButton(name[i]));
        }
        this.add(plButtons);
        this.setTitle("网格布局演示");
        this.setSize(280,240);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
