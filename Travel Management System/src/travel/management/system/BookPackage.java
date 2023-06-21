
package travel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;


public class BookPackage extends JFrame implements ActionListener{
    Choice c1;
    JTextField tfperson;
    String username;
    JLabel labelusername,labelid,labelnumber,labelphone,labelprice;
    JButton checkprice,bookpackage,back;
    BookPackage(String username)
    {
    this.username =username;
    setBounds(350,200,1100,500);
    setLayout(null);
    getContentPane().setBackground(Color.WHITE);
    
    
    JLabel text= new JLabel("BOOK PACKAGE");
    text.setBounds(100,10,200,30);
    text.setFont(new Font("Tahoma",Font.BOLD,25));
     add(text);
    
    JLabel lblusername = new JLabel("Username");
     lblusername.setBounds(40,70,100,20);
     lblusername.setFont(new Font("Tahoma",Font.BOLD,16));
     add(lblusername);
     
     labelusername = new JLabel();
     labelusername.setBounds(250,70,200,20);
     labelusername.setFont(new Font("Tahoma",Font.PLAIN,16));
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
     
     labelid = new JLabel();
     labelid.setBounds(250,190,150,25);
     add(labelid);
      
     JLabel lblnumber = new JLabel("Number");
     lblnumber.setFont(new Font("Tahoma",Font.BOLD,16));
     lblnumber.setBounds(40,230,150,25);
     add(lblnumber);
     
     labelnumber = new JLabel();
     labelnumber.setBounds(250,230,150,25);
     add(labelnumber);
   
     
    JLabel lblphone = new JLabel("Phone");
     lblphone.setBounds(40,270,150,20);
     lblphone.setFont(new Font("Tahoma",Font.BOLD,16));
     add(lblphone);
     
     labelphone = new JLabel();
     labelphone.setBounds(250,270,200,25);
     add(labelphone);
      
   JLabel lbltotal = new JLabel("Total Price");
     lbltotal.setFont(new Font("Tahoma",Font.BOLD,16));
     lbltotal.setBounds(40,310,150,25);
     add(lbltotal);
     
     labelprice = new JLabel();
     labelprice.setBounds(250,310,150,25);
     add(labelprice);
    
     
      
        try{
        Conn c = new Conn();
        String query = "select * from customer where username = '"+username+"'";
        ResultSet rs = c.s.executeQuery(query);
        while(rs.next())
        {
        labelusername.setText(rs.getString("username"));
        labelid.setText(rs.getString("id"));
        labelnumber.setText(rs.getString("number"));
        labelphone.setText(rs.getString("phone"));
        } 
        }catch(Exception e)
        {e.printStackTrace();}
      
        
     checkprice = new JButton("Check Price");
     checkprice.setBackground(Color.RED);
     checkprice.setForeground(Color.WHITE);
     checkprice.setBounds(60,380,120,25);
     checkprice.addActionListener(this);
     add(checkprice);
      
     
     bookpackage = new JButton("Book Package");
     bookpackage.setBackground(Color.RED);
     bookpackage.setForeground(Color.WHITE);
     bookpackage.setBounds(200,380,120,25);
     bookpackage.addActionListener(this);
     add(bookpackage);
     
     back = new JButton("Back");
     back.setBackground(Color.RED);
     back.setForeground(Color.WHITE);
     back.setBounds(340,380,120,25);
     back.addActionListener(this);
     add(back);
     
     ImageIcon i1 =  new ImageIcon(ClassLoader.getSystemResource("icons/bookpackage.jpg"));
        Image i2 = i1.getImage().getScaledInstance(500,300,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(550,50,500,300);
        add(image);
     
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
     if(ae.getSource()== checkprice)
    { String pack= c1.getSelectedItem();
     int cost = 0;
      if(pack.equals("Gold Package")) {
       cost += 12000;
       }
      if(pack.equals("Silver Package")){
       cost += 25000;
       }
       else if(pack.equals("Bronze Package")){
       cost += 32000;
         }
         int persons=Integer.parseInt(tfperson.getText());
         cost*=persons;
         labelprice.setText("Rs "+cost);
    }else if(ae.getSource()== bookpackage)
    {    
                           
                          
                            try{Conn c = new Conn();
	    			String s1 = c1.getSelectedItem(); 
                                
                                String q1 = "insert into bookPackage values('"+labelusername.getText()+"', '"+c1.getSelectedItem()+"', '"+tfperson.getText()+"', '"+labelid.getText()+"', '"+labelnumber.getText()+"', '"+labelphone.getText()+"', '"+labelprice.getText()+"')";
                                c.s.executeUpdate(q1);
                                
	    			JOptionPane.showMessageDialog(null, "Package Booked Successfully");
                                setVisible(false);
                            }catch(Exception ee){
	    			System.out.println(ee.getMessage());
                            }
    }
    else 
    {   setVisible(false);
    }
    
    
    }
    
     public static void main(String[] args)
    {new BookPackage("animuk1702");
    }
     
}
