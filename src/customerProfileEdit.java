
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class customerProfileEdit extends javax.swing.JFrame {

     //mouse drag
        int mouseX;
        int mouseY;
        // screen pos
        int wid = (Toolkit.getDefaultToolkit().getScreenSize().width)/2-533;
        int hit = (Toolkit.getDefaultToolkit().getScreenSize().height)/2-400;

        int X;
        int Y;
        String customer_id = "";
        
    public customerProfileEdit(int x, int y, String customerID) {
        initComponents();
        
        //icon image
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo.png")));
        
        // position
        this.setLocation(x,y);
        
        System.out.println(customerID);
        customer_id = customerID;
        
        
        
        
                try {
            
Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
Connection connection = DriverManager
.getConnection(
"jdbc:sqlserver://localhost:1433;databaseName=SD3104;selectMethod=cursor", "sa", "123456");
System.out.println("DATABASE NAME IS:"
+ connection.getMetaData().getDatabaseProductName());
Statement statement = connection.createStatement();
ResultSet resultSet = statement
.executeQuery("SELECT * FROM customer where customer_id='"+customer_id+"'");

 resultSet.next();
 
     name.setText(resultSet.getString("customer_name")); 
     adress.setText(resultSet.getString("customer_adress")); 
     phone.setText(resultSet.getString("customer_phn_no")); 
     nid.setText(resultSet.getString("NID")); 
         
        
  

} catch (Exception e) {
e.printStackTrace();
}
        
        
        
        
        
        
        
        
        
        
        
        
    }

    
    public customerProfileEdit() {
        initComponents();
        //icon image
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo.png")));
        
        // position
        this.setLocation(wid,hit);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        quit_ = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        phone = new javax.swing.JTextField();
        nid = new javax.swing.JTextField();
        adress = new javax.swing.JTextField();
        signUPcustomer = new javax.swing.JLabel();
        drag_ = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        quit_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/x30.png"))); // NOI18N
        quit_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        quit_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quit_MouseClicked(evt);
            }
        });
        getContentPane().add(quit_, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 30, 30));

        name.setText("Name");
        name.setToolTipText("do not use the email in the demo");
        name.setBorder(null);
        name.setOpaque(false);
        name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nameMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nameMouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                nameMouseReleased(evt);
            }
        });
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 172, 250, 20));

        phone.setText("Phone");
        phone.setToolTipText("do not use the email in the demo");
        phone.setBorder(null);
        phone.setOpaque(false);
        phone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                phoneMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                phoneMouseReleased(evt);
            }
        });
        getContentPane().add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 228, 250, 20));

        nid.setText("NID no");
        nid.setToolTipText("do not use the email in the demo");
        nid.setBorder(null);
        nid.setOpaque(false);
        nid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nidMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                nidMouseReleased(evt);
            }
        });
        getContentPane().add(nid, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 286, 250, 20));

        adress.setText("Address");
        adress.setToolTipText("do not use the email in the demo");
        adress.setBorder(null);
        adress.setOpaque(false);
        adress.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adressMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                adressMouseReleased(evt);
            }
        });
        getContentPane().add(adress, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 341, 250, 20));

        signUPcustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edit button.png"))); // NOI18N
        signUPcustomer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signUPcustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signUPcustomerMouseClicked(evt);
            }
        });
        getContentPane().add(signUPcustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 441, 102, 30));

        drag_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edit page.png"))); // NOI18N
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
        getContentPane().add(drag_, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 601));

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

    private void nameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameMouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_nameMouseClicked

    private void nameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_nameMouseEntered

    private void nameMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameMouseReleased
        // clears box if its hint mail
        if (name.getText().equals("email@gmail.com")){
            name.setText("");
        }
    }//GEN-LAST:event_nameMouseReleased

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void phoneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_phoneMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_phoneMouseClicked

    private void phoneMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_phoneMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneMouseReleased

    private void nidMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nidMouseClicked
        // TODO add your handling code here:
      
    }//GEN-LAST:event_nidMouseClicked

    private void nidMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nidMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_nidMouseReleased

    private void adressMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adressMouseClicked
        // TODO add your handling code here:
        String address = String.valueOf(adress.getText());
        if (address.equals("Address")){
            adress.setText("");
        }
    }//GEN-LAST:event_adressMouseClicked

    private void adressMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adressMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_adressMouseReleased

    private void signUPcustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUPcustomerMouseClicked
        // TODO add your handling code here:
        
        
        
        
        try {
Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
Connection connection = DriverManager
.getConnection(
"jdbc:sqlserver://localhost:1433;databaseName=SD3104;selectMethod=cursor", "sa", "123456");
System.out.println("DATABASE NAME IS:"
+ connection.getMetaData().getDatabaseProductName());
Statement statement = connection.createStatement();


   String edit_name=  name.getText(); 
   String edit_adress=  adress.getText(); 
   String edit_phone=  phone.getText(); 
   String edit_nid=  nid.getText(); 


 
String s= "update customer set customer_name='"+edit_name+"',customer_adress='"+edit_adress+"', customer_phn_no='"+ edit_phone+"', NID='"+edit_nid+"' where customer_id='"+customer_id+"'"; 

ResultSet rs = statement.executeQuery(s);






 
} catch (Exception e) {
    
   int nx = (int) getLocation().getX();
int ny = (int) getLocation().getY();

customerProfile cp = new customerProfile(nx,ny,customer_id);
cp.setVisible(true);
this.dispose(); 
    
    
    
e.printStackTrace();
}

        
        
        
        
        
        
        
        
        
        

    }//GEN-LAST:event_signUPcustomerMouseClicked

    private void quit_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quit_MouseClicked
        // TODO add your handling code here:
        this.dispose();
        
        customerProfile cp  = new customerProfile(wid,hit,customer_id);
        cp.setVisible(true);

    }//GEN-LAST:event_quit_MouseClicked

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
            java.util.logging.Logger.getLogger(customerProfileEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(customerProfileEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(customerProfileEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(customerProfileEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new customerProfileEdit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adress;
    private javax.swing.JLabel drag_;
    private javax.swing.JTextField name;
    private javax.swing.JTextField nid;
    private javax.swing.JTextField phone;
    private javax.swing.JLabel quit_;
    private javax.swing.JLabel signUPcustomer;
    // End of variables declaration//GEN-END:variables
}
