
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer
 */
public class admin_list extends javax.swing.JFrame {

        Connection con1;
        Connection con;
        PreparedStatement insert;
        String result;
        
        
        public void tableupdate(){
             /*
            
            // this code will not override the list
            
            try{
                       //Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection con;
                        con = DriverManager.getConnection("jdbc:mysql://localhost:3307/campus_recruitment_system","root","");
                        Statement stmt = con.createStatement();
                        String sql="SELECT `S.No`,`F_Name`, `L_Name`, `DOB`, `Gender`, `Email_Id`, `Contact_Number`, `Staff_Admin` FROM `admin_registration`";
                                

                    ResultSet rs = stmt.executeQuery(sql);
                    while(rs.next())
                    {
                             String sno=rs.getString("S.No");
                             String F_Name=rs.getString("F_Name");
                             String L_Name=rs.getString("L_Name");
                             String DOB=rs.getString("DOB");
                             String Gender=rs.getString("Gender");
                             String Email_Id=rs.getString("Email_Id");
                             String Contact_Number= String.valueOf(rs.getInt("Contact_Number"));
                             String Staff_Admin=rs.getString("Staff_Admin");
                             
                             String tbdata[]={sno,F_Name,L_Name,DOB,Gender,Email_Id,Contact_Number,Staff_Admin};
                             DefaultTableModel tb=(DefaultTableModel)jTable1.getModel();
                             tb.addRow(tbdata);
                    }
                    

            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(this, e);
                
            }*/
             
             //ordeer
             
            
  
        // order
        
                try {
       Class.forName("com.mysql.cj.jdbc.Driver");
       Connection kk;
       kk = DriverManager.getConnection	("jdbc:mysql://localhost:3307/campus_recruitment_system","root","");
        Statement stmt = kk.createStatement();
        String sql="set @autoid :=0";
 	String sql1="update admin_registration set `S.No` = @autoid := (@autoid+1);";
 	String sql2="alter table admin_registration Auto_Increment = 1 ";
        String q1="set @autoid :=0";
 	String q2="update admin_login set `S.No` = @autoid := (@autoid+1);";
 	String q3="alter table admin_login Auto_Increment = 1 ";

		 stmt.executeUpdate(sql);
		 stmt.executeUpdate(sql1);
                 stmt.executeUpdate(sql2);
                 stmt.executeUpdate(q1);
		 stmt.executeUpdate(q2);
                 stmt.executeUpdate(q3);
}
catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        } 
             
             
             
             // table view
             
  
    int  c;
     
     try {
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection con;
                        con = DriverManager.getConnection("jdbc:mysql://localhost:3307/campus_recruitment_system","root","");
                        Statement stmt = con.createStatement();
                        String sql="SELECT `S.No`,`F_Name`, `L_Name`, `DOB`, `Gender`, `Email_Id`, `Contact_Number`, `Staff_Admin` FROM `admin_registration`";
                        ResultSet rs = stmt.executeQuery(sql);
            
            ResultSetMetaData RSMD = rs.getMetaData();
            c = RSMD.getColumnCount();
            
            DefaultTableModel DFT = (DefaultTableModel) jTable1.getModel();
            DFT.setRowCount(0);
            
            while (rs.next()) {
                Vector v2 = new Vector();
           
                for(int a=1;a<=c;a++) {
                    v2.add(rs.getString("S.No"));
                    v2.add(rs.getString("F_Name"));
                    v2.add(rs.getString("L_Name"));
                    v2.add(rs.getString("DOB"));
                    v2.add(rs.getString("Gender"));
                    v2.add(rs.getString("Email_Id"));
                    v2.add(rs.getString("Contact_Number"));
                    v2.add(rs.getString("Staff_Admin"));
                }
                DFT.addRow(v2);
            }   
            
     }catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        } 
    }
        
    public admin_list() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtfname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtlname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtnum = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txtdob = new javax.swing.JTextField();
        txtgender = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Admin's List\n", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 2, 24))); // NOI18N
        jPanel2.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));
        jPanel3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanel3KeyPressed(evt);
            }
        });
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "S.no", "F_Name", "L_Name", "DOB", "Gender", "Email_Id", "Contact_Number", "Staff_Admin"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 13, 674, 315));

        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 350, -1, -1));

        jLabel1.setText("F_Name");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 187, -1));
        jPanel3.add(txtfname, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 36, 227, -1));

        jLabel2.setText("L_Name");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 65, 227, -1));
        jPanel3.add(txtlname, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 88, 227, -1));

        jLabel3.setText("DOB");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 119, 227, -1));

        jLabel4.setText("Gender");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 171, 227, -1));

        jLabel5.setText("Email_Id");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 227, -1));
        jPanel3.add(txtmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 227, -1));

        jLabel6.setText("Contact Number");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 227, -1));
        jPanel3.add(txtnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 227, -1));

        jButton1.setText("update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 350, -1, -1));
        jPanel3.add(txtdob, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 142, 227, -1));

        txtgender.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtgenderMouseExited(evt);
            }
        });
        txtgender.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtgenderKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtgenderKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtgenderKeyTyped(evt);
            }
        });
        jPanel3.add(txtgender, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 90, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel8.setText("* Only type M,F or O.");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 140, -1));

        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, -1, -1));

        jButton5.setText("Logout");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 420, -1, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 936, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
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
// Delete      
         DefaultTableModel tb=(DefaultTableModel)jTable1.getModel();
         int selectedIndex = jTable1.getSelectedRow();
        
         try{
            // int sno = Integer.parseInt(tb.getValueAt(selectedIndex,0).toString());
             String name=tb.getValueAt(selectedIndex,1).toString();
             int dialogResult = JOptionPane.showConfirmDialog(null,"Do you want to delete","Warning",JOptionPane.YES_NO_OPTION);
             if(dialogResult == JOptionPane.YES_OPTION)
                    {
                        Connection con;
                        con = DriverManager.getConnection("jdbc:mysql://localhost:3307/campus_recruitment_system","root","");
                        PreparedStatement insert;
                        insert=con.prepareStatement("delete from admin_registration where F_Name= ?");
                        insert.setString(1,name);
                        insert.executeUpdate();
                        JOptionPane.showMessageDialog(this, "Record Deleted");
                        tableupdate();  
                    }
         }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,"1" +e);
            
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//update

                 String c=txtgender.getText();
                 String n=txtnum.getText();
                 String fname=txtfname.getText();
                 String lname=txtlname.getText();
              String mail=txtmail.getText();
              String mobile=txtnum.getText();
              String dob=txtdob.getText();
              int sc_num=0;
              Connection con;
              // special character and number count
              
              
        if(fname.isEmpty() ||lname.isEmpty() ||mail.isEmpty() ||mobile.isEmpty() ||dob.isEmpty() ||c.isEmpty()){
            JOptionPane.showMessageDialog(this, "All feilds are Mandatory!!!. ");
        }
        else
        {
         DefaultTableModel tb = (DefaultTableModel) jTable1.getModel();
         int selectedIndex = jTable1.getSelectedRow();
         
         
                 
                 int nl=n.length();
                 int count=0;
        char a;
        a=c.charAt(0);
         String kk="";
        if(c.length()>1||c.length()==0)
        {
            JOptionPane.showMessageDialog(this, "Enter M or F or O.");
        }
        else if(nl<10 || nl>10)
        {
            JOptionPane.showMessageDialog(this, "Enter Mobile Number in Correct Format. ");
        }        
        else if(c.length()==1) {
   
            if(a=='M' || a=='m'){
                kk="M";
                
                
            }else if(a=='f' || a=='F'){
                kk="f";
                
            }else if(a=='O' || a=='o'){
                kk="o";
                
            }
            if(kk.isEmpty())
            {
                JOptionPane.showMessageDialog(this, "Enter your gender in correct format \n                 M for Male\n                 F for Female\n                 O for Others. ");
            }
            else{
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

                      if(sc_num==0)
                      {
                          try {
                                       

                                          String name=tb.getValueAt(selectedIndex,1).toString();
                                        // int id = Integer.parseInt(tb.getValueAt(selectedIndex, 0).toString());  
                                         // String fname=txtfname.getText();
                                         //String gender=txtgender.getText();
                                          

                                          con = DriverManager.getConnection("jdbc:mysql://localhost:3307/campus_recruitment_system","root","");
                                          insert=con.prepareStatement("update admin_registration set F_Name= ?,L_Name= ?,DOB=?,Gender=?,Email_Id= ?,Contact_Number= ? where F_Name= ?");


                                        insert.setString(1,fname);
                                        insert.setString(2,lname);
                                        insert.setString(3,dob);
                                        insert.setString(4,kk);

                                        insert.setString(5,mail);
                                        insert.setString(6,mobile);
                                        insert.setString(7,name);

                                        insert.executeUpdate();

                                        JOptionPane.showMessageDialog(this, "Record Updated");


                                        txtfname.setText("");
                                        txtlname.setText("");
                                        txtmail.setText("");
                                        txtnum.setText("");
                                        txtdob.setText("");
                                        txtgender.setText("");

                                        tableupdate();
                                          }             
                                            catch (SQLException e) {
                                          JOptionPane.showMessageDialog(this, "Input data in correct format. ");
                                         // Logger.getLogger(crud.class.getName()).log(Level.SEVERE, null, ex);
                                      }
                          
                            
                                }                       
                            }
                        }
                    }
                }          
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
        //selected jtable
        DefaultTableModel df = (DefaultTableModel) jTable1.getModel();
         int selectedIndex = jTable1.getSelectedRow();
        
                    txtfname.setText(df.getValueAt(selectedIndex, 1).toString());
                    txtlname.setText(df.getValueAt(selectedIndex, 2).toString());
                    txtdob.setText(df.getValueAt(selectedIndex, 3).toString());
                    txtgender.setText(df.getValueAt(selectedIndex, 4).toString());
                    
                    txtmail.setText(df.getValueAt(selectedIndex, 5).toString());
                    txtnum.setText(df.getValueAt(selectedIndex, 6).toString());
                    //txtdob.setText(df.getValueAt(selectedIndex, 3).toString());
                    
        
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jPanel3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel3KeyPressed
      
        
        
        
        
    }//GEN-LAST:event_jPanel3KeyPressed

    private void txtgenderKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtgenderKeyPressed

    }//GEN-LAST:event_txtgenderKeyPressed

    private void txtgenderKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtgenderKeyTyped

    }//GEN-LAST:event_txtgenderKeyTyped

    private void txtgenderKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtgenderKeyReleased
               
    }//GEN-LAST:event_txtgenderKeyReleased

    private void txtgenderMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtgenderMouseExited
 
    }//GEN-LAST:event_txtgenderMouseExited

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
            admin_home sl=new admin_home();
            sl.setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
            
        int dialogResult = JOptionPane.showConfirmDialog(null,"Are you sure you want to log out?","Warning",JOptionPane.YES_NO_OPTION);
        if(dialogResult == JOptionPane.YES_OPTION)
                        {
                            admin_login sl=new admin_login();
                            sl.setVisible(true);
                            this.setVisible(false);
                        }
                        
       
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(admin_list.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin_list.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin_list.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin_list.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin_list().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtdob;
    private javax.swing.JTextField txtfname;
    private javax.swing.JTextField txtgender;
    private javax.swing.JTextField txtlname;
    private javax.swing.JTextField txtmail;
    private javax.swing.JTextField txtnum;
    // End of variables declaration//GEN-END:variables
}
