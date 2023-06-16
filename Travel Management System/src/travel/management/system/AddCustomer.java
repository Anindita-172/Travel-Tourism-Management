
package travel.management.system;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
public class AddCustomer extends JFrame {
    JLabel labelusername,labelname;
    JComboBox comboid;
    JTextField tfnumber, tfcountry,tfaddress ,tfphone,tfemail;
    JRadioButton rmale,rfemale;
    JButton add,back;
    AddCustomer()
    {
      setBounds(450,200,850,550);
      setLayout(null);
      getContentPane().setBackground(Color.WHITE);
      
        JLabel lblusername = new JLabel("username ");
	lblusername.setBounds(30,50,150,25);
        add(lblusername);
      
        labelusername = new JLabel();
	labelusername.setBounds(220,50,150,25);
        add(labelusername);
        
        JLabel lblid = new JLabel("id ");
	lblid.setBounds(30,90,150,25);
        add(lblid);
        
        comboid = new JComboBox(new String[] {"passport","Aadhar Card","Pan Card","Ration Card"});
        comboid.setBounds(220,90,150,25);
        comboid.setBackground(Color.WHITE);
        add(comboid);
        
        
        
     
        JLabel lblnumber = new JLabel("Number ");
	lblnumber.setBounds(30,130,150,25);
        add(lblnumber);
        
        tfnumber = new JTextField();
	tfnumber.setBounds(220,130,150,25);
        add(tfnumber);
        
        JLabel lblname = new JLabel("Name ");
	lblname.setBounds(30,170,150,25);
        add(lblname);
      
        labelname = new JLabel();
	labelname.setBounds(220,170,150,25);
        add(labelname);
        
        JLabel lblgender = new JLabel("Gender ");
	lblgender.setBounds(30,210,150,25);
        add(lblgender);
        
        rmale = new JRadioButton("Male");
        rmale.setBounds(220,210,70,25);
        rmale.setBackground(Color.WHITE);
        add(rmale);
        
        rfemale = new JRadioButton("Female");
        rfemale.setBounds(300,210,70,25);
        rfemale.setBackground(Color.WHITE);
        add(rfemale);
        
        ButtonGroup bg = new ButtonGroup();
        bg.add(rmale);
        bg.add(rfemale);
       
        
        JLabel lblcountry = new JLabel("Country ");
	lblcountry.setBounds(30,250,150,25);
        add(lblcountry);
        
        tfcountry = new JTextField();
	tfcountry.setBounds(220,250,150,25);
        add(tfcountry);
       
        JLabel lbladdress = new JLabel("Address ");
	lbladdress.setBounds(30,290,150,25);
        add(lbladdress);
        
        tfaddress = new JTextField();
	 tfaddress.setBounds(220,290,150,25);
        add( tfaddress);
        
        JLabel lblphone = new JLabel("Phone ");
	lblphone.setBounds(30,330,150,25);
        add(lblphone);
        
        tfphone = new JTextField();
	 tfphone.setBounds(220,330,150,25);
        add( tfphone);
       
        JLabel lblemail = new JLabel("Email ");
	lblemail.setBounds(30,370,150,25);
        add(lblemail);
        
        tfemail = new JTextField();
	 tfemail.setBounds(220,370,150,25);
        add( tfemail);
        
        
        add = new JButton("Add");
	add.setBounds(50,440,100,25);
        add.setForeground(Color.WHITE);
	add.setBackground(Color.BLACK);
        //add.addActionListener(this);
        add(add);
        
        back = new JButton("Back");
	back.setBounds(220,440,100,25);
        back.setForeground(Color.WHITE);
	back.setBackground(Color.BLACK);
        //add.addActionListener(this);
        add(back);
        
        
        ImageIcon i1 =  new ImageIcon(ClassLoader.getSystemResource("icons/newcustomer.jpg"));
        Image i2 = i1.getImage().getScaledInstance(400,500,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(400,40,450,420);
        add(image);
        
         try{
                   Conn c = new Conn();
                  //ResultSet rs = c.s.executeQuery(query);
                   ResultSet rs = c.s.executeQuery("select * from account where username ='animuk1702'");
                    while(rs.next()){
                       labelusername.setText(rs.getString("username"));  
                       labelname.setText(rs.getString("name"));
                    }
                }catch(Exception e){ 
                e.printStackTrace();}
        
      setVisible(true);
    }
    
    public static void main(String[] args)
    {new AddCustomer();
    }
    
}
