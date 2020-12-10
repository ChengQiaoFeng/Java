import java.awt.FlowLayout;
import javax.swing.*;
@SuppressWarnings("serial")
public class FlowLayoutDemo extends JFrame{
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new FlowLayoutDemo();
                frame.setVisible(true);
            }
        });
    }
    public FlowLayoutDemo(){
        initializeComponents();
    }
    private void initializeComponents(){
        JButton btnWest = new JButton("West");
        JButton btnNorth = new JButton("North");
        JButton btnEast = new JButton("East");
        JButton btnSouth = new JButton("South");
        JButton btnCenter = new JButton("Center");

        this.setLayout(new FlowLayout(FlowLayout.CENTER,10,20));
        this.add(btnWest);
        this.add(btnNorth);
        this.add(btnEast);
        this.add(btnSouth);
        this.add(btnCenter);
        this.setTitle("流式布局演示");
        this.setSize(280,200);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
