import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;





public class forgot_password extends javax.swing.JFrame {

    
        
    Connection con=null;
    PreparedStatement pat=null;
    ResultSet rs=null;
    int counter=0;
    int check=1;
    PreparedStatement insert=null;
    
    Connection con1=null;
    String value;
    
    public void getval(String val)
        {
            value=val;
            
        }
    
    
    
    public forgot_password() {
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
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtfname = new javax.swing.JTextField();
        txtlname = new javax.swing.JTextField();
        txtnum = new javax.swing.JTextField();
        txtmail = new javax.swing.JTextField();
        val = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 153));

        jPanel2.setBackground(new java.awt.Color(255, 153, 153));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Recover Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 24))); // NOI18N

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Get Password");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Email_Id:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Contact_Number:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Last_Name:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("First_Name:");

        txtfname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfnameActionPerformed(evt);
            }
        });

        val.setForeground(new java.awt.Color(255, 51, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(109, 109, 109)
                        .addComponent(jButton2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(val, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(82, 82, 82)
                                        .addComponent(txtmail))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtnum)
                                    .addComponent(txtlname)
                                    .addComponent(txtfname))))
                        .addGap(99, 99, 99))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtfname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtlname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(val, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        if(value=="admin")
        {
            String fname=txtfname.getText();
            String lname=txtlname.getText();
            String num=txtnum.getText();
            String mail=txtmail.getText();

            // check button
            counter=counter+1;

            if(counter>3)
            {
                JOptionPane.showMessageDialog(this, "Limit Exceeded");
                System.exit(0);

            }else{

                try{
                    // change first 2 lines table name

                    String query="SELECT * FROM `admin_registration` WHERE `F_Name`=? and `L_Name`=? and`Email_Id`=? and `Contact_Number`=?" ;
                    con = DriverManager.getConnection("jdbc:mysql://localhost:3307/campus_recruitment_system","root","");

                    pat=con.prepareStatement(query);
                    pat.setString(1, txtfname.getText());
                    pat.setString(2, txtlname.getText());
                    pat.setString(3, txtmail.getText());
                    pat.setString(4, txtnum.getText());

                    rs=pat.executeQuery();
                    if(rs.next())
                    {
                        JOptionPane.showMessageDialog(this, "Entered details Sucessfully Matched!!!" );

                        try{
                            // change first 2 lines table name

                            //String query="SELECT * FROM `admin_registration` WHERE `F_Name`=? and `L_Name`=? and`Email_Id`=? and `Contact_Number`=?" ;
                            con = DriverManager.getConnection("jdbc:mysql://localhost:3307/campus_recruitment_system","root","");

                            pat=con.prepareStatement(query);
                            pat.setString(1, txtfname.getText());
                            pat.setString(2, txtlname.getText());
                            pat.setString(3, txtmail.getText());
                            pat.setString(4, txtnum.getText());

                            rs=pat.executeQuery();
                            if(rs.next())
                            {
                                // JOptionPane.showMessageDialog(this,  rs.getString("Login_User_Name"));
                                val.setText( "Your passowrd is = " + rs.getString("Password"));
                            }
                            else{
                                JOptionPane.showMessageDialog(this, "User does'nt exixt in system \nTry again.");
                            }
                        }
                        catch(Exception ex)
                        {
                            JOptionPane.showMessageDialog(this, ex.getMessage());
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(this, "Current password doesn't matched. Try again ");
                    }
                }
                catch(Exception ex)
                {
                    JOptionPane.showMessageDialog(this, ex.getMessage());
                }
            }

        }
        else if(value=="company")
        {

        }
        if(value=="tpo")
        {

            String fname=txtfname.getText();
            String lname=txtlname.getText();
            String num=txtnum.getText();
            String mail=txtmail.getText();

            // check button
            counter=counter+1;

            if(counter>3)
            {
                JOptionPane.showMessageDialog(this, "Limit Exceeded");
                System.exit(0);

            }else{

                try{
                    // change first 2 lines table name

                    String query="SELECT * FROM `tpo_registration` WHERE `F_Name`=? and `L_Name`=? and`Email_Id`=? and `Phone_Number`=?" ;
                    con = DriverManager.getConnection("jdbc:mysql://localhost:3307/campus_recruitment_system","root","");

                    pat=con.prepareStatement(query);
                    pat.setString(1, txtfname.getText());
                    pat.setString(2, txtlname.getText());
                    pat.setString(3, txtmail.getText());
                    pat.setString(4, txtnum.getText());

                    rs=pat.executeQuery();
                    if(rs.next())
                    {
                        JOptionPane.showMessageDialog(this, "Entered details Sucessfully Matched!!!" );

                        try{
                            // change first 2 lines table name

                            //String query="SELECT * FROM `admin_registration` WHERE `F_Name`=? and `L_Name`=? and`Email_Id`=? and `Contact_Number`=?" ;
                            con = DriverManager.getConnection("jdbc:mysql://localhost:3307/campus_recruitment_system","root","");

                            pat=con.prepareStatement(query);
                            pat.setString(1, txtfname.getText());
                            pat.setString(2, txtlname.getText());
                            pat.setString(3, txtmail.getText());
                            pat.setString(4, txtnum.getText());

                            rs=pat.executeQuery();
                            if(rs.next())
                            {
                                // JOptionPane.showMessageDialog(this,  rs.getString("Login_User_Name"));
                                val.setText( "Your passowrd is = " + rs.getString("Password"));
                            }
                            else{
                                JOptionPane.showMessageDialog(this, "User does'nt exixt in system \nTry again.");
                            }
                        }
                        catch(Exception ex)
                        {
                            JOptionPane.showMessageDialog(this, ex.getMessage());
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(this, "Current password doesn't matched. Try again ");
                    }
                }
                catch(Exception ex)
                {
                    JOptionPane.showMessageDialog(this, ex.getMessage());
                }
            }

        }
        else if(value=="student")
        {
            String fname=txtfname.getText();
            String lname=txtlname.getText();
            String num=txtnum.getText();
            String mail=txtmail.getText();

            // check button
            counter=counter+1;

            if(counter>3)
            {
                JOptionPane.showMessageDialog(this, "Limit Exceeded");
                System.exit(0);

            }else{

                try{
                    // change first 2 lines table name

                    String query="SELECT * FROM `student_registration` WHERE `F_Name`=? and `L_Name`=? and`Email_Id`=? and `Contact_Number`=?" ;
                    con = DriverManager.getConnection("jdbc:mysql://localhost:3307/campus_recruitment_system","root","");

                    pat=con.prepareStatement(query);
                    pat.setString(1, txtfname.getText());
                    pat.setString(2, txtlname.getText());
                    pat.setString(3, txtmail.getText());
                    pat.setString(4, txtnum.getText());

                    rs=pat.executeQuery();
                    if(rs.next())
                    {
                        JOptionPane.showMessageDialog(this, "Entered details Sucessfully Matched!!!" );

                        try{
                            // change first 2 lines table name

                            //String query="SELECT * FROM `admin_registration` WHERE `F_Name`=? and `L_Name`=? and`Email_Id`=? and `Contact_Number`=?" ;
                            con = DriverManager.getConnection("jdbc:mysql://localhost:3307/campus_recruitment_system","root","");

                            pat=con.prepareStatement(query);
                            pat.setString(1, txtfname.getText());
                            pat.setString(2, txtlname.getText());
                            pat.setString(3, txtmail.getText());
                            pat.setString(4, txtnum.getText());

                            rs=pat.executeQuery();
                            if(rs.next())
                            {
                                // JOptionPane.showMessageDialog(this,  rs.getString("Login_User_Name"));
                                val.setText( "Your passowrd is = " + rs.getString("Password"));
                            }
                            else{
                                JOptionPane.showMessageDialog(this, "User does'nt exixt in system \nTry again.");
                            }
                        }
                        catch(Exception ex)
                        {
                            JOptionPane.showMessageDialog(this, ex.getMessage());
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(this, "Current password doesn't matched. Try again ");
                    }
                }
                catch(Exception ex)
                {
                    JOptionPane.showMessageDialog(this, ex.getMessage());
                }
            }
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtfnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfnameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            rememberMe fu= new rememberMe();
            fu.setVisible(true);
            fu.getval(value);
            this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(forgot_password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(forgot_password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(forgot_password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(forgot_password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new forgot_password().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtfname;
    private javax.swing.JTextField txtlname;
    private javax.swing.JTextField txtmail;
    private javax.swing.JTextField txtnum;
    private javax.swing.JLabel val;
    // End of variables declaration//GEN-END:variables
}
