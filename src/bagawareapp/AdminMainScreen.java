/*
 * Admin main screen v 1 - The main screen form where an administrator type user
 * can manage the accounts of the users of the app
 */
package bagawareapp;

/**
 *
 * @author Team2FYS - IS106
 */
import static bagawareapp.LogonScreen.locationOfLogin;
import static bagawareapp.LogonScreen.usernameOfLogin;

import java.sql.*;
import javax.swing.*;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Jens
 */
public class AdminMainScreen extends javax.swing.JFrame {

    /**
     * @description makes the variables
     */
    public static String usernameSelected = null;
    //variables below server for db connection and querries
    private Connection conn = null;
    private ResultSet rs = null;
    private PreparedStatement pst = null;
    private JavaConnect JavaConnect = new JavaConnect();

    /**
     * @description Creates new form AdminMainScreen
     */
    AdminMainScreen() {
        /**
         * @description Updates and fills the table
         */
        initComponents();
        conn = JavaConnect.ConnecrDb();
        updateTable();
        JavaConnect.closeDb();

    }

    /**
     * @description method to fill the table with account data
     */
    private void updateTable() {
        try {
            //Connection openen gebeurt hier.
            conn = JavaConnect.ConnecrDb();
            String sql = "SELECT username AS 'Username', Type_typecode AS "
                    + "'User Type', accountcreatedate AS 'Date Created' "
                    + "FROM bagawaredb.ACCOUNT";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            tableAccounts.setModel(DbUtils.resultSetToTableModel(rs));
            JavaConnect.closeDb();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Table cannot be found");
        }

    }

    /**
     * This method is called from within the constructor to initialise the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        logoutbutton = new javax.swing.JButton();
        button_refresh = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableAccounts = new javax.swing.JTable();
        jScrollBar1 = new javax.swing.JScrollBar();
        jPanel3 = new javax.swing.JPanel();
        newuserbutton = new javax.swing.JButton();
        editUserButton = new javax.swing.JButton();
        Button_Delete = new javax.swing.JButton();

        jButton3.setText("jButton3");

        jButton2.setText("jButton2");

        jButton5.setText("jButton5");

        jButton4.setText("jButton4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel2.setBackground(new java.awt.Color(156, 13, 10));
        jPanel2.setForeground(new java.awt.Color(156, 10, 13));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bagawareapp/logo - Small.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        logoutbutton.setText("Logout");
        logoutbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutbuttonActionPerformed(evt);
            }
        });

        button_refresh.setText("Refresh");
        button_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_refreshActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Location:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Administrator");

        jLabel6.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText(usernameOfLogin);

        jLabel8.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(240, 240, 240));
        jLabel8.setText(locationOfLogin);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Logged in as:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(button_refresh)
                        .addGap(92, 92, 92))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(471, Short.MAX_VALUE)))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(569, Short.MAX_VALUE)
                    .addComponent(logoutbutton)
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(button_refresh)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(63, Short.MAX_VALUE)))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(logoutbutton)
                    .addContainerGap(106, Short.MAX_VALUE)))
        );

        tableAccounts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Username", "User type", "Created on"
            }
        ));
        tableAccounts.setEnabled(false);
        tableAccounts.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tableAccountsFocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(tableAccounts);
        if (tableAccounts.getColumnModel().getColumnCount() > 0) {
            tableAccounts.getColumnModel().getColumn(0).setHeaderValue("Username");
            tableAccounts.getColumnModel().getColumn(1).setHeaderValue("User type");
            tableAccounts.getColumnModel().getColumn(2).setHeaderValue("Created on");
        }

        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        newuserbutton.setText("Create new user");
        newuserbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newuserbuttonActionPerformed(evt);
            }
        });
        jPanel3.add(newuserbutton);

        editUserButton.setText("Edit user");
        editUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editUserButtonActionPerformed(evt);
            }
        });
        jPanel3.add(editUserButton);

        Button_Delete.setText("Delete user");
        Button_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_DeleteActionPerformed(evt);
            }
        });
        jPanel3.add(Button_Delete);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(617, Short.MAX_VALUE)
                    .addComponent(jScrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(182, Short.MAX_VALUE)
                    .addComponent(jScrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(152, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(318, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @description Action performed to log the user out
     * @param evt
     */
    private void logoutbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutbuttonActionPerformed
        //close current window
        this.dispose();
        //reopen the loginscreen
        LogonScreen login = new LogonScreen();
        login.setTitle("BagAware - Login Screen");
        login.setVisible(true);
        java.awt.EventQueue.invokeLater(new Runnable() {
            //these lines force the login screen to the foreground and center it
            public void run() {
                login.toFront();
                login.repaint();
                login.setLocationRelativeTo(null);
            }
        });

    }//GEN-LAST:event_logoutbuttonActionPerformed

    /**
     * @description Opens a popup to create a new user when the "Create new
     * user" button is pressed
     * @param evt
     */
    private void newuserbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newuserbuttonActionPerformed
        AdminPopupCreate aCreate = new AdminPopupCreate();
        aCreate.setTitle("BagAware - Create A New User Account");   // set title
        aCreate.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        // when (X) button is pressed, closes only the popup
        aCreate.setVisible(true);
        java.awt.EventQueue.invokeLater(new Runnable() {

            // these lines force the screen to the foreground and centere it
            public void run() {
                aCreate.toFront();
                aCreate.repaint();
                aCreate.setLocationRelativeTo(null);
            }
        });
    }//GEN-LAST:event_newuserbuttonActionPerformed

    /**
     * @description selects the entry in table when it is mouse clicked
     * @param evt
     */
    public void Table_CasesMouseClicked(java.awt.event.MouseEvent evt) {

        try {
            conn = JavaConnect.ConnecrDb();
            int row = tableAccounts.getSelectedRow();
            String tableClick = (String) (tableAccounts.getModel()
                    .getValueAt(row, 0));
            String sql = "SELECT * FROM bagawaredb.Accounts where username=?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, tableClick);
            rs = pst.executeQuery();

            if (rs.next()) {

                String add1 = rs.getString("username");
                usernameSelected = add1;
            }
            JavaConnect.closeDb();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "invalid username");
        }
    }

    /**
     * @description Refreshes the table when the "Refresh" button is pressed
     * @param evt
     */
    private void button_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_refreshActionPerformed
        //refreshes the screen and table contents
        AdminMainScreen AMain = new AdminMainScreen();
        AMain.setTitle("Administrator Main Screen");        // set title
        AMain.setVisible(true);
        java.awt.EventQueue.invokeLater(new Runnable() {
            // these lines force the screen to the foreground and centere it
            public void run() {
                AMain.toFront();
                AMain.repaint();
                AMain.setLocationRelativeTo(null);
            }
        });
        this.dispose();
    }//GEN-LAST:event_button_refreshActionPerformed

    /**
     * @description Makes the table non-editable but only selectable
     * @param evt
     */
    private void tableAccountsMouseReleased(java.awt.event.MouseEvent evt) {
        if (tableAccounts.isEditing()) {
            tableAccounts.getCellEditor().stopCellEditing();
        }
        tableAccounts.putClientProperty("terminateEditOnFocusLost", Boolean.TRUE);
    }

    /**
     * @description gives the edit button the function
     * @param evt
     */
    private void editUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editUserButtonActionPerformed
        //Open the window to edit a user
        AdminPopupEdit aEdit = new AdminPopupEdit();
        aEdit.setTitle("BagAware - Edit A New User Account");   // set title
        aEdit.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        // when (X) button is pressed, closes only the popup
        aEdit.setVisible(true);
        java.awt.EventQueue.invokeLater(new Runnable() {
            // these lines force the screen to the foreground and center it
            public void run() {
                aEdit.toFront();
                aEdit.repaint();
                aEdit.setLocationRelativeTo(null);
            }
        });
    }//GEN-LAST:event_editUserButtonActionPerformed
    /**
     * @description gives the delete button a function
     * @param evt
     */
    private void Button_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_DeleteActionPerformed
        final AdminPopupDelete aDelete = new AdminPopupDelete();
        aDelete.setTitle("BagAware - Delete A User Account");   // set title
        aDelete.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        // when (X) button is pressed, closes only the popup
        aDelete.setVisible(true);
        java.awt.EventQueue.invokeLater(new Runnable() {
            // these lines force the screen to the foreground and centere it
            public void run() {
                aDelete.toFront();
                aDelete.repaint();
                aDelete.setLocationRelativeTo(null);
            }
        });
    }//GEN-LAST:event_Button_DeleteActionPerformed

    private void tableAccountsFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tableAccountsFocusGained
    }//GEN-LAST:event_tableAccountsFocusGained

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
            java.util.logging.Logger.getLogger(AdminMainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminMainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminMainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminMainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminMainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Delete;
    private javax.swing.JButton button_refresh;
    private javax.swing.JButton editUserButton;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logoutbutton;
    private javax.swing.JButton newuserbutton;
    public javax.swing.JTable tableAccounts;
    // End of variables declaration//GEN-END:variables
}
