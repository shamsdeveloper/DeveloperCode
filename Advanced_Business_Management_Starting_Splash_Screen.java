
package Advanced_Business_Management_System_Super_Login_Package;
import Small_Area_Business_Management_System.*;
import Broad_Area_Business_Management_System.*;
import jaco.mp3.player.MP3Player;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class Advanced_Business_Management_Starting_Splash_Screen extends JFrame implements Runnable
{
 
    
    
    
    public static final String SONG="src/Advanced_Business_Management_System_Super_Login_Package/audio/biss_and_Agozi.mp3";
    MP3Player mp3player=new MP3Player(new File(SONG));
    public void audio_Message()
     {
        mp3player.play();
          
     }
         
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    
       Thread t1;
       public Advanced_Business_Management_Starting_Splash_Screen(String s)
      {
            super(s);
            setLayout(new FlowLayout());
            ImageIcon i2=new ImageIcon("src/Advanced_Business_Management_System_Super_Login_Package/img/bus.png");
            JLabel m1 = new JLabel(i2);
            ////////////////////////////////////////////////////////////////////////////////
              Font f=new Font("Algerian",Font.BOLD,16);
             JLabel  m2=new JLabel("WELCOME TO Advanced Business Management System USING IVR");
             m2.setBounds(0,50,1350,60);
             m2.setFont(f);
             m2.setOpaque(true);
             m2.setForeground(Color.BLUE);
             m2.setBackground(Color.WHITE);
             m1.add(m2);
             m1.setBounds(0,50,1350,400);
             this.add(m1);
             t1= new Thread(this);
             t1.start();
            audio_Message();
               
      }
        /////////////////////////////
    @Override
    public void run() 
    {
           try{
                 Thread.sleep(6000);
                 this.setVisible(false);
                 new Main_Splash_Screen_Form().setVisible(true);
             }
           catch(Exception e){
            e.printStackTrace(); 
        }
    } 
public static void main(String args[])
   {
           Advanced_Business_Management_Starting_Splash_Screen a1=new Advanced_Business_Management_Starting_Splash_Screen("Advanced Business Management System Using IVR");
           a1.setVisible(true);
           a1.getContentPane().setBackground(Color.GREEN);
        int i;
        int x=1;
        for(i=180;i<=680;i+=2,x+=2){
            a1.setLocation((670-((i+x)/2) ),350-(i/2));
            a1.setSize(i+x,i);
            
            try{
                Thread.sleep(10);
            }catch(Exception e) { }
        }
        
   }
       
}
