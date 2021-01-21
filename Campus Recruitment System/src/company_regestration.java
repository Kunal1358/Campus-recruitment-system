 
import static java.awt.PageAttributes.MediaType.C;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author acer
 */
public class company_regestration extends javax.swing.JFrame {
    
        Connection con1;
        PreparedStatement insert;
    
    public company_regestration() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cname = new javax.swing.JTextField();
        txtmobile = new javax.swing.JTextField();
        umail = new javax.swing.JTextField();
        smail = new javax.swing.JTextField();
        txtusername = new javax.swing.JTextField();
        txtcpass = new javax.swing.JPasswordField();
        txtpass = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        loc = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtrad = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Company regestraion\n", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 18))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Name of the company:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 52, 190, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Contact Information:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 102, 190, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Contact Mail for University:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 144, 190, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Contact Mail for Students:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 190, 190, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Office Location:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 238, 190, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        jLabel6.setText("Login Information");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 406, 892, 44));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel7.setText("UserName:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 458, 95, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel8.setText("Password:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 460, 104, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel9.setText("Confirm Password:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 508, 375, -1));
        jPanel1.add(cname, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 50, 347, -1));

        txtmobile.setText("   ");
        txtmobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmobileActionPerformed(evt);
            }
        });
        jPanel1.add(txtmobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 100, 347, -1));
        jPanel1.add(umail, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 142, 347, -1));

        smail.setText(" ");
        jPanel1.add(smail, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 188, 347, -1));
        jPanel1.add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 457, 145, -1));
        jPanel1.add(txtcpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 500, 143, -1));
        jPanel1.add(txtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(537, 457, 143, -1));

        loc.setColumns(20);
        loc.setRows(5);
        jScrollPane1.setViewportView(loc);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 223, 347, -1));

        jButton1.setText("Register");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 540, 136, 42));

        jButton2.setText("Back to Home");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 549, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Staff TPO Name:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 352, 190, -1));
        jPanel1.add(txtrad, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 350, 223, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtmobileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmobileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmobileActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          
        int dialogResult = JOptionPane.showConfirmDialog(null,"Are you sure entered information is correct","Warning",JOptionPane.YES_NO_OPTION);


       
                            String name=cname.getText();
                            String unimail=umail.getText();
                            String stumail=smail.getText();
                            String mobile=txtmobile.getText();
                            String rad=txtrad.getText();    
                            String login_name=txtusername.getText();
                            String pass=txtpass.getText();
                            String cpass=txtcpass.getText();
                            String area=loc.getText();
                            
                            if(name.isEmpty() || unimail.isEmpty() || stumail.isEmpty() || mobile.isEmpty() || rad.isEmpty() || login_name.isEmpty() || pass.isEmpty() || cpass.isEmpty() || area.isEmpty())
                                {
                                      JOptionPane.showMessageDialog(this, "all fields are mandatory"); 
                                }
                        else
                                {
                                            if(pass.length()<6)
            {
                JOptionPane.showMessageDialog(this, "password must be at least 6 characters");
            }
        else{
        
            if(pass.equals(cpass)==true)
            {
                if(dialogResult == JOptionPane.YES_OPTION)
                        {

                        try {
                           // Class.forName("com.mysql.jdbc.Driver");
                            con1 = DriverManager.getConnection("jdbc:mysql://localhost:3307/campus_recruitment_system","root","");

                            insert=con1.prepareStatement("INSERT INTO `company_registration`(`Name_of_Company`, `Contact_Number`, `University_Mail`, `Student_Mail`, `Location`, `Staff_TPO`, `Login_UserName`, `Password`) VALUES (?,?,?,?,?,?,?,?)");

                            insert.setString(1,name);
                            insert.setString(2,mobile);
                            insert.setString(3,unimail);
                            insert.setString(4,stumail);
                            insert.setString(5,area);
                            insert.setString(6,rad);
                            insert.setString(7,login_name);
                            insert.setString(8,pass);
                            
                            insert.executeUpdate();

                            JOptionPane.showMessageDialog(this, "Regestraion Sucessfull");            

                            cname.setText("");
                            umail.setText("");
                            smail.setText("");
                            txtmobile.setText("");   
                            txtrad.setText("");
                            txtusername.setText("");
                            txtpass.setText("");
                            txtcpass.setText("");
                            loc.setText("");
                            
                            cname.requestFocus();
                            
                            
                            //Login code
                                    try{
                                        
                                    insert=con1.prepareStatement("INSERT INTO `company_login`(`UserName`, `Password`) VALUES (?,?)");
                                    insert.setString(1,login_name);
                                    insert.setString(2,pass);
                                    
                                    insert.executeUpdate();
                                    
                                }
                                catch(Exception e)
                                {
                                    JOptionPane.showMessageDialog(this, e);
                                }
                            
                            
                            
                            

                        }
                        /*catch (ClassNotFoundException ex) {
                                    JOptionPane.showMessageDialog(this, "1");
                                   //Logger.getLogger(crud.class.getName()).log(Level.SEVERE, null, ex);
                       } */catch (SQLException ex) {
                                    JOptionPane.showMessageDialog(this, "2");
                                    // Logger.getLogger(crud.class.getName()).log(Level.SEVERE, null, ex);
                       } 
                             int dialogResult1 = JOptionPane.showConfirmDialog(null,"You are successfully registered on your system. Do you want to log in now?","Warning",JOptionPane.YES_NO_OPTION);
                               if(dialogResult1 == JOptionPane.YES_OPTION)
                                    {
                                         admin_login al=new admin_login();
                                         al.setVisible(true);
                                         this.setVisible(false);
                                    }
                                if(dialogResult1 == JOptionPane.NO_OPTION)
                                   {
                                        // this.setVisible(false);
                                   }
                }
                
                            }else
                                {
                                    JOptionPane.showMessageDialog(this, "Both passwords must be same");
                                }      
                        }
                                    
                                } 
        
     

  
           
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int dialogResult = JOptionPane.showConfirmDialog(null,"Are you sure You want to cancel regestation and go back?","Warning",JOptionPane.YES_NO_OPTION);

        if(dialogResult == JOptionPane.YES_OPTION)
        {

           this.setVisible(false);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(company_regestration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(company_regestration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(company_regestration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(company_regestration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new company_regestration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cname;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea loc;
    private javax.swing.JTextField smail;
    private javax.swing.JPasswordField txtcpass;
    private javax.swing.JTextField txtmobile;
    private javax.swing.JTextField txtpass;
    private javax.swing.JTextField txtrad;
    private javax.swing.JTextField txtusername;
    private javax.swing.JTextField umail;
    // End of variables declaration//GEN-END:variables
}
