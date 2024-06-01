
package Advanced_Business_Management_System_Super_Login_Package;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.sql.Date;
import java.util.regex.Pattern;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
public class Sign_Up_Forms extends javax.swing.JFrame {

    Border border = BorderFactory.createLineBorder(Color.RED, 2);
    Border border1 = BorderFactory.createLineBorder(Color.GREEN, 4);
    Connection con=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    
    //setBorder(javax.swing.BorderFactory.
    public Sign_Up_Forms() {
        
        initComponents();
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        icon = new javax.swing.JButton();
        close = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Create_Account = new javax.swing.JButton();
        Reset_Form = new javax.swing.JButton();
        Close_Form = new javax.swing.JButton();
        Login_Form = new javax.swing.JButton();
        Update_Form = new javax.swing.JButton();
        Change_View = new javax.swing.JButton();
        show_Records = new javax.swing.JButton();
        l6 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        chooser = new com.toedter.calendar.JDateChooser();
        l5 = new javax.swing.JLabel();
        r2 = new javax.swing.JRadioButton();
        r3 = new javax.swing.JRadioButton();
        r1 = new javax.swing.JRadioButton();
        p1 = new javax.swing.JPasswordField();
        t1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(190, 157, 42));
        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)), javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED))))));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel1MouseExited(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 0, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        jPanel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel3MouseDragged(evt);
            }
        });
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel3MousePressed(evt);
            }
        });
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icon.setBackground(new java.awt.Color(0, 153, 153));
        icon.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        icon.setText("-");
        icon.setToolTipText("Iconfied");
        icon.setAutoscrolls(true);
        icon.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), javax.swing.BorderFactory.createEtchedBorder()));
        icon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                iconMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                iconMouseExited(evt);
            }
        });
        icon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iconActionPerformed(evt);
            }
        });
        jPanel3.add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 10, 80, 30));

        close.setBackground(new java.awt.Color(153, 153, 255));
        close.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        close.setText("x");
        close.setToolTipText("Close Form");
        close.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), javax.swing.BorderFactory.createEtchedBorder()));
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeMouseExited(evt);
            }
        });
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        jPanel3.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 10, 80, 30));

        jLabel1.setBackground(new java.awt.Color(102, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome to User Registration Form");
        jLabel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED))));
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 50));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 50));

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED))))))), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)))));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel2MouseExited(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Create_Account.setBackground(new java.awt.Color(0, 51, 51));
        Create_Account.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Create_Account.setForeground(new java.awt.Color(255, 0, 0));
        Create_Account.setText("Create Account");
        Create_Account.setToolTipText("Please_Create_Account");
        Create_Account.setAutoscrolls(true);
        Create_Account.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createEtchedBorder()), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        Create_Account.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Create_Account.setDoubleBuffered(true);
        Create_Account.setFocusCycleRoot(true);
        Create_Account.setFocusTraversalPolicyProvider(true);
        Create_Account.setHideActionText(true);
        Create_Account.setInheritsPopupMenu(true);
        Create_Account.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Create_AccountMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Create_AccountMouseExited(evt);
            }
        });
        Create_Account.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Create_AccountActionPerformed(evt);
            }
        });
        jPanel2.add(Create_Account, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 190, 60));

        Reset_Form.setBackground(new java.awt.Color(0, 51, 51));
        Reset_Form.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Reset_Form.setForeground(new java.awt.Color(255, 0, 0));
        Reset_Form.setText("Reset Form");
        Reset_Form.setToolTipText("Clear The Form");
        Reset_Form.setAutoscrolls(true);
        Reset_Form.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createEtchedBorder()), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        Reset_Form.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Reset_Form.setDoubleBuffered(true);
        Reset_Form.setFocusCycleRoot(true);
        Reset_Form.setFocusTraversalPolicyProvider(true);
        Reset_Form.setHideActionText(true);
        Reset_Form.setInheritsPopupMenu(true);
        Reset_Form.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Reset_FormMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Reset_FormMouseExited(evt);
            }
        });
        Reset_Form.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reset_FormActionPerformed(evt);
            }
        });
        jPanel2.add(Reset_Form, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 190, 60));

        Close_Form.setBackground(new java.awt.Color(0, 51, 51));
        Close_Form.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Close_Form.setForeground(new java.awt.Color(255, 0, 0));
        Close_Form.setText("Close Form");
        Close_Form.setToolTipText("Close The Form");
        Close_Form.setAutoscrolls(true);
        Close_Form.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createEtchedBorder()), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        Close_Form.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Close_Form.setDoubleBuffered(true);
        Close_Form.setFocusCycleRoot(true);
        Close_Form.setFocusTraversalPolicyProvider(true);
        Close_Form.setHideActionText(true);
        Close_Form.setInheritsPopupMenu(true);
        Close_Form.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Close_FormMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Close_FormMouseExited(evt);
            }
        });
        Close_Form.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Close_FormActionPerformed(evt);
            }
        });
        jPanel2.add(Close_Form, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 190, 60));

        Login_Form.setBackground(new java.awt.Color(0, 51, 51));
        Login_Form.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Login_Form.setForeground(new java.awt.Color(255, 0, 0));
        Login_Form.setText("Login Form");
        Login_Form.setToolTipText("Do You Goto Login_Form");
        Login_Form.setAutoscrolls(true);
        Login_Form.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createEtchedBorder()), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        Login_Form.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Login_Form.setDoubleBuffered(true);
        Login_Form.setFocusCycleRoot(true);
        Login_Form.setFocusTraversalPolicyProvider(true);
        Login_Form.setHideActionText(true);
        Login_Form.setInheritsPopupMenu(true);
        Login_Form.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Login_FormMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Login_FormMouseExited(evt);
            }
        });
        Login_Form.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Login_FormActionPerformed(evt);
            }
        });
        jPanel2.add(Login_Form, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 190, 60));

        Update_Form.setBackground(new java.awt.Color(0, 51, 51));
        Update_Form.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Update_Form.setForeground(new java.awt.Color(255, 0, 0));
        Update_Form.setText("Update Form");
        Update_Form.setToolTipText("Update_The User Form");
        Update_Form.setAutoscrolls(true);
        Update_Form.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createEtchedBorder()), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        Update_Form.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Update_Form.setDoubleBuffered(true);
        Update_Form.setFocusCycleRoot(true);
        Update_Form.setFocusTraversalPolicyProvider(true);
        Update_Form.setHideActionText(true);
        Update_Form.setInheritsPopupMenu(true);
        Update_Form.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Update_FormMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Update_FormMouseExited(evt);
            }
        });
        Update_Form.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Update_FormActionPerformed(evt);
            }
        });
        jPanel2.add(Update_Form, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 190, 60));

        Change_View.setBackground(new java.awt.Color(0, 51, 51));
        Change_View.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Change_View.setForeground(new java.awt.Color(255, 0, 0));
        Change_View.setText("Change View");
        Change_View.setToolTipText("Change_The View Form");
        Change_View.setAutoscrolls(true);
        Change_View.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createEtchedBorder()), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        Change_View.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Change_View.setDoubleBuffered(true);
        Change_View.setFocusCycleRoot(true);
        Change_View.setFocusTraversalPolicyProvider(true);
        Change_View.setHideActionText(true);
        Change_View.setInheritsPopupMenu(true);
        Change_View.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Change_ViewMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Change_ViewMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Change_ViewMousePressed(evt);
            }
        });
        Change_View.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Change_ViewActionPerformed(evt);
            }
        });
        jPanel2.add(Change_View, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 190, 60));

        show_Records.setBackground(new java.awt.Color(0, 51, 51));
        show_Records.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        show_Records.setForeground(new java.awt.Color(255, 0, 0));
        show_Records.setText("Show Record");
        show_Records.setToolTipText("Show_One By One Records");
        show_Records.setAutoscrolls(true);
        show_Records.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createEtchedBorder()), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        show_Records.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        show_Records.setDoubleBuffered(true);
        show_Records.setFocusCycleRoot(true);
        show_Records.setFocusTraversalPolicyProvider(true);
        show_Records.setHideActionText(true);
        show_Records.setInheritsPopupMenu(true);
        show_Records.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                show_RecordsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                show_RecordsMouseExited(evt);
            }
        });
        show_Records.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_RecordsActionPerformed(evt);
            }
        });
        jPanel2.add(show_Records, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 190, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 50, 250, 470));

        l6.setBackground(new java.awt.Color(0, 204, 255));
        l6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        l6.setForeground(new java.awt.Color(255, 0, 0));
        l6.setText("User_Login Type");
        l6.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        l6.setOpaque(true);
        jPanel1.add(l6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 170, 40));

        l1.setBackground(new java.awt.Color(0, 204, 255));
        l1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        l1.setForeground(new java.awt.Color(255, 0, 0));
        l1.setText("ID");
        l1.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        l1.setOpaque(true);
        jPanel1.add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 170, 60));

        l2.setBackground(new java.awt.Color(0, 204, 255));
        l2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        l2.setForeground(new java.awt.Color(255, 0, 0));
        l2.setText("User Name");
        l2.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        l2.setOpaque(true);
        jPanel1.add(l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 170, 60));

        l3.setBackground(new java.awt.Color(0, 204, 255));
        l3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        l3.setForeground(new java.awt.Color(255, 0, 0));
        l3.setText("User Password");
        l3.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        l3.setOpaque(true);
        jPanel1.add(l3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 170, 60));

        l4.setBackground(new java.awt.Color(0, 204, 255));
        l4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        l4.setForeground(new java.awt.Color(255, 0, 0));
        l4.setText("User Email");
        l4.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        l4.setOpaque(true);
        jPanel1.add(l4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 170, 60));

        t2.setBackground(new java.awt.Color(255, 153, 153));
        t2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        t2.setForeground(new java.awt.Color(0, 0, 204));
        t2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        t2.setToolTipText("Please Enter Your User Name");
        t2.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)), javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)), javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), javax.swing.BorderFactory.createEtchedBorder()))));
        t2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t2KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t2KeyTyped(evt);
            }
        });
        jPanel1.add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 470, 60));

        t3.setBackground(new java.awt.Color(255, 153, 153));
        t3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        t3.setForeground(new java.awt.Color(0, 0, 204));
        t3.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        t3.setToolTipText("Please Enter Your Email");
        t3.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)), javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)), javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), javax.swing.BorderFactory.createEtchedBorder()))));
        jPanel1.add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 470, 60));

        chooser.setBackground(new java.awt.Color(255, 153, 153));
        chooser.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)), javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED))));
        chooser.setToolTipText("Please Enter Your Register Date");
        chooser.setAutoscrolls(true);
        chooser.setFocusCycleRoot(true);
        chooser.setFocusTraversalPolicyProvider(true);
        chooser.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        chooser.setInheritsPopupMenu(true);
        chooser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                chooserMouseEntered(evt);
            }
        });
        jPanel1.add(chooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, 470, 50));

        l5.setBackground(new java.awt.Color(0, 204, 255));
        l5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        l5.setForeground(new java.awt.Color(255, 0, 0));
        l5.setText("Registration Date");
        l5.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        l5.setOpaque(true);
        jPanel1.add(l5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 170, 50));

        r2.setBackground(new java.awt.Color(255, 153, 153));
        buttonGroup1.add(r2);
        r2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        r2.setForeground(new java.awt.Color(51, 0, 204));
        r2.setText("Broad_Area Business");
        r2.setToolTipText("Please Enter User_Login_Type");
        r2.setActionCommand("");
        r2.setAutoscrolls(true);
        r2.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)), javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED))));
        r2.setBorderPainted(true);
        r2.setFocusTraversalPolicyProvider(true);
        r2.setHideActionText(true);
        r2.setInheritsPopupMenu(true);
        jPanel1.add(r2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 410, 230, 40));

        r3.setBackground(new java.awt.Color(255, 153, 153));
        buttonGroup1.add(r3);
        r3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        r3.setForeground(new java.awt.Color(51, 0, 204));
        r3.setText("Software_Developer_View");
        r3.setToolTipText("Please Enter User_Login_Type");
        r3.setActionCommand("");
        r3.setAutoscrolls(true);
        r3.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)), javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED))));
        r3.setBorderPainted(true);
        jPanel1.add(r3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 460, 220, 40));

        r1.setBackground(new java.awt.Color(255, 153, 153));
        buttonGroup1.add(r1);
        r1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        r1.setForeground(new java.awt.Color(51, 0, 204));
        r1.setText("Small_Area Business");
        r1.setToolTipText("Please Enter User_Login_Type");
        r1.setActionCommand("");
        r1.setAutoscrolls(true);
        r1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)), javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED))));
        r1.setBorderPainted(true);
        jPanel1.add(r1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 220, 40));

        p1.setBackground(new java.awt.Color(255, 153, 153));
        p1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        p1.setForeground(new java.awt.Color(0, 0, 255));
        p1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)), javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED))), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)), javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED))));
        jPanel1.add(p1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 470, 60));

        t1.setBackground(new java.awt.Color(255, 153, 153));
        t1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        t1.setForeground(new java.awt.Color(0, 0, 204));
        t1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        t1.setToolTipText("Please Enter User ID");
        t1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)), javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)), javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), javax.swing.BorderFactory.createEtchedBorder()))));
        t1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t1KeyTyped(evt);
            }
        });
        jPanel1.add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 360, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, -5, 980, 520));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
            ////create a code for the close button using java language//////
            int option=0;
            option=JOptionPane.showConfirmDialog(this,"Do You Exit From the Application","Exit_Form",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
            if(option==0)
            {
                 this.dispose();
            }
        
        
        
    }//GEN-LAST:event_closeActionPerformed

    private void iconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iconActionPerformed
          /// create a code  for the iconfied button using java language//////
          this.setState(JFrame.ICONIFIED);
          
    }//GEN-LAST:event_iconActionPerformed

    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered
        // TODO add your handling code here:
        close.setBackground(Color.GREEN);
        close.setForeground(Color.BLACK);
    }//GEN-LAST:event_closeMouseEntered

    private void iconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconMouseExited
        // TODO add your handling code here:
         icon.setBackground(new Color(0,153,153));
         icon.setForeground(new Color(0,0,0));
        
    }//GEN-LAST:event_iconMouseExited

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited
        /// create a code for mouse exit code//////////////
        close.setBackground(new Color(153,153,255));
        close.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_closeMouseExited

    private void iconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconMouseEntered
        // TODO add your handling code here:
        icon.setBackground(new Color(152,40,111));
        icon.setForeground(Color.WHITE);
    }//GEN-LAST:event_iconMouseEntered

    private void chooserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chooserMouseEntered
        // TODO add your handling code here:
        chooser.setBackground(new Color(255,153,153));
    }//GEN-LAST:event_chooserMouseEntered

    private void Create_AccountMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Create_AccountMouseEntered
        // TODO add your handling code here:
        Create_Account.setBackground(new Color(155,253,0));
        Create_Account.setForeground(Color.red);
    }//GEN-LAST:event_Create_AccountMouseEntered

    private void Create_AccountMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Create_AccountMouseExited
        // TODO add your handling code here:
        Create_Account.setBackground(new Color(0,51,51));
        Create_Account.setForeground(new Color(255,0,0));
        
    }//GEN-LAST:event_Create_AccountMouseExited

    private void Reset_FormMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Reset_FormMouseEntered
        // TODO add your handling code here:
        Reset_Form.setBackground(new Color(155,253,0));
        Reset_Form.setForeground(Color.RED);
    }//GEN-LAST:event_Reset_FormMouseEntered

    private void Reset_FormMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Reset_FormMouseExited
        // TODO add your handling code here:
        Reset_Form.setBackground(new Color(0,51,51));
        Reset_Form.setForeground(new Color(255,0,0));
        
    }//GEN-LAST:event_Reset_FormMouseExited

    private void Close_FormMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Close_FormMouseExited
        // TODO add your handling code here:
        Close_Form.setBackground(new Color(0,51,51));
        Close_Form.setForeground(new Color(255,0,0));
        
    }//GEN-LAST:event_Close_FormMouseExited

    private void Close_FormMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Close_FormMouseEntered
        // TODO add your handling code here:
        Close_Form.setBackground(new Color(155,253,0));
        Close_Form.setForeground(Color.red);
        
    }//GEN-LAST:event_Close_FormMouseEntered

    private void Login_FormMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Login_FormMouseEntered
        // TODO add your handling code here:
        Login_Form.setBackground(new Color(155,253,0));
        Login_Form.setForeground(Color.red);
    }//GEN-LAST:event_Login_FormMouseEntered

    private void Login_FormMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Login_FormMouseExited
        // TODO add your handling code here:
        Login_Form.setBackground(new Color(0,51,51));
        Login_Form.setForeground(new Color(255,0,0));
    }//GEN-LAST:event_Login_FormMouseExited

    private void Update_FormMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Update_FormMouseEntered
        // TODO add your handling code here:
        Update_Form.setBackground(new Color(155,253,0));
        Update_Form.setForeground(Color.red);
    }//GEN-LAST:event_Update_FormMouseEntered

    private void Update_FormMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Update_FormMouseExited
        // TODO add your handling code here:
        Update_Form.setBackground(new Color(0,51,51));
        Update_Form.setForeground(new Color(255,0,0));
    }//GEN-LAST:event_Update_FormMouseExited

    private void Change_ViewMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Change_ViewMouseEntered
        // TODO add your handling code here:
        Change_View.setBackground(new Color(155,253,0));
        Change_View.setForeground(Color.red);
         try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Classic".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Sign_Up_Forms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sign_Up_Forms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sign_Up_Forms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sign_Up_Forms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Change_ViewMouseEntered

    private void Change_ViewMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Change_ViewMouseExited
        // TODO add your handling code here:
        Change_View.setBackground(new Color(0,51,51));
        Change_View.setForeground(new Color(255,0,0));
         try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Sign_Up_Forms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sign_Up_Forms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sign_Up_Forms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sign_Up_Forms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Change_ViewMouseExited

    private void show_RecordsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_show_RecordsMouseEntered
        // TODO add your handling code here:
        show_Records.setBackground(new Color(155,253,0));
        show_Records.setForeground(Color.red);
    }//GEN-LAST:event_show_RecordsMouseEntered

    private void show_RecordsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_show_RecordsMouseExited
        // TODO add your handling code here:
        show_Records.setBackground(new Color(0,51,51));
        show_Records.setForeground(new Color(255,0,0));
    }//GEN-LAST:event_show_RecordsMouseExited

    private void jPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseEntered
        // TODO add your handling code here:
        jPanel1.setBackground(new Color(51,51,255));
        
    }//GEN-LAST:event_jPanel1MouseEntered

    private void jPanel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseExited
        // TODO add your handling code here:
        jPanel1.setBackground(new Color(102,255,204));
    }//GEN-LAST:event_jPanel1MouseExited

    private void jPanel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseEntered
        // TODO add your handling code here:
        jPanel2.setBackground(new Color(236,128,112));
    }//GEN-LAST:event_jPanel2MouseEntered

    private void jPanel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseExited
        // TODO add your handling code here:
        jPanel2.setBackground(new Color(0,204,255));
    }//GEN-LAST:event_jPanel2MouseExited

    private void Reset_FormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reset_FormActionPerformed
        // TODO add your handling code here:
        t1.setText("");
        t2.setText("");
        p1.setText("");
        t3.setText("");
        chooser.setCalendar(null);  ///this is the code to empty the date field using java language//////////////
        ////combox.setSelectedIndex(0);//// this is the code to clear the combo box using java language////////////
        buttonGroup1.clearSelection();
               r1.setSelected(false);
               r2.setSelected(false);
               r3.setSelected(false);
               
    }//GEN-LAST:event_Reset_FormActionPerformed

    private void Close_FormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Close_FormActionPerformed
                 ////Create a code for close button using java language//
                 int option=0;
                 option=JOptionPane.showConfirmDialog(this, "Do You Exit From The application","Exit_Form",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
                 if(option==0)
                 {
                     this.dispose();
                 }
    }//GEN-LAST:event_Close_FormActionPerformed

    private void Login_FormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Login_FormActionPerformed
        // TODO add your handling code here:
          this.dispose();
    }//GEN-LAST:event_Login_FormActionPerformed

    private void Update_FormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Update_FormActionPerformed
        ///create a code to make the update button using java language///////////
        int option=0;
        option=JOptionPane.showConfirmDialog(this,"Do You Goto Update User_Form","Update_Form",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(option==0)
        {
            new Update_Form_Detailed().setVisible(true);
            this.dispose();
        }
        
    }//GEN-LAST:event_Update_FormActionPerformed

    private void Change_ViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Change_ViewActionPerformed
        ////Panel code using java language//////
        jPanel3.setBackground(new Color(223,224,44));
        jPanel1.setBackground(new Color(19,14,12));
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Sign_Up_Forms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sign_Up_Forms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sign_Up_Forms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sign_Up_Forms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Change_ViewActionPerformed

    private void Change_ViewMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Change_ViewMousePressed
       
    }//GEN-LAST:event_Change_ViewMousePressed

    private void show_RecordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_RecordsActionPerformed
        // TODO add your handling code here:
        //// Create A code to show a Records Using Java Language/////
        String ID=t1.getText();
        if(ID.trim().equals(""))
        {
            JOptionPane.showMessageDialog(this,"Please Enter User_ID to Search The Records.","Blank_Fields",JOptionPane.ERROR_MESSAGE);
            
        }
        else {
            try
            {
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/advanced_business_management_system","root","root");
                pst=con.prepareStatement("select *from super_registration_file where U_ID=? ");
                pst.setString(1, ID);
                rs=pst.executeQuery();
                if(rs.next())
                {
                    t2.setText(rs.getString("User_Name"));
                    p1.setText(rs.getString("User_Password"));
                    t3.setText(rs.getString("User_Email"));
                    String date=rs.getString("Registration_Date");
                    ((JTextField)chooser.getDateEditor().getUiComponent()).setText(date);
                    String User_Login_Type=rs.getString("User_Login_Type");
                    if(User_Login_Type.equals("Small_Area Business"))
                    {
                        r1.setSelected(true);
                    }
                    else if(User_Login_Type.equals("Broad_Area Business"))
                    {
                        r2.setSelected(true);
                    }
                    else if(User_Login_Type.equals("Software_Developer_View"))
                    {
                        r3.setSelected(true);
                    }
                }
                            
            }
            catch(Exception sql)
            {
                JOptionPane.showMessageDialog(this,sql);
            }
        }
    }//GEN-LAST:event_show_RecordsActionPerformed

    private void Create_AccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Create_AccountActionPerformed
        //// create a code insertion a database using java language////////////
           String ID=t1.getText();
           String username=t2.getText();
           String Password=String.valueOf(p1.getText());
           String User_Email=t3.getText();
           String Registration=((JTextField)chooser.getDateEditor().getUiComponent()).getText();

           if(ID.trim().equals("") || username.trim().equals("") || Password.trim().equals("") || User_Email.trim().equals("") || Registration.trim().equals(""))
           {
                   t1.setBorder(border);
                   t2.setBorder(border);
                   p1.setBorder(border);
                   t3.setBorder(border);
                   chooser.setBorder(border);
                   JOptionPane.showMessageDialog(this, "Please Fill all Require Fields","Information_Message",JOptionPane.ERROR_MESSAGE);
                   t1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)), javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)), javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), javax.swing.BorderFactory.createEtchedBorder()))));
                   t2.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)), javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)), javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), javax.swing.BorderFactory.createEtchedBorder()))));
                   t3.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)), javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)), javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), javax.swing.BorderFactory.createEtchedBorder()))));
                   chooser.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)), javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED))));
                   p1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)), javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED))), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)), javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED))));
           }
           else if( r1.isSelected()==false && r2.isSelected()==false && r3.isSelected()==false)
           {
               r1.setBorder(border);
               r2.setBorder(border);
               r3.setBorder(border);
               JOptionPane.showMessageDialog(this, "Please Fill all Require Fields","Information_Message",JOptionPane.ERROR_MESSAGE);
               r1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)), javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED))));
               r2.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)), javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED))));
               r3.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)), javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED))));
           }
           else if(username.length()<5  || username.length()>17)
           {
               JOptionPane.showMessageDialog(this, "UserName must have between 5 and 17","",JOptionPane.ERROR_MESSAGE);
           }
           else if(Password.length()<5  || Password.length()>8)
           {
               JOptionPane.showMessageDialog(this, "Password must have between 5 and 8 Character","",JOptionPane.ERROR_MESSAGE);
           }
           else if(!Pattern.matches("^[a-zA-Z0-9_+&*-]+(?:\\."+ "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z" +"A-Z]{3,7}+$", User_Email))
          {
              JOptionPane.showMessageDialog(this, "Email address is not valid","Email Address",JOptionPane.ERROR_MESSAGE);
          }
           else
           {
                    try
                        {
                            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/advanced_business_management_system","root","root");
                            pst=con.prepareStatement("insert into super_registration_file(U_ID,User_Name,User_Password,User_Email,Registration_Date,User_Login_Type)values(?,?,?,?,?,?)");
                            pst.setString(1, ID);
                            pst.setString(2, username);
                            pst.setString(3, Password);
                            pst.setString(4, User_Email);
                            pst.setString(5, Registration);
                            if(r1.isSelected())
                            {
                                pst.setString(6,r1.getText());
                            }
                            else if(r2.isSelected())
                            {
                                pst.setString(6,r2.getText());
                            }
                            else if(r3.isSelected())
                            {
                                pst.setString(6, r3.getText());
                            }
                            int r=pst.executeUpdate();
                            if(r>0)
                            {
                                   t1.setBorder(border1);
                                   t2.setBorder(border1);
                                   p1.setBorder(border1);
                                   t3.setBorder(border1);
                                   chooser.setBorder(border1);
                                   r1.setBorder(border1);
                                   r2.setBorder(border1);
                                   r3.setBorder(border1);
                                   JOptionPane.showMessageDialog(this, "The User Account is Created Successfully From Database","Account_Created",JOptionPane.INFORMATION_MESSAGE);
                                   //////////////////////////////////////////////////////////////////
                                   String n1=r1.getText();
                                   String n2=r2.getText();
                                   String n3=r3.getText();
                               if(n1=="Small_Area Business")
                                {
                                   String msg1=t2.getText();
                                   String msg2=p1.getText();
                                   String msg3=r2.getText();
                                   new Super_Admin_Login_System(msg1,msg2,msg3).setVisible(true);
                                   this.dispose();
                                   ////////////////////////////////////////////////////////////////////////////
                                   t1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)), javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)), javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), javax.swing.BorderFactory.createEtchedBorder()))));
                                   t2.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)), javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)), javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), javax.swing.BorderFactory.createEtchedBorder()))));
                                   t3.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)), javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)), javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), javax.swing.BorderFactory.createEtchedBorder()))));
                                   chooser.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)), javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED))));
                                   p1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)), javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED))), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)), javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED))));
                                   r1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)), javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED))));
                                   r2.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)), javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED))));
                                   r3.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)), javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED))));
                                  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                                  /////////////////////////////(Reseting the Data into the database///////////////////////////////////////////////////////
                                  t1.setText("");
                                  t2.setText("");
                                  t3.setText("");
                                  p1.setText("");
                                  chooser.setCalendar(null);  ///this is the code to empty the date field using java language//////////////
                                 ////combox.setSelectedIndex(0);//// this is the code to clear the combo box using java language////////////
                                  buttonGroup1.clearSelection();
                                  r1.setSelected(false );
                                  r2.setSelected(false );
                                  r3.setSelected(false);
                                  con.close();
                               }
                               else if(n2=="Broad_Area Business")
                               {
                                   String msg1=t2.getText();
                                   String msg2=p1.getText();
                                   String msg3=r1.getText();
                                   new Super_Admin_Login_System(msg1,msg2,msg3).setVisible(true);
                                   this.dispose();
                                   ////////////////////////////////////////////////////////////////////////////
                                   t1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)), javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)), javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), javax.swing.BorderFactory.createEtchedBorder()))));
                                   t2.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)), javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)), javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), javax.swing.BorderFactory.createEtchedBorder()))));
                                   t3.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)), javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)), javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), javax.swing.BorderFactory.createEtchedBorder()))));
                                   chooser.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)), javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED))));
                                   p1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)), javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED))), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)), javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED))));
                                   r1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)), javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED))));
                                   r2.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)), javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED))));
                                   r3.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)), javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED))));
                                  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                                  /////////////////////////////(Reseting the Data into the database///////////////////////////////////////////////////////
                                  t1.setText("");
                                  t2.setText("");
                                  t3.setText("");
                                  p1.setText("");
                                  chooser.setCalendar(null);  ///this is the code to empty the date field using java language//////////////
                                 ////combox.setSelectedIndex(0);//// this is the code to clear the combo box using java language////////////
                                  buttonGroup1.clearSelection();
                                  r1.setSelected(false );
                                  r2.setSelected(false );
                                  r3.setSelected(false);
                                  con.close();
                               }
                               else if(n3=="Software_Developer_View")
                               {
                                   String msg1=t2.getText();
                                   String msg2=p1.getText();
                                   String msg3=r3.getText();
                                   new Super_Admin_Login_System(msg1,msg2,msg3).setVisible(true);
                                   this.dispose();
                                   ////////////////////////////////////////////////////////////////////////////
                                   t1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)), javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)), javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), javax.swing.BorderFactory.createEtchedBorder()))));
                                   t2.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)), javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)), javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), javax.swing.BorderFactory.createEtchedBorder()))));
                                   t3.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)), javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)), javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), javax.swing.BorderFactory.createEtchedBorder()))));
                                   chooser.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)), javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED))));
                                   p1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)), javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED))), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)), javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED))));
                                   r1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)), javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED))));
                                   r2.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)), javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED))));
                                   r3.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)), javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED))));
                                  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                                  /////////////////////////////(Reseting the Data into the database///////////////////////////////////////////////////////
                                  t1.setText("");
                                  t2.setText("");
                                  t3.setText("");
                                  p1.setText("");
                                  chooser.setCalendar(null);  ///this is the code to empty the date field using java language//////////////
                                 ////combox.setSelectedIndex(0);//// this is the code to clear the combo box using java language////////////
                                  buttonGroup1.clearSelection();
                                  r1.setSelected(false );
                                  r2.setSelected(false );
                                  r3.setSelected(false);
                                  con.close();
                               }
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(this, "doesnot User Account is Created Successfully From Database"); 
                            }
                            
                            
                        }
                   catch(Exception sql)
                      {
                            JOptionPane.showMessageDialog(this,sql);
                      }
           }
              
           
    }//GEN-LAST:event_Create_AccountActionPerformed

    private void t1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t1KeyPressed
        ////create a code to make the field only contains for integer values using java language///
        ///Create a code to make the field force fully integer Textfields

    }//GEN-LAST:event_t1KeyPressed

    private void t2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t2KeyPressed
        // TODO add your handling code here:
        char c=evt.getKeyChar();
           if(Character.isLetter(c) || Character.isWhitespace(c) || Character.isISOControl(c))
           {
               t2.setEditable(true);
               
               
           }
           else
           {
               t2.setEditable(false);
               
               
           }
    }//GEN-LAST:event_t2KeyPressed

    private void t1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t1KeyTyped
        ////this code will be define to make the field forcefully for accepting only integer data////////////////
        char c=evt.getKeyChar();
        if(!Character.isDigit(c))
        {
            evt.consume();
        }
    }//GEN-LAST:event_t1KeyTyped

    private void t2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t2KeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
           if(Character.isLetter(c) || Character.isWhitespace(c) || Character.isISOControl(c))
           {
               t2.setEditable(true);
               
               
           }
           else
           {
               t2.setEditable(false);
               
               
           }
    }//GEN-LAST:event_t2KeyTyped

    private int xMouse,yMouse;
    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed
        // TODO add your handling code here:
        xMouse=evt.getX();
        yMouse=evt.getY();   
    }//GEN-LAST:event_jPanel3MousePressed

    private void jPanel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseDragged
        // TODO add your handling code here:
        
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        setLocation(x-xMouse,y-yMouse);
        
    }//GEN-LAST:event_jPanel3MouseDragged

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
            java.util.logging.Logger.getLogger(Sign_Up_Forms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sign_Up_Forms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sign_Up_Forms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sign_Up_Forms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sign_Up_Forms().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Change_View;
    private javax.swing.JButton Close_Form;
    private javax.swing.JButton Create_Account;
    private javax.swing.JButton Login_Form;
    private javax.swing.JButton Reset_Form;
    private javax.swing.JButton Update_Form;
    private javax.swing.ButtonGroup buttonGroup1;
    private com.toedter.calendar.JDateChooser chooser;
    private javax.swing.JButton close;
    private javax.swing.JButton icon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel l6;
    private javax.swing.JPasswordField p1;
    private javax.swing.JRadioButton r1;
    private javax.swing.JRadioButton r2;
    private javax.swing.JRadioButton r3;
    private javax.swing.JButton show_Records;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    // End of variables declaration//GEN-END:variables
}
