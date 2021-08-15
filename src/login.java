
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class login extends javax.swing.JFrame {

    //mouse drag
    int mouseX;
    int mouseY;
    // screen pos
    int wid = (Toolkit.getDefaultToolkit().getScreenSize().width)/2-350;
    int hit = (Toolkit.getDefaultToolkit().getScreenSize().height)/2-300;
    
        
    
    
    public login(int x, int y) {
        initComponents();
        
        // position
        this.setLocation(x,y);
        
        //icon image
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo.png")));
       
        //opaque error
        pass_.setBackground(new java.awt.Color(255,255,255,0));
        userName_.setBackground(new java.awt.Color(255,255,255,0));
    }
    
    
    public login() {
        initComponents();
        
        // position
        this.setLocation(wid,hit);
        
        //icon image
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo.png")));
        
        //opaque error
        pass_.setBackground(new java.awt.Color(255,255,255,0));
        userName_.setBackground(new java.awt.Color(255,255,255,0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pass_ = new javax.swing.JPasswordField();
        userName_ = new javax.swing.JTextField();
        minimize_ = new javax.swing.JLabel();
        quit_ = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        ok_ = new javax.swing.JLabel();
        signUP_ = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        drag_ = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pass_.setText("password");
        pass_.setBorder(null);
        pass_.setOpaque(false);
        pass_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pass_MouseReleased(evt);
            }
        });
        getContentPane().add(pass_, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 358, 180, 20));

        userName_.setText("username");
        userName_.setToolTipText("do not use the email in the demo");
        userName_.setBorder(null);
        userName_.setOpaque(false);
        userName_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                userName_MouseReleased(evt);
            }
        });
        getContentPane().add(userName_, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 306, 200, 20));

        minimize_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimize_MouseClicked(evt);
            }
        });
        getContentPane().add(minimize_, new org.netbeans.lib.awtextra.AbsoluteConstraints(727, 0, 24, 24));

        quit_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/x30w.png"))); // NOI18N
        quit_.setToolTipText("Exit");
        quit_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        quit_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quit_MouseClicked(evt);
            }
        });
        getContentPane().add(quit_, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, 30, 30));
        getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, 220, 390));

        ok_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login button.png"))); // NOI18N
        ok_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ok_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ok_MouseClicked(evt);
            }
        });
        getContentPane().add(ok_, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, 82, 30));

        signUP_.setForeground(new java.awt.Color(0, 153, 255));
        signUP_.setText("Sign Up");
        signUP_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signUP_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signUP_MouseClicked(evt);
            }
        });
        getContentPane().add(signUP_, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 470, -1, -1));

        jLabel1.setText("don't have an account?");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 470, -1, -1));

        drag_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login.png"))); // NOI18N
        drag_.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                drag_MouseDragged(evt);
            }
        });
        drag_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                drag_MousePressed(evt);
            }
        });
        getContentPane().add(drag_, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 775, 581));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
        
    
    private void drag_MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drag_MouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-mouseX, y-mouseY);
    }//GEN-LAST:event_drag_MouseDragged

    private void drag_MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drag_MousePressed
        // TODO add your handling code here:
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_drag_MousePressed

    private void quit_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quit_MouseClicked
        // TODO add your handling code here:
        this.dispose();
        accessibility ac = new accessibility();
        ac.setVisible(true);
    }//GEN-LAST:event_quit_MouseClicked

    private void ok_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ok_MouseClicked
        int nx = (int) getLocation().getX();
        int ny = (int) getLocation().getY();
        String customerID="";
        try {
            
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager
            .getConnection("jdbc:sqlserver://localhost:1433;databaseName=SD3104;selectMethod=cursor", "sa", "123456");
            
            String p= "SELECT * from customer where customer_username=? or customer_mail=? and customer_pass=?";
            PreparedStatement pst =  connection.prepareStatement (p);
            
            pst.setString(1, userName_.getText());
            pst.setString(2, userName_.getText());
            String pass = String.valueOf(pass_.getPassword());
            pst.setString(3, pass);
            
            ResultSet rs = pst.executeQuery();
            
            
            
            
            
            if(rs.next()){
                
            String gid = "SELECT customer_id from customer WHERE customer_username=? or customer_mail=?";
            PreparedStatement pstid =  connection.prepareStatement (gid);
             pstid.setString(1, userName_.getText());
             pstid.setString(2, userName_.getText());
            
            ResultSet rsid = pstid.executeQuery();
            rsid.next();
            customerID = rsid.getString("customer_id");
            
            
            customerPage cp = new customerPage(nx,ny,customerID);
            cp.setVisible(true);
            this.dispose();
            }
            
            connection.close();
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        
        
        
       
        
        
    }//GEN-LAST:event_ok_MouseClicked

    private void minimize_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimize_MouseClicked
        // TODO add your handling code here:
         
    }//GEN-LAST:event_minimize_MouseClicked

    private void userName_MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userName_MouseReleased
        // clears box if its hint mail
        if (userName_.getText().equals("username")){
            userName_.setText("");
        }
    }//GEN-LAST:event_userName_MouseReleased

    private void pass_MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pass_MouseReleased
        // gets the value of password to string type as pass_ is in char
        String pass = String.valueOf(pass_.getPassword());
        // compares if its demo pass or not then makes it invisible
        if (pass.equals("password")){
            pass_.setText("");
        }

    }//GEN-LAST:event_pass_MouseReleased

    private void signUP_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUP_MouseClicked
        // TODO add your handling code here:
        int nx = (int) getLocation().getX();
        int ny = (int) getLocation().getY();
        this.dispose();
        signUP sup = new signUP(nx,ny);
        sup.setVisible(true);
    }//GEN-LAST:event_signUP_MouseClicked

    
    
    
    public boolean validMail(String mail){
        
        String emailregx = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
        Pattern emailPat = Pattern.compile(emailregx,Pattern.CASE_INSENSITIVE);
        Matcher matcher = emailPat.matcher(mail);
        
        return matcher.find();
    }
    
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel drag_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel minimize_;
    private javax.swing.JLabel ok_;
    private javax.swing.JPasswordField pass_;
    private javax.swing.JLabel quit_;
    private javax.swing.JLabel signUP_;
    private javax.swing.JTextField userName_;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
