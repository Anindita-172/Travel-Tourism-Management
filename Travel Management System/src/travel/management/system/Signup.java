
package travel.management.system;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.event.*;

public class Signup extends JFrame implements ActionListener{
    JButton create,back;
    JTextField tfusername,tfname ,tfppassword,tfanswer;
            Choice security;
    Signup()
    {
     setBounds(350,200,900,360);
     getContentPane().setBackground(Color.WHITE);
     setLayout(null);
     
     JPanel p1 = new JPanel();
     p1.setBackground(new Color(133,193,233));
     p1.setBounds(0,0,500,400);
     p1.setLayout(null);
     add(p1);
     
        JLabel lblUsername = new JLabel("Username :");
	lblUsername.setForeground(Color.DARK_GRAY);
	lblUsername.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblUsername.setBounds(50,20,125,25);
	p1.add(lblUsername);
     
     tfusername = new JTextField();
     tfusername.setBorder(BorderFactory.createEmptyBorder());
     tfusername.setBounds(190,20,180,25);
     p1.add(tfusername);
	
        JLabel lblname = new JLabel("Name :");
	lblname.setForeground(Color.DARK_GRAY);
	lblname.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblname.setBounds(50,60,125,25);
	p1.add(lblname);
     
     tfname = new JTextField();
    tfname.setBorder(BorderFactory.createEmptyBorder());
     tfname.setBounds(190,60,180,25);
     p1.add(tfname);
     
      JLabel lblPassword = new JLabel("Password :");
	lblPassword.setForeground(Color.DARK_GRAY);
	lblPassword.setFont(new Font("Tahoma", Font.BOLD, 18));
	lblPassword.setBounds(50,100,125,25);
	p1.add(lblPassword);
     
     tfppassword = new JTextField();
     tfppassword.setBorder(BorderFactory.createEmptyBorder());
     tfppassword.setBounds(190,100,180,25);
     p1.add(tfppassword);
     
      JLabel lblsecurity = new JLabel("Security Question :");
	lblsecurity.setForeground(Color.DARK_GRAY);
	lblsecurity.setFont(new Font("Tahoma", Font.BOLD, 18));
	lblsecurity.setBounds(50,140,125,25);
	p1.add(lblsecurity);
     
        security = new Choice();
        security.add("Fav Character");
        security.add("Best Friend");
        security.add("First School");
        security.add("Mother name");
        security.setBounds(190,140,180,25);
        p1.add(security);
     
     
      JLabel lblanswer = new JLabel("Answer :");
	lblanswer.setForeground(Color.DARK_GRAY);
	lblanswer.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblanswer.setBounds(50,180,125,25);
	p1.add(lblanswer);
     
     tfanswer = new JTextField();
     tfanswer.setBorder(BorderFactory.createEmptyBorder());
     tfanswer.setBounds(190,180,180,25);
     p1.add(tfanswer);

       
        create = new JButton("Create");
	create.setBounds(80,250,100,30);
        create.setForeground(new Color(133,193,233));
	create.setBackground(Color.WHITE);
        create.setFont(new Font("Tahoma", Font.BOLD, 14));
        create.setBorder(new LineBorder(new Color(133,193,233)));
	create.addActionListener(this);
        p1.add(create);
        
        back = new JButton("Back");
	back.setBounds(250,250,100,30);
        back.setForeground(new Color(133,193,233));
	back.setBackground(Color.WHITE);
        back.setBorder(new LineBorder(new Color(133,193,233)));
        back.addActionListener(this);
	p1.add(back);
         
         
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/signup.png"));
        Image i2 = i1.getImage().getScaledInstance(250, 250,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(580,50,250,250);
        add(image);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
    
    if(ae.getSource() == create)
    {
       String username= tfusername.getText();
       String name= tfname .getText();
       String password= tfppassword.getText();
       String question= security.getSelectedItem();
       String answer= tfanswer.getText();
       
       String query = "insert into account values ('"+username+"', '"+name+"', '"+password+"', '"+question+"', '"+answer+"')";
    
        try{
            Conn c= new Conn();
            c.s.executeUpdate(query);
            
            JOptionPane.showMessageDialog(null, "Account created succesfully");
            setVisible(false);
            new Login();
       }catch(Exception e){
                e.printStackTrace();
        }
    
    
    } else if (ae.getSource() == back)
    {
        new Login();
      setVisible(false);
    }
    }
    
    
    public static void main(String[] args)
    {
      new Signup();
    }
}
