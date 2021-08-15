
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class signupHospital extends javax.swing.JFrame {

    //mouse drag
        int mouseX;
        int mouseY;
        // screen pos
        int wid = (Toolkit.getDefaultToolkit().getScreenSize().width)/2-170;
        int hit = (Toolkit.getDefaultToolkit().getScreenSize().height)/2-422;

        int X;
        int Y;
            
    public signupHospital(int x, int y) {
        initComponents();
        
        // position
        this.setLocation(wid,hit);
        
        
        //icon image
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo.png")));
        
        
        //opaque error
        name_.setBackground(new java.awt.Color(255,255,255,0));
        userName_.setBackground(new java.awt.Color(255,255,255,0));
        phone_.setBackground(new java.awt.Color(255,255,255,0));
        mail_.setBackground(new java.awt.Color(255,255,255,0));
        pass_.setBackground(new java.awt.Color(255,255,255,0));
        conpass_.setBackground(new java.awt.Color(255,255,255,0));
        
        // back pos
        X=x;
        Y=y;
    }
    
    public signupHospital() {
        initComponents();
        
        // position
        this.setLocation(wid,hit);
        
        //opaque error
        name_.setBackground(new java.awt.Color(255,255,255,0));
        userName_.setBackground(new java.awt.Color(255,255,255,0));
        phone_.setBackground(new java.awt.Color(255,255,255,0));
        mail_.setBackground(new java.awt.Color(255,255,255,0));
        pass_.setBackground(new java.awt.Color(255,255,255,0));
        conpass_.setBackground(new java.awt.Color(255,255,255,0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        conpass_ = new javax.swing.JPasswordField();
        pass_ = new javax.swing.JPasswordField();
        name_ = new javax.swing.JTextField();
        userName_ = new javax.swing.JTextField();
        phone_ = new javax.swing.JTextField();
        mail_ = new javax.swing.JTextField();
        address_ = new javax.swing.JTextField();
        quit_ = new javax.swing.JLabel();
        signUP_ = new javax.swing.JLabel();
        ok_ = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        drag_ = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        conpass_.setText("password");
        conpass_.setBorder(null);
        conpass_.setOpaque(false);
        conpass_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                conpass_MouseReleased(evt);
            }
        });
        getContentPane().add(conpass_, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 395, 230, 20));

        pass_.setText("password");
        pass_.setBorder(null);
        pass_.setOpaque(false);
        pass_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pass_MouseReleased(evt);
            }
        });
        getContentPane().add(pass_, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 449, 230, 20));

        name_.setText("Name");
        name_.setToolTipText("do not use the email in the demo");
        name_.setBorder(null);
        name_.setOpaque(false);
        name_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                name_MouseReleased(evt);
            }
        });
        name_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_ActionPerformed(evt);
            }
        });
        getContentPane().add(name_, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 173, 250, 20));

        userName_.setText("Username");
        userName_.setToolTipText("do not use the email in the demo");
        userName_.setBorder(null);
        userName_.setOpaque(false);
        userName_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                userName_MouseReleased(evt);
            }
        });
        getContentPane().add(userName_, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 228, 250, 20));

        phone_.setText("Phone");
        phone_.setToolTipText("do not use the email in the demo");
        phone_.setBorder(null);
        phone_.setOpaque(false);
        phone_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                phone_MouseReleased(evt);
            }
        });
        getContentPane().add(phone_, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 285, 250, 20));

        mail_.setText("E mail");
        mail_.setToolTipText("do not use the email in the demo");
        mail_.setBorder(null);
        mail_.setOpaque(false);
        mail_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                mail_MouseReleased(evt);
            }
        });
        mail_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mail_ActionPerformed(evt);
            }
        });
        getContentPane().add(mail_, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 341, 250, 20));

        address_.setText("Address");
        address_.setToolTipText("do not use the email in the demo");
        address_.setBorder(null);
        address_.setOpaque(false);
        address_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                address_MouseReleased(evt);
            }
        });
        getContentPane().add(address_, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 505, 250, 20));

        quit_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/x30.png"))); // NOI18N
        quit_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        quit_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quit_MouseClicked(evt);
            }
        });
        getContentPane().add(quit_, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 30, 30));

        signUP_.setForeground(new java.awt.Color(0, 153, 255));
        signUP_.setText("login");
        signUP_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signUP_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signUP_MouseClicked(evt);
            }
        });
        getContentPane().add(signUP_, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 628, -1, -1));

        ok_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/signup button.png"))); // NOI18N
        ok_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ok_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ok_MouseClicked(evt);
            }
        });
        getContentPane().add(ok_, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 577, 82, 30));

        jLabel2.setText("already have an account?");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 628, -1, -1));

        drag_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/signUP hospital.png"))); // NOI18N
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
        getContentPane().add(drag_, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 746));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void quit_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quit_MouseClicked
        // TODO add your handling code here:
        this.dispose();

    }//GEN-LAST:event_quit_MouseClicked

    private void ok_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ok_MouseClicked
        // TODO add your handling code here:
        
        try {
            
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager
            .getConnection("jdbc:sqlserver://localhost:1433;databaseName=SD3104;selectMethod=cursor", "sa", "123456");
            
            
            //generate id
            String cid = "SELECT COUNT(*) AS hospitalcount FROM hospital";
            PreparedStatement pstid =  connection.prepareStatement (cid);
            ResultSet rsid = pstid.executeQuery();
            int idpre=0;
            
            if (rsid.next()){
            idpre = rsid.getInt("hospitalcount");
            }
            idpre+=1;
            String idpr = Integer.toString(idpre);
            String idFinal = "CVDH10"+idpr;
            
           
            
            
            
            String p= "insert into hospital(hospital_id, hospital_name, hospital_adress, hospital_mail, hospital_username, hospital_pass)  values (?,?,?,?,?,?)";
            PreparedStatement pst =  connection.prepareStatement (p);
            
            pst.setString(1, idFinal);
            pst.setString(2, name_.getText());
            pst.setString(3, address_.getText());
            pst.setString(4, mail_.getText());
            pst.setString(5, userName_.getText());
            
            String pass = String.valueOf(pass_.getPassword());
            pst.setString(6, pass);
            
            
            pst.executeUpdate();
            loginHospital ld = new loginHospital();
            ld.setVisible(true);
            this.dispose();
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
              
    }//GEN-LAST:event_ok_MouseClicked

    private void signUP_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUP_MouseClicked
        // TODO add your handling code here:
        this.dispose();
        login log = new login(X,Y);
        log.setVisible(true);
    }//GEN-LAST:event_signUP_MouseClicked

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

    private void conpass_MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_conpass_MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_conpass_MouseReleased

    private void pass_MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pass_MouseReleased
        // gets the value of password to string type as pass_ is in char
    }//GEN-LAST:event_pass_MouseReleased

    private void name_MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_name_MouseReleased
        // clears box if its hint mail
    }//GEN-LAST:event_name_MouseReleased

    private void name_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name_ActionPerformed

    private void userName_MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userName_MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_userName_MouseReleased

    private void phone_MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_phone_MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_phone_MouseReleased

    private void mail_MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mail_MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_mail_MouseReleased

    private void mail_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mail_ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mail_ActionPerformed

    private void address_MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_address_MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_address_MouseReleased

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
            java.util.logging.Logger.getLogger(signupHospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signupHospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signupHospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signupHospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signupHospital().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address_;
    private javax.swing.JPasswordField conpass_;
    private javax.swing.JLabel drag_;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField mail_;
    private javax.swing.JTextField name_;
    private javax.swing.JLabel ok_;
    private javax.swing.JPasswordField pass_;
    private javax.swing.JTextField phone_;
    private javax.swing.JLabel quit_;
    private javax.swing.JLabel signUP_;
    private javax.swing.JTextField userName_;
    // End of variables declaration//GEN-END:variables
}
