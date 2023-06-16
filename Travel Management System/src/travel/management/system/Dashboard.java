
package travel.management.system;

import javax.swing.*;
import java.awt.*;
public class Dashboard extends JFrame {
    String username;
    Dashboard(String username)
    {this.username =username;
    
     setExtendedState(JFrame.MAXIMIZED_BOTH);
     setLayout(null);
     
     JPanel p1 = new JPanel();
     p1.setLayout(null);
     p1.setBackground(new Color(0,0,102));
     p1.setBounds(0,0,1600,65);
     add(p1);
     
      
        ImageIcon i1 =  new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
        Image i2 = i1.getImage().getScaledInstance(70,70,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(5,0,70,70);
        p1.add(image);
        
        
        JLabel heading = new JLabel("Dashboard ");
	heading.setBounds(80,10,300,40);
        heading.setFont(new Font("Tahoma", Font.BOLD, 30));
	heading.setForeground(Color.WHITE);
        p1.add(heading);
        
     JPanel p2 = new JPanel();
     p2.setLayout(null);
     p2.setBackground(new Color(0,0,102));
     p2.setBounds(0,65,300,900);
     add(p2);
     
     JButton addPersonDetails = new JButton("Add Personal Details");
     addPersonDetails.setBounds(0,0,300,50);
     addPersonDetails.setForeground(Color.WHITE);
     addPersonDetails.setBackground(new Color(0,0,102));
     addPersonDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
     addPersonDetails.setMargin(new Insets(0,0,0,60));
     p2.add( addPersonDetails); 
     
     
     JButton updatePersonDetails = new JButton("Update Personal Details");
     updatePersonDetails.setBounds(0,50,300,50);
     updatePersonDetails.setForeground(Color.WHITE);
     updatePersonDetails.setBackground(new Color(0,0,102));
     updatePersonDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
     updatePersonDetails.setMargin(new Insets(0,0,0,60));
     p2.add( updatePersonDetails); 
       
     
     JButton viewPersonDetails = new JButton("View Personal Details");
     viewPersonDetails.setBounds(0,100,300,50);
     viewPersonDetails.setForeground(Color.WHITE);
     viewPersonDetails.setBackground(new Color(0,0,102));
     viewPersonDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
     viewPersonDetails.setMargin(new Insets(0,0,0,60));
     p2.add( viewPersonDetails); 
     
     JButton deletePersonDetails = new JButton("Delete Personal Details");
     deletePersonDetails.setBounds(0,150,300,50);
     deletePersonDetails.setForeground(Color.WHITE);
     deletePersonDetails.setBackground(new Color(0,0,102));
     deletePersonDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
     deletePersonDetails.setMargin(new Insets(0,0,0,60));
     p2.add( deletePersonDetails); 
     
     JButton checkPakage = new JButton("Check Pakage");
     checkPakage.setBounds(0,200,300,50);
     checkPakage.setForeground(Color.WHITE);
     checkPakage.setBackground(new Color(0,0,102));
     checkPakage.setFont(new Font("Tahoma", Font.PLAIN, 20));
     checkPakage.setMargin(new Insets(0,0,0,130));
     p2.add( checkPakage); 
     
     JButton bookPakage = new JButton("Book Pakage");
     bookPakage.setBounds(0,250,300,50);
     bookPakage.setForeground(Color.WHITE);
     bookPakage.setBackground(new Color(0,0,102));
     bookPakage.setFont(new Font("Tahoma", Font.PLAIN, 20));
     bookPakage.setMargin(new Insets(0,0,0,130));
     p2.add( bookPakage); 
     
     JButton viewPakage = new JButton("View Pakage");
     viewPakage.setBounds(0,300,300,50);
     viewPakage.setForeground(Color.WHITE);
     viewPakage.setBackground(new Color(0,0,102));
     viewPakage.setFont(new Font("Tahoma", Font.PLAIN, 20));
     viewPakage.setMargin(new Insets(0,0,0,130));
     p2.add( viewPakage);
     
     JButton viewHotels = new JButton("View Hotels");
     viewHotels.setBounds(0,350,300,50);
     viewHotels.setForeground(Color.WHITE);
     viewHotels.setBackground(new Color(0,0,102));
     viewHotels.setFont(new Font("Tahoma", Font.PLAIN, 20));
     viewHotels.setMargin(new Insets(0,0,0,130));
     p2.add( viewHotels);
     
     
     JButton bookHotels = new JButton("Book Hotels");
     bookHotels.setBounds(0,400,300,50);
     bookHotels.setForeground(Color.WHITE);
     bookHotels.setBackground(new Color(0,0,102));
     bookHotels.setFont(new Font("Tahoma", Font.PLAIN, 20));
     bookHotels.setMargin(new Insets(0,0,0,130));
     p2.add( bookHotels);
     
     JButton viewbookHotels = new JButton("View Booked Hotels");
     viewbookHotels.setBounds(0,450,300,50);
     viewbookHotels.setForeground(Color.WHITE);
     viewbookHotels.setBackground(new Color(0,0,102));
     viewbookHotels.setFont(new Font("Tahoma", Font.PLAIN, 20));
     viewbookHotels.setMargin(new Insets(0,0,0,60));
     p2.add( viewbookHotels);
     
     
     JButton destinations = new JButton("Destinations");
     destinations.setBounds(0,500,300,50);
     destinations.setForeground(Color.WHITE);
     destinations.setBackground(new Color(0,0,102));
     destinations.setFont(new Font("Tahoma", Font.PLAIN, 20));
     destinations.setMargin(new Insets(0,0,0,130));
     p2.add( destinations);
     
     JButton payments = new JButton("Payments");
     payments.setBounds(0,550,300,50);
     payments.setForeground(Color.WHITE);
     payments.setBackground(new Color(0,0,102));
     payments.setFont(new Font("Tahoma", Font.PLAIN, 20));
     payments.setMargin(new Insets(0,0,0,130));
     p2.add( payments);
     
     JButton calculator = new JButton("Calculator");
     calculator.setBounds(0,600,300,50);
     calculator.setForeground(Color.WHITE);
     calculator.setBackground(new Color(0,0,102));
     calculator.setFont(new Font("Tahoma", Font.PLAIN, 20));
     calculator.setMargin(new Insets(0,0,0,130));
     p2.add( calculator);
     
     JButton notepad = new JButton("Notepad");
     notepad.setBounds(0,600,300,50);
     notepad.setForeground(Color.WHITE);
     notepad.setBackground(new Color(0,0,102));
     notepad.setFont(new Font("Tahoma", Font.PLAIN, 20));
     notepad.setMargin(new Insets(0,0,0,130));
     p2.add( notepad);
     
     JButton about = new JButton("About");
     about.setBounds(0,650,300,50);
     about.setForeground(Color.WHITE);
     about.setBackground(new Color(0,0,102));
     about.setFont(new Font("Tahoma", Font.PLAIN, 20));
     about.setMargin(new Insets(0,0,0,130));
     p2.add( about);
     
     
        ImageIcon i4 =  new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i5 = i4.getImage().getScaledInstance(1650,1000,Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel image1 = new JLabel(i6);
        image1.setBounds(0,0,1650,1000);
        add(image1);
     
         JLabel text = new JLabel("Travel and Tourism Application");
          text.setBounds(400,70,1300,70);
          text.setForeground(Color.WHITE);
          text.setFont(new Font("Raleway", Font.BOLD,55));
         image1. add(text);
        
     
      setVisible(true);
    
    
    }
    
     public static void main(String[] args)
    {new Dashboard("");
    }
}
