
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
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;


/**
 *
 * @author acer
 */
public class student_regstration extends javax.swing.JFrame {

     Connection con1;
        PreparedStatement insert;

    
    
    
    public student_regstration() {
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
        txtfname = new javax.swing.JTextField();
        txtlname = new javax.swing.JTextField();
        txtmail = new javax.swing.JTextField();
        txtmobile = new javax.swing.JTextField();
        c12 = new javax.swing.JTextField();
        txtsgpa = new javax.swing.JTextField();
        txtcgpa = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtdob = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtpass = new javax.swing.JTextField();
        txtcpass = new javax.swing.JPasswordField();
        jLabel14 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        c10 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Student Regestration", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 24))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("First Name:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 95, 110, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Last Name:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(422, 95, 110, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("D.O.B:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 147, 110, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Email:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 190, 110, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Contact Number:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(422, 147, 110, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Class 12 Marks:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(422, 230, 110, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("SGPA:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 315, 110, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("CGPA:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(422, 315, 110, 30));
        jPanel1.add(txtfname, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 100, 144, -1));

        txtlname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlnameActionPerformed(evt);
            }
        });
        jPanel1.add(txtlname, new org.netbeans.lib.awtextra.AbsoluteConstraints(537, 100, 144, -1));
        jPanel1.add(txtmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 195, 225, -1));
        jPanel1.add(txtmobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(537, 152, 144, -1));
        jPanel1.add(c12, new org.netbeans.lib.awtextra.AbsoluteConstraints(537, 235, 144, -1));
        jPanel1.add(txtsgpa, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 320, 100, -1));
        jPanel1.add(txtcgpa, new org.netbeans.lib.awtextra.AbsoluteConstraints(537, 320, 144, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("All Feilds are mandatory");
        jLabel9.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 44, 707, 33));
        jPanel1.add(txtdob, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 147, 144, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 3, 15)); // NOI18N
        jLabel10.setText("Login Information:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 294, 51));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("UserName:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, -1, -1));

        txtusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusernameActionPerformed(evt);
            }
        });
        jPanel1.add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 510, 124, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Password:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 510, 131, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Confirm Password:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 550, -1, -1));
        jPanel1.add(txtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 510, 130, -1));
        jPanel1.add(txtcpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 550, 130, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel14.setText("Describe any non academic achivement if any:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 363, -1, -1));

        jButton1.setText("Register");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 590, 135, 36));

        jButton2.setText("Back ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Gender");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(422, 190, 110, 30));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("University Id");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 278, 110, 30));
        jPanel1.add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 283, 140, -1));
        jPanel1.add(c10, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 235, 117, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("class 10");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 230, 110, 30));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 360, 270, 100));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F", "O" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 190, 100, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtlnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlnameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
           
        int count=0;
        int sc_num=0;
        
        int nl;
        int dialogResult = JOptionPane.showConfirmDialog(null,"Are you sure entered information is correct","Warning",JOptionPane.YES_NO_OPTION);

                            String id=txtid.getText();
                            String fname=txtfname.getText();
                            String lname=txtlname.getText();
                            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
                            String dob=sdf.format(txtdob.getDate());
                            
                            String mobile=txtmobile.getText();
                            String mail=txtmail.getText();
                            String class10=c10.getText();
                            String class12=c12.getText();
                            String sgpa=txtsgpa.getText();
                            String cgpa=txtcgpa.getText();
                            String other=jTextArea1.getText();
                            String login_name=txtusername.getText();
                            String pass=txtpass.getText();
                            String cpass=txtcpass.getText();
                            nl=mobile.length();
                            
                         if( id.isEmpty() || fname.isEmpty() || lname.isEmpty() || dob.isEmpty()  || mobile.isEmpty() ||  mail.isEmpty() || class10.isEmpty() || class12.isEmpty() || sgpa.isEmpty() || cgpa.isEmpty() || login_name.isEmpty() || pass.isEmpty() || cpass.isEmpty())
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
                            // check mobile num
                            if(nl<10 || nl>10)
                                {
                                    JOptionPane.showMessageDialog(this, "Enter Mobile Number in Correct Format. ");
                                    sc_num+=1;
                                }
                            
                            //check fname and lname
                    if(fname.length()!=0)
                       {
                    Pattern my_pattern = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
                    Matcher my_match = my_pattern.matcher(fname);
                    boolean check = my_match.find();
                    if (check){
                    JOptionPane.showMessageDialog(this, "Special characters and numbers are not allowed in name feilds. ");
                    sc_num+=1;
                    }
                    
                    if(sc_num==0)
                    {
                           // check for number
                     for (int i = 0; i < fname.length(); i++) { 
                            if (fname.charAt(i) >= '0'&& fname.charAt(i) <= '9') { 
                            JOptionPane.showMessageDialog(this, "Special characters and numbers are not allowed in name feilds . ");
                            sc_num+=1;
                            break;
                            }       
                        }
                        
                    }
                 
                     if(sc_num==0)
                     {
                        Pattern my_pattern1 = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
                        Matcher my_match1= my_pattern.matcher(lname);
                        boolean check1 = my_match.find();
                        if (check1){
                           JOptionPane.showMessageDialog(this, "Special characters and numbers are not allowed in name feilds. ");
                           sc_num+=1;
                        }
                     }
                     if(sc_num==0)
                      {
                        // check for numbers
                        for (int i = 0; i < lname.length(); i++) { 
                            if (lname.charAt(i) >= '0'&& lname.charAt(i) <= '9') { 
                                JOptionPane.showMessageDialog(this, "Special characters and numbers are not allowed in name feilds . ");
                                sc_num+=1;
                                break;
                        
                                }         
                            }
                      }
//1 clASSS 10  
                    

                            for (int i = 0; i < class10.length(); i++) { 
                            if (class10.charAt(i) >= 'a'&& class10.charAt(i) <= 'z' || class10.charAt(i) >= 'A'&& class10.charAt(i) <= 'Z' ) { 
                                JOptionPane.showMessageDialog(this, "Imvalid  input. Provide input without % sign.");
                                sc_num+=1;
                                break;
                                }    
                            }
//2 CLASS 12
                        for (int i = 0; i < class12.length(); i++) { 
                            if (class12.charAt(i) >= 'a'&& class12.charAt(i) <= 'z' || class12.charAt(i) >= 'A'&& class12.charAt(i) <= 'Z') { 
                                JOptionPane.showMessageDialog(this, "Imvalid  input. Provide input without % sign.");
                                sc_num+=1;
                                break;
                        
                                }         
                            }
//3 SGPA                  
                        for (int i = 0; i < sgpa.length(); i++) { 
                            if (sgpa.charAt(i) >= 'a'&& sgpa.charAt(i) <= 'z' || sgpa.charAt(i) >= 'A'&& sgpa.charAt(i) <= 'Z') { 
                                JOptionPane.showMessageDialog(this, "Imvalid  input. Provide input without % sign.");
                                sc_num+=1;
                                break;
                        
                                }         
                            }
//4 CGPA                  
                        for (int i = 0; i < cgpa.length(); i++) { 
                            if (cgpa.charAt(i) >= 'a'&& cgpa.charAt(i) <= 'z' || cgpa.charAt(i) >= 'A'&& cgpa.charAt(i) <= 'Z') { 
                                JOptionPane.showMessageDialog(this, "Imvalid  input. Provide input without % sign.");
                                sc_num+=1;
                                break;
                        
                                }         
                            }
//5 ID                     
                        for (int i = 0; i < id.length(); i++) { 
                            if (id.charAt(i) >= 'a'&& id.charAt(i) <= 'z' || id.charAt(i) >= 'A'&& id.charAt(i) <= 'Z') { 
                                JOptionPane.showMessageDialog(this, "Imvalid  input. Provide input without % sign.");
                                sc_num+=1;
                                break;
                        
                                }         
                            }
//6 EMAIL                     

int x=0;

                            for (int i = 1; i < mail.length(); i++) { 
                               if (mail.charAt(i)=='@' || mail.charAt(i)=='.' )
                               {
                                    x++;
                                   break;
                               }
                               else{
                                   JOptionPane.showMessageDialog(this, "Enter Vaild Email Id");
                                   
                               }
                            }
                            if(x==0)
                            {
                                sc_num+=1;
                                
                            }
                    
                            //JOptionPane.showMessageDialog(this, sc_num);
                            
                        if(sc_num==0)
                        {
                            try {
                              //  JOptionPane.showMessageDialog(this,"tRY" );
                           // Class.forName("com.mysql.jdbc.Driver");
                            con1 = DriverManager.getConnection("jdbc:mysql://localhost:3307/campus_recruitment_system","root","");

                            insert=con1.prepareStatement("INSERT INTO `student_registration`( `Student_Id`, `F_Name`, `L_Name`, `DOB`, `Gender`, `Contact_Number`, `Email_Id`, `10th_percentage`, `12th_percentage`, `SGPA`, `CGPA`, `Other_Info`, `Login_User_Name`, `Password`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

                            
                            insert.setString(1,id);
                            insert.setString(2,fname);
                            insert.setString(3,lname);
                            insert.setString(4,dob);
                            insert.setString(5,String.valueOf(jComboBox1.getSelectedItem()));
                            insert.setString(6,mobile);
                            insert.setString(7,mail);
                            insert.setString(8,class10);
                            insert.setString(9,class12);
                            insert.setString(10,sgpa);
                            insert.setString(11,cgpa);
                            insert.setString(12,other);
                            insert.setString(13,login_name);
                            insert.setString(14,pass);

                            insert.executeUpdate();

                            JOptionPane.showMessageDialog(this, "Regestraion Sucessfull");   
                            
                            
                            txtid.setText("");
                            txtfname.setText("");
                            txtlname.setText("");
                            c10.setText("");
                            c12.setText("");
                            txtsgpa.setText("");
                            txtcgpa.setText("");
                            //txtdob.setDate():  
                            
                            txtmobile.setText("");   
                            txtmail.setText("");
                            jTextArea1.setText("");
                            txtusername.setText("");
                            txtpass.setText("");
                            txtcpass.setText("");
                            
                            txtfname.requestFocus();
                            
                            //login details
                            
                                    try{
                                        
                                    insert=con1.prepareStatement("INSERT INTO `student_login`(`UserName`, `Password`) VALUES (?,?)");
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
                        }
                         
                            if(count==0 && sc_num==0)
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

                                }
                         
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int dialogResult = JOptionPane.showConfirmDialog(null,"Are you sure You want to cancel regestation and go back?","Warning",JOptionPane.YES_NO_OPTION);

        if(dialogResult == JOptionPane.YES_OPTION)
        {
/*
            Student_login sl=new Student_login();
            sl.setVisible(true);*/
            this.setVisible(false);
            
          
        }
           
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusernameActionPerformed

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
            java.util.logging.Logger.getLogger(student_regstration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(student_regstration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(student_regstration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(student_regstration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new student_regstration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField c10;
    private javax.swing.JTextField c12;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
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
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField txtcgpa;
    private javax.swing.JPasswordField txtcpass;
    private com.toedter.calendar.JDateChooser txtdob;
    private javax.swing.JTextField txtfname;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtlname;
    private javax.swing.JTextField txtmail;
    private javax.swing.JTextField txtmobile;
    private javax.swing.JTextField txtpass;
    private javax.swing.JTextField txtsgpa;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}