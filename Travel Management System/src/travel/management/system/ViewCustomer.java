
package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.ActionEvent;

public class ViewCustomer extends JFrame {
   JButton back;
    
    ViewCustomer(String username)
    {
     setBounds(450,180,870,625);
     getContentPane().setBackground(Color.WHITE);
     setLayout(null);
     
     JLabel lblusername = new JLabel("Username");
     lblusername.setBounds(30,50,150,25);
     add(lblusername);
     
     JLabel labelusername = new JLabel();
     labelusername.setBounds(220,50,150,25);
     add(labelusername);
     
     
     JLabel lblid = new JLabel("ID");
     lblid.setBounds(30,110,150,25);
     add(lblid);
     
     JLabel labelid = new JLabel();
     labelid.setBounds(220,110,150,25);
     add(labelid );
     
     
     JLabel lblnumber = new JLabel("Number");
     lblnumber.setBounds(30,170,150,25);
     add(lblnumber);
     
     JLabel labelnumber = new JLabel();
     labelnumber.setBounds(220,170,150,25);
     add(labelnumber);
     
     JLabel lblname = new JLabel("Name");
     lblname.setBounds(30,230,150,25);
     add(lblname);
     
     JLabel labelname = new JLabel();
     labelname.setBounds(220,230,150,25);
     add(labelname);
      
     JLabel lblgender = new JLabel("Gender");
     lblgender.setBounds(30,290,150,25);
     add(lblgender);
     
     JLabel labelgender = new JLabel();
     labelgender.setBounds(220,290,150,25);
     add(labelgender);
     setVisible(true);
     
     JLabel lblcountry = new JLabel("Country");
     lblcountry.setBounds(290,50,150,25);
     add(lblcountry);
     
     JLabel labelcountry = new JLabel();
     labelcountry.setBounds(350,50,150,25);
     add(labelcountry);
     
     JLabel lbladdress = new JLabel("Address");
     lbladdress.setBounds(290,110,150,25);
     add(lbladdress);
     
     JLabel labeladdress = new JLabel();
     labeladdress.setBounds(350,110,150,25);
     add(labeladdress);
     
     JLabel lblemail = new JLabel("Email");
     lblemail.setBounds(290,170,150,25);
     add(lblemail);
     
     JLabel labelemail = new JLabel();
     labelemail.setBounds(350,170,150,25);
     add(labelemail);
     
     JLabel lblphone = new JLabel("Phone");
     lblphone.setBounds(290,230,150,25);
     add(lblphone);
     
     JLabel labelphone = new JLabel();
     labelphone.setBounds(350,230,150,25);
     add(labelphone);
     
     back = new JButton("back");
     back.setBackground(Color.BLACK);
     back.setForeground(Color.WHITE);
     back.setBounds(350,350,100,25);
     add(back);
     
        ImageIcon i1 =  new ImageIcon(ClassLoader.getSystemResource("icons/viewall.png"));
        Image i2 = i1.getImage().getScaledInstance(400,500,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(20,400,600,200);
        add(image);
     
     setVisible(true);
    
    }
    public static void main(String[] args)
    {new ViewCustomer("");
    }
}
