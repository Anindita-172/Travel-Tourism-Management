package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Splash extends JFrame implements ActionListener{
    
    Splash()
    {
      setSize(1200,600);
      setLocation(200,100);
      
      
       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/splash.jpg"));
       Image i2 = i1.getImage().getScaledInstance(1200, 600,Image.SCALE_DEFAULT);
       ImageIcon i3= new ImageIcon(i2);
       JLabel image = new JLabel(i3);
       add(image);
       
      setVisible(true);
      //for putting up a button
      JButton clickhere = new JButton("CLICK HERE TO CONTINUE");
      clickhere.setBounds(400, 400, 300, 70);
      clickhere.setBackground(Color.LIGHT_GRAY);
      clickhere.setForeground(Color.BLACK);
      clickhere.addActionListener(this);
      image.add(clickhere);
    }
    public void actionPerformed(ActionEvent ae){
    
        setVisible(false);
        new Login();
    }
    
     public static void main(String[] args){
      Splash frame = new Splash();
     
        
    }
}
