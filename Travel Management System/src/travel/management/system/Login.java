
package travel.management.system;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
public class Login extends JFrame {
    Login()
    {
        setSize(900,400);
        setLocation(350,200);
        setLayout(null);
        
        
        getContentPane().setBackground(Color.WHITE);
        
        JPanel p1 = new JPanel();
	p1.setBackground(new Color(131,193,223));
	p1.setBounds(0,0,400,400);
        p1.setLayout(null);
	add(p1);
        
        ImageIcon i1 =  new ImageIcon(ClassLoader.getSystemResource("icons/login.png"));
        Image i2 = i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(100,100,200,200);
        p1.add(image);
        
        
        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBounds(400,30,450,300);
        add(p2);
        
        JLabel lblusername = new JLabel("Username: ");
	lblusername.setBounds(60,20,100,25);
        lblusername.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
	p2.add(lblusername);

        JTextField tfusername = new JTextField();
        tfusername.setBounds(60, 60,300,30);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfusername);
        
        JLabel lbpassword = new JLabel("Password: ");
	lbpassword.setBounds(60,110,100,25);
        lbpassword.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
	p2.add(lbpassword);

        JTextField tfpassword = new JTextField();
        tfpassword.setBounds(60, 150,300,30);
        tfpassword.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfpassword);
        
        
        JButton login = new JButton("Login");
	login.setBounds(60,200,130,30);
        login.setForeground(Color.WHITE);
	login.setBackground(new Color(133,193,233));
        login.setBorder(new LineBorder(new Color(133,193,233)));
	p2.add(login);
        
        
        JButton signup = new JButton("SignUp");
	signup.setBounds(230,200,130,30);
        signup.setForeground(Color.WHITE);
	signup.setBackground(new Color(133,193,233));
        signup.setBorder(new LineBorder(new Color(133,193,233)));
	p2.add(signup);
        
        setVisible(true);
        
        
        
    }
    public static void main(String[] args) {
                new Login();
	}

}
