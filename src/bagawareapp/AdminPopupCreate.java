/*
 * Admin create popup screen V 1- A popup from where an administrator can create
 * a new account
 */
package bagawareapp;

/**
 *
 * @author Team2FYS - IS106
 */
import static bagawareapp.LogonScreen.locationOfLogin;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.*;

public class AdminPopupCreate extends javax.swing.JFrame {
    
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    /**
     * Creates new form AdminPopupCreate
     */
    AdminPopupCreate() {

        initComponents();
        JavaConnect JavaConnect = new JavaConnect();
        conn = JavaConnect.ConnecrDb();
        //add locations to the combobox via method
        FillTypeBox();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    //Netbeans autocode for the layout of the admin main screen
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        field_fname = new javax.swing.JTextField();
        field_lname = new javax.swing.JTextField();
        field_username = new javax.swing.JTextField();
        field_birthdate = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        combobox_type = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        button_confirm = new javax.swing.JButton();
        button_cancel = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        field_password = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        field_fname.setText("First name");
        field_fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field_fnameActionPerformed(evt);
            }
        });

        field_lname.setText("Last name");
        field_lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field_lnameActionPerformed(evt);
            }
        });

        field_username.setText("Username");
        field_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field_usernameActionPerformed(evt);
            }
        });

        field_birthdate.setText("YYYY/MM/DD");
        field_birthdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field_birthdateActionPerformed(evt);
            }
        });

        jLabel2.setText("Birth date");

        jLabel3.setText("User type");

        button_confirm.setText("Confirm");
        button_confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_confirmActionPerformed(evt);
            }
        });

        button_cancel.setText("Cancel");
        button_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_cancelActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(159, 13, 10));
        jPanel1.setForeground(new java.awt.Color(159, 13, 10));
        jPanel1.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Create account");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        field_password.setText("*****");

        jLabel4.setText("Password");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                                .addGap(24, 24, 24))
                            .addComponent(field_birthdate, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(field_fname, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(field_lname, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(field_username, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))
                                .addGap(39, 39, 39)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(button_confirm)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(button_cancel))
                            .addComponent(combobox_type, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(field_password, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(field_fname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(field_lname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(field_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combobox_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(field_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(7, 7, 7)
                .addComponent(field_birthdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_confirm)
                    .addComponent(button_cancel))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void field_fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field_fnameActionPerformed

    private void field_lnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field_lnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field_lnameActionPerformed

    private void field_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field_usernameActionPerformed

    private void field_birthdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field_birthdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field_birthdateActionPerformed

    private void button_confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_confirmActionPerformed
        //at press save the data from the form into the database

        try {
            String sqlLocation = "INSERT INTO ACCOUNT (username, password,"
                    + " fname, lname, birthday, accountcreatedate,"
                    + " LOCATION_locationcode, TYPE_typecode) VALUE"
                    + " (?,?,?,?,?,?,?,?)";
            pst = conn.prepareStatement(sqlLocation);

            pst.setString(1, field_username.getText());
            pst.setString(2, field_password.getPassword().toString());
            pst.setString(3, field_fname.getText());
            pst.setString(4, field_lname.getText());
            pst.setString(5, field_birthdate.getText());
            pst.setString(6, now());
            pst.setString(7, locationOfLogin);
            pst.setString(8, (String) combobox_type.getSelectedItem());
            pst.executeUpdate();

            //close create window and refresh table
            //JavaConnect.closeDb(); //close DB connection    // gives an error
            this.dispose();

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);


    }//GEN-LAST:event_button_confirmActionPerformed

    }
    private void button_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_cancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_button_cancelActionPerformed
    private void FillTypeBox() {
        try {
            String sqlLocation = "SELECT * FROM bagawaredb.TYPE";
            pst = conn.prepareStatement(sqlLocation);
            rs = pst.executeQuery();

            while (rs.next()) {
                String type = rs.getString("typecode");
                combobox_type.addItem(type);

            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);

        }
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
            java.util.logging.Logger.getLogger(AdminPopupCreate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminPopupCreate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminPopupCreate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPopupCreate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPopupCreate().setVisible(true);
            }
        });
    }
    private static final String DATE_FORMAT_NOW = "yyyy-MM-dd";

    public static String now() {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT_NOW);
        return sdf.format(cal.getTime());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton button_cancel;
    private javax.swing.JButton button_confirm;
    private javax.swing.JComboBox combobox_type;
    private javax.swing.JTextField field_birthdate;
    private javax.swing.JTextField field_fname;
    private javax.swing.JTextField field_lname;
    private javax.swing.JPasswordField field_password;
    private javax.swing.JTextField field_username;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
