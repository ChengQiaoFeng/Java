import java.awt.BorderLayout;
import javax.swing.*;

@SuppressWarnings("serial")
public class BoxLayDemo extends JFrame {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new BoxLayDemo();
                frame.setVisible(true);
            }
        });
    }

    public BoxLayDemo() {
        initializeComponents();
    }

    private void initializeComponents() {
        Box vBox = Box.createVerticalBox();
        {
            vBox.add(Box.createVerticalStrut(4));
            Box hBox = Box.createHorizontalBox();
            {
                hBox.add(Box.createHorizontalStrut(4));
                hBox.add(createCell());
                hBox.add(Box.createHorizontalStrut(4));
            }
            vBox.add(hBox);
            vBox.add(Box.createVerticalStrut(4));
        }
        this.add(vBox, BorderLayout.NORTH);
        this.setTitle("箱式布局演示");
        this.setSize(280, 240);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private Box createCell() {
      Box vBox = Box.createVerticalBox();{
       vBox.add(Box.createVerticalStrut(4));
            Box hBox = Box.createHorizontalBox();{
                hBox.add(Box.createHorizontalStrut(10));
                hBox.add(new JLabel("Score:000"));
                hBox.add(Box.createHorizontalGlue());
                hBox.add(new JButton("Start"));
                hBox.add(Box.createHorizontalGlue());
                hBox.add(new JLabel("Time:000"));
                hBox.add(Box.createHorizontalStrut(10));
            }
            vBox.add(hBox);
          vBox.add(Box.createVerticalStrut(4));
        }
        vBox.setBorder(BorderFactory.createLoweredSoftBevelBorder());
        return vBox;
    }
}
