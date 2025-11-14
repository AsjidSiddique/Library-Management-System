
package Common;

import AdminGui.AdminDashBoard;
import AdminLogic.AdminLogin;
import java.awt.Color;
import javax.swing.*;

public class Login extends javax.swing.JFrame {

    private String mail;
    private String password;
    private int id;
    
    public Login() {
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/Icons/logo.png")).getImage());
        initComponents();
   this.setLocationRelativeTo(null); 
       
         Timer timer = new Timer(1000, e ->  {
     l_time.setText(Common.DateTime.getCurrentTime());
   });
   timer.start();
    l_date.setText(Common.DateTime.getCurrentDate());
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelMain = new javax.swing.JPanel();
        l_email = new javax.swing.JLabel();
        Password = new javax.swing.JPasswordField();
        Email = new javax.swing.JTextField();
        l_password = new javax.swing.JLabel();
        Login = new javax.swing.JButton();
        Heading = new javax.swing.JLabel();
        l_login = new javax.swing.JLabel();
        fill3 = new javax.swing.JLabel();
        fill1 = new javax.swing.JLabel();
        Forget = new javax.swing.JButton();
        PanelDateTime1 = new javax.swing.JPanel();
        l_time = new javax.swing.JLabel();
        l_date = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelMain.setBackground(new java.awt.Color(0, 51, 204));
        PanelMain.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 0))); // NOI18N
        PanelMain.setForeground(new java.awt.Color(204, 204, 204));
        PanelMain.setToolTipText("");
        PanelMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        l_email.setFont(new java.awt.Font("Segoe UI", 3, 30)); // NOI18N
        l_email.setForeground(new java.awt.Color(153, 255, 153));
        l_email.setText("UserName");
        PanelMain.add(l_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, 160, 40));

        Password.setBackground(new java.awt.Color(255, 255, 204));
        Password.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Password.setText("admin");
        Password.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordActionPerformed(evt);
            }
        });
        PanelMain.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 360, 210, 30));

        Email.setBackground(new java.awt.Color(255, 255, 204));
        Email.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        Email.setText("admin");
        Email.setToolTipText("");
        Email.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                EmailFocusGained(evt);
            }
        });
        Email.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EmailMouseClicked(evt);
            }
        });
        Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailActionPerformed(evt);
            }
        });
        PanelMain.add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 300, 210, 30));

        l_password.setFont(new java.awt.Font("Segoe UI", 3, 30)); // NOI18N
        l_password.setForeground(new java.awt.Color(153, 255, 153));
        l_password.setText("Password");
        PanelMain.add(l_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, 140, 60));

        Login.setBackground(new java.awt.Color(204, 255, 204));
        Login.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        Login.setText("Login");
        Login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });
        PanelMain.add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 450, 320, 30));

        Heading.setFont(new java.awt.Font("Segoe UI", 3, 66)); // NOI18N
        Heading.setForeground(new java.awt.Color(255, 204, 255));
        Heading.setText("Library Mangement System");
        PanelMain.add(Heading, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 1090, 100));

        l_login.setBackground(new java.awt.Color(255, 204, 0));
        l_login.setFont(new java.awt.Font("Segoe UI Black", 1, 66)); // NOI18N
        l_login.setForeground(new java.awt.Color(255, 255, 0));
        l_login.setText("Admin Login");
        PanelMain.add(l_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, -1, -1));

        fill3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        fill3.setForeground(new java.awt.Color(228, 0, 51));
        fill3.setText("*");
        PanelMain.add(fill3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 360, 10, -1));

        fill1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        fill1.setForeground(new java.awt.Color(228, 0, 51));
        fill1.setText("*");
        PanelMain.add(fill1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 300, 10, -1));

        Forget.setBackground(new java.awt.Color(51, 102, 255));
        Forget.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        Forget.setText("Forget Password?");
        Forget.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Forget.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ForgetActionPerformed(evt);
            }
        });
        PanelMain.add(Forget, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 410, -1, -1));

        PanelDateTime1.setBackground(new java.awt.Color(0, 51, 205));
        PanelDateTime1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        l_time.setBackground(new java.awt.Color(255, 255, 255));
        l_time.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        l_time.setForeground(new java.awt.Color(255, 255, 255));
        l_time.setToolTipText("");
        PanelDateTime1.add(l_time, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 100, 20));

        l_date.setBackground(new java.awt.Color(204, 255, 255));
        l_date.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        l_date.setForeground(new java.awt.Color(102, 255, 255));
        l_date.setToolTipText("");
        PanelDateTime1.add(l_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 100, 20));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/timetable (1).png"))); // NOI18N
        PanelDateTime1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 60));

        PanelMain.add(PanelDateTime1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/stack-of-books.png"))); // NOI18N
        PanelMain.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 180, 300, 300));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/digital-library.png"))); // NOI18N
        PanelMain.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 130, 470, 480));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelMain, javax.swing.GroupLayout.PREFERRED_SIZE, 989, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordActionPerformed

    }//GEN-LAST:event_PasswordActionPerformed

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
          mail=Email.getText();
          password=Password.getText();
        
               AdminLogin admin=new AdminLogin(mail, password);
         if (admin.login()) {
                AdminDashBoard obj = new AdminDashBoard();
                obj.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Invalid Admin Login Info", "Login Failed", JOptionPane.ERROR_MESSAGE);
            }
         
        Email.setText("");
        Password.setText("");
    }//GEN-LAST:event_LoginActionPerformed

    private void ForgetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ForgetActionPerformed
  
    }//GEN-LAST:event_ForgetActionPerformed

    private void EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailActionPerformed
       

    }//GEN-LAST:event_EmailActionPerformed

    private void EmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EmailFocusGained
     
    }//GEN-LAST:event_EmailFocusGained

    private void EmailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmailMouseClicked
        if (Email.getText().equals("admin")) {
    Email.setText("");
    Email.setForeground(Color.BLACK); }
    }//GEN-LAST:event_EmailMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Email;
    private javax.swing.JButton Forget;
    private javax.swing.JLabel Heading;
    private javax.swing.JButton Login;
    private javax.swing.JPanel PanelDateTime1;
    private javax.swing.JPanel PanelMain;
    private javax.swing.JPasswordField Password;
    private javax.swing.JLabel fill1;
    private javax.swing.JLabel fill3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel l_date;
    private javax.swing.JLabel l_email;
    private javax.swing.JLabel l_login;
    private javax.swing.JLabel l_password;
    private javax.swing.JLabel l_time;
    // End of variables declaration//GEN-END:variables
}