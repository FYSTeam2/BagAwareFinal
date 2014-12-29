/*
 * Employee main screen v 1 - The main screen form where an employee type user
 * can manage the cases for the baggage
 */
package bagawareapp;

/**
 *
 * @author Team2FYS - IS106
 */
import static bagawareapp.LogonScreen.locationOfLogin;
import static bagawareapp.LogonScreen.usernameOfLogin;
import bagawareapp.AdminMainScreen;
import java.sql.*;
import javax.swing.*;
import net.proteanit.sql.DbUtils;

public class EmployeeMainScreen extends javax.swing.JFrame {

    public static String labelCodeSelected = null;
    Connection conn = null;
    ResultSet rs1 = null;
    ResultSet rs2 = null;
    PreparedStatement pst = null;
    public static ResultSet rsmatch = null;
    ResultSet rs = null;
    JavaConnect JavaConnect = new JavaConnect();
    /**
     * Creates new form ManagerPopupScreen
     */
    EmployeeMainScreen() {
        initComponents();
        conn = JavaConnect.ConnecrDb();
        Update_Table();
        // JavaConnect.closeDb();   // database later pas closen
    }

    private void Update_Table() {
        try {
            conn = JavaConnect.ConnecrDb();
            String sql = "SELECT baglabelcode AS 'Bagage Label', Status, "
                    + "Datecreated AS 'Created On'"
                    + "FROM bagawaredb.FOUND";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            tableCases.setModel(DbUtils.resultSetToTableModel(rs));
            JavaConnect.closeDb();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void TableSearch() {
        try {
            conn = JavaConnect.ConnecrDb();
            String sql = "SELECT * FROM bagawaredb.FOUND WHERE (baglabelcode=?"
                    + " OR brand=? OR color=? OR weight=?)";
            pst = conn.prepareStatement(sql);
            pst.setString(1, txt_search.getText());
            pst.setString(2, txt_search.getText());
            pst.setString(3, txt_search.getText());
            pst.setString(4, txt_search.getText());
            rs = pst.executeQuery();
            tableCases.setModel(DbUtils.resultSetToTableModel(rs));
            JavaConnect.closeDb();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
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
        button_logout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        button_refresh = new javax.swing.JButton();
        button_search = new javax.swing.JButton();
        button_newcase = new javax.swing.JButton();
        txt_search = new javax.swing.JTextField();
        button_delete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCases = new javax.swing.JTable();
        jScrollBar1 = new javax.swing.JScrollBar();
        button_findmatch = new javax.swing.JButton();
        button_newcase1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(159, 13, 10));
        jPanel1.setForeground(new java.awt.Color(159, 13, 10));
        jPanel1.setToolTipText("");
        jPanel1.setPreferredSize(new java.awt.Dimension(653, 140));

        button_logout.setText("Logout");
        button_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_logoutActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bagawareapp/logo - Small.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Service employee");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("Logged in as:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setText(usernameOfLogin);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(240, 240, 240));
        jLabel9.setText("Location:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(240, 240, 240));
        jLabel10.setText(locationOfLogin);

        button_refresh.setText("Refresh");
        button_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_refreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button_refresh)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button_logout))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 8, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(button_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button_refresh))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(45, 45, 45))
        );

        button_search.setText("Search");
        button_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_searchActionPerformed(evt);
            }
        });

        button_newcase.setText("New case");
        button_newcase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_newcaseActionPerformed(evt);
            }
        });

        button_delete.setText("Delete case");
        button_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_deleteActionPerformed(evt);
            }
        });

        tableCases.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Case ID", "Status", "Created on"
            }
        ));
        tableCases.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableCasesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableCases);

        button_findmatch.setText("Find matches");
        button_findmatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_findmatchActionPerformed(evt);
            }
        });

        button_newcase1.setText("Edit case");
        button_newcase1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_newcase1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(button_newcase, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(button_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button_newcase1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(button_findmatch, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button_search, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_search)
                    .addComponent(button_newcase)
                    .addComponent(button_delete)
                    .addComponent(button_findmatch)
                    .addComponent(button_newcase1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
                    .addComponent(jScrollBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
 * Log out and open login screen
 * @param evt 
 */
    private void button_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_logoutActionPerformed
        //close current window
        this.dispose();
        //reopen the loginscreen
        LogonScreen login = new LogonScreen();
        login.setTitle("BagAware - Login Screen");      // title (of loginscreen) at logout
        login.setVisible(true);
        java.awt.EventQueue.invokeLater(new Runnable() {
            // these lines force the login screen to the foreground and center it
            public void run() {
                login.toFront();
                login.repaint();
                login.setLocationRelativeTo(null);
            }
        });
    }//GEN-LAST:event_button_logoutActionPerformed

    private void button_newcaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_newcaseActionPerformed
        //Open the window to create a new case
        CasePopupNew cCreate = new CasePopupNew();
        cCreate.setVisible(true);
        java.awt.EventQueue.invokeLater(new Runnable() {
            // these lines force the screen to the foreground and centere it
            public void run() {
                cCreate.toFront();
                cCreate.repaint();
                cCreate.setLocationRelativeTo(null);
            }
        });
    }//GEN-LAST:event_button_newcaseActionPerformed

    private void tableCasesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCasesMouseClicked

        try {
            conn = JavaConnect.ConnecrDb();
            int row = tableCases.getSelectedRow();
            String tableClick = (String) (tableCases.getModel().getValueAt(row, 0));
            String sql = "SELECT * FROM bagawaredb.FOUND WHERE baglabelcode='"
                    + tableClick + "' ";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();

            if (rs.next()) {

                String add1 = rs.getString("baglabelcode");
                labelCodeSelected = add1;
            }
            JavaConnect.closeDb();
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);

        }
    }//GEN-LAST:event_tableCasesMouseClicked

    private void button_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_deleteActionPerformed
        CasePopupDelete cDelete = new CasePopupDelete();
        cDelete.setVisible(true);
        java.awt.EventQueue.invokeLater(new Runnable() {
            // these lines force the screen to the foreground and centere it
            public void run() {
                cDelete.toFront();
                cDelete.repaint();
                cDelete.setLocationRelativeTo(null);
            }
        });// TODO add your handling code here:
    }//GEN-LAST:event_button_deleteActionPerformed

    private void button_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_searchActionPerformed
        TableSearch();
    }//GEN-LAST:event_button_searchActionPerformed

    private void button_findmatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_findmatchActionPerformed
        try {
            conn = JavaConnect.ConnecrDb();

            String sql1 = "SELECT baglabelcode  FROM bagawaredb.LOST";
            String sql2 = "SELECT baglabelcode FROM bagawaredb.FOUND";

            pst = conn.prepareStatement(sql1);
            rs1 = pst.executeQuery();
            pst = conn.prepareStatement(sql2);
            rs2 = pst.executeQuery();

            if (rs1.equals(rs2)) {
                JOptionPane.showMessageDialog(null, "Match found for " + sql1);
                //update tabel with match
                String sql = "SELECT (baglabelcode, status, datecreated) FROM"
                        + " bagawaredb.FOUND WHERE baglabelcode =?";
                pst = conn.prepareStatement(sql1);
                pst.setString(1, sql1);
                rsmatch = pst.executeQuery();
                tableCases.setModel(DbUtils.resultSetToTableModel(rs));
            } else {

                sql1 = "SELECT brand, color FROM bagawaredb.LOST";
                sql2 = "SELECT brand, color FROM bagawaredb.FOUND";

                pst = conn.prepareStatement(sql1);
                rs1 = pst.executeQuery();
                pst = conn.prepareStatement(sql2);
                rs2 = pst.executeQuery();

                if (rs1.equals(rs2)) {
                    String sql = "SELECT (baglabelcode, status, datecreated)"
                            + " FROM bagawaredb.FOUND WHERE brand =?";
                    pst = conn.prepareStatement(sql1);
                    pst.setString(1, sql1);
                    rsmatch = pst.executeQuery();
                    tableCases.setModel(DbUtils.resultSetToTableModel(rs));
                } else {

                    sql1 = "SELECT weight FROM bagawaredb.LOST";
                    sql2 = "SELECT weight color FROM bagawaredb.FOUND";

                    pst = conn.prepareStatement(sql1);
                    rs1 = pst.executeQuery();
                    pst = conn.prepareStatement(sql2);
                    rs2 = pst.executeQuery();

                    if (rs1.equals(rs2)) {
                        String sql = "SELECT (baglabelcode, status, datecreated)"
                                + " FROM bagawaredb.FOUND WHERE brand =?";
                        pst = conn.prepareStatement(sql1);
                        pst.setString(1, sql1);
                        rsmatch = pst.executeQuery();
                        tableCases.setModel(DbUtils.resultSetToTableModel(rs));
                    } else {
                        JOptionPane.showMessageDialog(null, "No matches found");
                    }
                }
            }
            
            JavaConnect.closeDb();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_button_findmatchActionPerformed

    private void button_newcase1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_newcase1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_newcase1ActionPerformed

    private void button_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_refreshActionPerformed
        //refreshes the screen and table contents
        EmployeeMainScreen EMain = new EmployeeMainScreen();
        EMain.setTitle("Employee Main Screen");        // set title
        EMain.setVisible(true);
        java.awt.EventQueue.invokeLater(new Runnable() {
            // these lines force the screen to the foreground and centere it
            public void run() {
                EMain.toFront();
                EMain.repaint();
                EMain.setLocationRelativeTo(null);
            }
        });
        this.dispose();
    }//GEN-LAST:event_button_refreshActionPerformed

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
            java.util.logging.Logger.getLogger(EmployeeMainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeMainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeMainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeMainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeMainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_delete;
    private javax.swing.JButton button_findmatch;
    private javax.swing.JButton button_logout;
    private javax.swing.JButton button_newcase;
    private javax.swing.JButton button_newcase1;
    private javax.swing.JButton button_refresh;
    private javax.swing.JButton button_search;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableCases;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables
}
