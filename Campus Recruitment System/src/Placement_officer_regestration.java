 
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
import javax.swing.table.DefaultTableModel;



public class Placement_officer_regestration extends javax.swing.JFrame {

        Connection con1;
        PreparedStatement insert;
    
    public Placement_officer_regestration() {
        initComponents();
    }

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
        jLabel10 = new javax.swing.JLabel();
        txtcpass = new javax.swing.JPasswordField();
        txtpass = new javax.swing.JTextField();
        txtusername = new javax.swing.JTextField();
        txtfname = new javax.swing.JTextField();
        txtrad = new javax.swing.JTextField();
        txtmail = new javax.swing.JTextField();
        txtlname = new javax.swing.JTextField();
        txtmobile = new javax.swing.JTextField();
        txtdob = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Placement Officer Regestration", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 18))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("First Name:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 49, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Last Name:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 49, 107, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("D.O.B:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 90, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Contact Number:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 92, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Email:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 132, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Refrence Admin Name: ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 196, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        jLabel7.setText("Login Information");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 275, 265, 29));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel8.setText("UserName:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 323, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel9.setText("Password:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 323, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel10.setText("Confirm Password:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 363, -1, -1));
        jPanel1.add(txtcpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(509, 362, 133, -1));
        jPanel1.add(txtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(509, 322, 133, -1));
        jPanel1.add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 322, 134, -1));
        jPanel1.add(txtfname, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 47, 123, -1));
        jPanel1.add(txtrad, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 194, 121, -1));
        jPanel1.add(txtmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 130, 123, -1));
        jPanel1.add(txtlname, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 47, 122, -1));
        jPanel1.add(txtmobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, 122, -1));
        jPanel1.add(txtdob, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 90, 123, -1));

        jButton1.setText("Register");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(541, 419, 137, 41));

        jButton2.setText("Back to Home");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 427, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Gender:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 80, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F", "O" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, 100, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
  
        int count=0;
        int dialogResult = JOptionPane.showConfirmDialog(null,"Are you sure entered information is correct","Warning",JOptionPane.YES_NO_OPTION);


       
                            String fname=txtfname.getText();
                            String lname=txtlname.getText();

                            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 

                            String dob=sdf.format(txtdob.getDate());
                           
                            String mail=txtmail.getText();
                            String mobile=txtmobile.getText();
                            String rad=txtrad.getText();    
                            String login_name=txtusername.getText();
                            String pass=txtpass.getText();
                            String cpass=txtcpass.getText();
                            
                         if(fname.isEmpty() || lname.isEmpty() || dob.isEmpty() || mail.isEmpty() || mobile.isEmpty() || rad .isEmpty() || login_name.isEmpty() || pass.isEmpty() || cpass.isEmpty())
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

                            insert=con1.prepareStatement("INSERT INTO `tpo_registration`( `F_Name`, `L_Name`, `DOB`, `Gender`, `Email_Id`, `Phone_Number`, `Staff_Admin`, `Login_User_Name`, `Password`) VALUES (?,?,?,?,?,?,?,?,?)");

                            insert.setString(1,fname);
                            insert.setString(2,lname);
                            insert.setString(3,dob);
                            insert.setString(4,String.valueOf(jComboBox1.getSelectedItem()));
                            insert.setString(5,mail);
                            insert.setString(6,mobile);
                            insert.setString(7,rad);
                            insert.setString(8,login_name);
                            insert.setString(9,pass);
                            insert.executeUpdate();

                            JOptionPane.showMessageDialog(this, "Regestraion Sucessfull");            

                            txtfname.setText("");
                            txtlname.setText("");
                            //txtdob.setDate():  
                            
                            txtmobile.setText("");   
                            txtmail.setText("");
                            txtrad.setText("");
                            txtusername.setText("");
                            txtpass.setText("");
                            txtcpass.setText("");
                            txtfname.requestFocus();
                            
                            //login details
                            
                                    try{
                                        
                                    insert=con1.prepareStatement("INSERT INTO `tpo_login`(`UserName`, `Password`) VALUES (?,?)");
                                    insert.setString(1,login_name);
                                    insert.setString(2,pass);
                                    
                                    insert.executeUpdate();
                                    
                                }
                                catch(Exception e)
                                {
                                    JOptionPane.showMessageDialog(this, e);
                                    count++;
                                }
                        }
                        /*catch (ClassNotFoundException ex) {
                                    JOptionPane.showMessageDialog(this, "1");
                                   //Logger.getLogger(crud.class.getName()).log(Level.SEVERE, null, ex);
                       } */catch (SQLException ex) {
                                    JOptionPane.showMessageDialog(this, ex);
                                    count++;
                                    // Logger.getLogger(crud.class.getName()).log(Level.SEVERE, null, ex);
                       } 
                             if(count==0)
                             {
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

          admin_home po=new admin_home();
          po.setVisible(true);
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
            java.util.logging.Logger.getLogger(Placement_officer_regestration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Placement_officer_regestration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Placement_officer_regestration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Placement_officer_regestration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Placement_officer_regestration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtcpass;
    private com.toedter.calendar.JDateChooser txtdob;
    private javax.swing.JTextField txtfname;
    private javax.swing.JTextField txtlname;
    private javax.swing.JTextField txtmail;
    private javax.swing.JTextField txtmobile;
    private javax.swing.JTextField txtpass;
    private javax.swing.JTextField txtrad;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
