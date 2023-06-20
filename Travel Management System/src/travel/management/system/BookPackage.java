
package travel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BookPackage extends JFrame {
    Choice c1;
    JTextField tfperson;
    BookPackage()
    {
    
    setBounds(350,200,1100,500);
    setLayout(null);
    getContentPane().setBackground(Color.WHITE);
    
    
    JLabel text= new JLabel("BOOK PACKAGE");
    text.setBounds(100,10,200,30);
    text.setFont(new Font("Tahoma",Font.BOLD,30));
     add(text);
    
    JLabel lblusername = new JLabel("Username");
     lblusername.setBounds(40,70,100,20);
     lblusername.setFont(new Font("Tahoma",Font.BOLD,16));
     add(lblusername);
     
     JLabel labelusername = new JLabel();
     labelusername.setBounds(250,70,200,20);
     labelusername.setFont(new Font("Tahoma",Font.BOLD,16));
     add(labelusername);
     
     
     JLabel lblpackage = new JLabel("Select Package");
     lblpackage.setBounds(40,110,150,20);
     lblpackage.setFont(new Font("Tahoma",Font.BOLD,16));
     add(lblpackage);
     
      c1 = new Choice();
      c1.add("Gold Package");
      c1.add("Silver Package");
      c1.add("Bronze Package");
      c1.setBounds(250, 110, 200, 20);
      add(c1);
     
     
     JLabel lblperson = new JLabel("Total Person");
     lblperson.setBounds(40,150,150,25);
     lblperson.setFont(new Font("Tahoma",Font.BOLD,16));
     add(lblperson);
     
     tfperson = new JTextField();
     tfperson.setText("0");
     tfperson.setBounds(250, 150, 200, 25);
     add(tfperson);
		
     
     JLabel lblid = new JLabel("ID");
     lblid.setBounds(40,190,150,20);
     lblid.setFont(new Font("Tahoma",Font.BOLD,16));
     add(lblid);
     
     JLabel labelid = new JLabel();
     labelid.setBounds(250,190,150,25);
     add(labelid);
      
     JLabel lblnumber = new JLabel("Number");
     lblnumber.setFont(new Font("Tahoma",Font.BOLD,16));
     lblnumber.setBounds(40,230,150,25);
     add(lblnumber);
     
     JLabel labelnumber = new JLabel();
     labelnumber.setBounds(250,230,150,25);
     add(labelnumber);
   
     
    JLabel lblphone = new JLabel("Phone");
     lblphone.setBounds(40,230,150,20);
     lblphone.setFont(new Font("Tahoma",Font.BOLD,16));
     add(lblphone);
     
     JLabel labelid = new JLabel();
     labelid.setBounds(250,190,150,25);
     add(labelid);
      
     JLabel lblnumber = new JLabel("Number");
     lblnumber.setFont(new Font("Tahoma",Font.BOLD,16));
     lblnumber.setBounds(40,230,150,25);
     add(lblnumber);
     
     JLabel labelnumber = new JLabel();
     labelnumber.setBounds(250,230,150,25);
     add(labelnumber);
    
    setVisible(true);
    
    }
     public static void main(String[] args)
    {new BookPackage();
    }
     
}
