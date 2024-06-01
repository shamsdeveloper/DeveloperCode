
package Advanced_Business_Management_System_Super_Login_Package;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Main_Splash_Screen_Form extends javax.swing.JFrame implements Runnable {

    
    private JPanel contentpane;
    int label_length=0;
    Timer tm;
    int counter=0;
    
    public Main_Splash_Screen_Form() {
        initComponents();
           /////////////////////////////////////////////////////////////////////////
         Thread t=new Thread(this);
          t.start();
        //////////////////////////////////////////////////////////////////////
        l1.setForeground(Color.red);
        String s1=l1.getText();
        label_length=s1.length();
        tm=new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                counter++;
                if(counter>label_length)
                    {
                         l1.setText("");
                       counter=0;
                    }
                else
                     {
                             l1.setText(s1.substring(0,counter));
                             if(l1.getForeground()==Color.red)
                              {
                                      l1.setForeground(Color.GREEN);
                               }
                    }
               }
        });
       tm.start();
 ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
}
 //////////////////////////////////
    
    
    @Override
    public void run() 
    {
         for(int i=0; i<=100; i++)
         {
             try
             {
                    Thread.sleep(80);
             }
             catch(Exception sql){sql.printStackTrace();}
            //loading.setText(i+"%");
           
             p1.setValue(i);
            
         }
           new Super_Admin_Login_System().setVisible(true);
           this.setVisible(false);   
    }
 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        p1 = new javax.swing.JProgressBar();
        l1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 153));
        setFocusTraversalPolicyProvider(true);
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)), javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED))));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        p1.setBackground(new java.awt.Color(255, 204, 204));
        p1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        p1.setForeground(new java.awt.Color(0, 204, 0));
        p1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        p1.setDoubleBuffered(true);
        p1.setFocusTraversalPolicyProvider(true);
        p1.setInheritsPopupMenu(true);
        p1.setOpaque(true);
        p1.setStringPainted(true);
        jPanel1.add(p1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 674, 1290, -1));

        l1.setBackground(new java.awt.Color(255, 51, 0));
        l1.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        l1.setForeground(new java.awt.Color(255, 255, 0));
        l1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l1.setText("Welcome to Advanced Business Management System Using IVR ");
        l1.setAutoscrolls(true);
        l1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        l1.setDoubleBuffered(true);
        l1.setFocusCycleRoot(true);
        l1.setFocusTraversalPolicyProvider(true);
        l1.setOpaque(true);
        jPanel1.add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 1270, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Advanced_Business_Management_System_Super_Login_Package/img/bg3.jpg"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 730));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 730));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Classic".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main_Splash_Screen_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_Splash_Screen_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_Splash_Screen_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_Splash_Screen_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_Splash_Screen_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel l1;
    private javax.swing.JProgressBar p1;
    // End of variables declaration//GEN-END:variables
}
