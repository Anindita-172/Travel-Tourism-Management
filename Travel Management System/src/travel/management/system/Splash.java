package travel.management.system;

import javax.swing.*;
import java.awt.*;
public class Splash extends JFrame implements Runnable{
    Thread thread;
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
      thread = new Thread(this);
      thread.start(); //call the run function in multithreaded way
    }
    public void run() // this function will close the tab in 7 seconds
    {
      try{
            Thread.sleep(7000);
            //Login l = new Login();
        setVisible(false);
        }catch(Exception e){
           
    }
    }
     public static void main(String[] args){
      Splash frame = new Splash();
      int x=1;
        for(int i=2; i<=600; i+=10, x+=7){
           frame.setLocation(900 - ((i+x)/2), 500 - (i/2));
           frame.setSize(x+i,i);
             try{
                Thread.sleep(10);
            }catch(Exception e){}
        }
    }
}
