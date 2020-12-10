import java.awt.BorderLayout;
import javax.swing.*;
@SuppressWarnings("serial")
public class BorderLayoutDemo extends JFrame {
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new BorderLayoutDemo();
                frame.setVisible(true);
            }
        });
    }
    public BorderLayoutDemo(){
        initializeComponents();
    }
    private void initializeComponents(){
        JButton btnWest = new JButton("West");
        JButton btnNorth = new JButton("North");
        JButton btnEast = new JButton("East");
        JButton btnSouth = new JButton("South");
        JButton btnCenter = new JButton("Center");

        this.add(btnCenter,BorderLayout.CENTER);
        this.add(btnWest,BorderLayout.WEST);
        this.add(btnNorth,BorderLayout.NORTH);
        this.add(btnEast,BorderLayout.EAST);
        this.add(btnSouth,BorderLayout.SOUTH);
        this.setTitle("边界布局演示");
        this.setSize(300,225);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
