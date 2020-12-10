import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class LoginFrame extends JFrame{
    private static JPasswordField txtPwd;
    private static JTextField txtUser;
    private JButton btnOK;
    private JButton btnCancel;
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new LoginFrame();
                frame.setVisible(true);
            }
        });

    }
    private static class CloseHandler implements ActionListener{


        public static CloseHandler close;

        @Override
        public void actionPerformed(ActionEvent e){
            JButton btn = (JButton)e.getSource();
            System.out.println(btn.getText());
            System.exit(0);
        }
    }

    private class LoginHandler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            String name = txtUser.getText();
            String pwd = new String( txtPwd.getPassword());
            if(name.equals("123456")&&pwd.equals("123456")){
                LoginFrame.this.dispose();
                JFrame frame = new MainFrame();
                frame.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null,"用户名或密码错误！");
            }
        }
    }
    public LoginFrame(){
        initializeComponents();
    }


    private void initializeComponents(){
        this.setLayout(null);//取消布局管理器，即绝对布局
        ImageIcon img = new ImageIcon("title.png");
        JLabel lbImg = new JLabel(img);
        lbImg.setBounds(0,0,400,48);
        this.add(lbImg);

        JLabel lbTitle = new JLabel("用户登录");
        lbTitle.setBounds(170,58,60,24);
        this.add(lbTitle);

        JLabel lbUser = new JLabel("用户名");
        lbUser.setBounds(20,92,60,24);
        this.add(lbUser);

        txtUser = new JTextField();
        txtUser.addActionListener(new LoginHandler());
        txtUser.setBounds(80,92,280,24);
        this.add(txtUser);

        JLabel lbpwd = new JLabel("密码");
        lbpwd.setBounds(20,126,60,20);
        this.add(lbpwd);

        txtPwd = new JPasswordField();
        txtPwd.addActionListener(new LoginHandler());
        txtPwd.setBounds(80,126,280,24);
        this.add(txtPwd);

        btnOK = new JButton("登录");
        btnOK.addActionListener(new LoginHandler());
        btnOK.setBounds(100,160,80,24);
        this.add(btnOK);

        btnCancel = new JButton("取消");
        CloseHandler.close = new CloseHandler();
        btnCancel.addActionListener(new CloseHandler());
        btnCancel.setBounds(200,160,80,24);
        this.add(btnCancel);

        this.setTitle("登录界面");
        this.setSize(400,240);
        this.setResizable(false);//不允许调整窗口大小
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}
