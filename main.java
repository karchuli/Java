/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ACO;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JWindow;
import java.awt.*;
import javax.swing.*;



public class main extends JWindow 
{
  private int duration;
  public main(int d)
  {
    duration = d;
  }


  public void showSplash() {
    JPanel content = (JPanel)getContentPane();
    content.setBackground(Color.white);

    // Set the window's bounds, centering the window
    int width = 500;
    int height =350;
    Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (screen.width-width)/2;
    int y = (screen.height-height)/2;
    setBounds(x,y,width,height);

    // Build the splash screen
    JLabel label = new JLabel(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("cloud-on-cloud.jpg"))));
    JLabel copyrt = new JLabel("ACO FOR MINING WEIGHTED FLOWTIME", JLabel.CENTER);
    copyrt.setFont(new Font("Traditional Arabic", Font.PLAIN, 24));
    content.add(label, BorderLayout.CENTER);
    content.add(copyrt, BorderLayout.SOUTH);
    Color oraRed = new Color(100, 113, 1, 200);
    content.setBorder(BorderFactory.createLineBorder(oraRed, 1));

    // Display it
    setVisible(true);

    // Wait a little while, maybe while loading resources
    try 
    { 
        Thread.sleep(duration); 
  
        
      
    } 
    catch (Exception e) 
    {}

    setVisible(false);
//        Timer timer = new Timer(500, task); //fire every half second
//        timer.setInitialDelay(2000);        //first delay 2 seconds
//        timer.start();
//    java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
                DataCenter_Brokers as=new DataCenter_Brokers();
               as.setVisible(true);
//                           }
//        });
  }

  public void showSplashAndExit() 
  {
      
    showSplash();
//    System.exit(0);
//     System.out.print("this is true");
  }
  
    public static void main(String[] args) 
    {
           try
        {
            UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
        }
        catch(Exception e)
        {
            
        }
  
//       as.setVisible(true);
//      as.isShowing(); 
         // Throw a nice little title page up on the screen first
    main splash = new main(5000);
         

          
    splash.showSplashAndExit();

        
        
    }
}
