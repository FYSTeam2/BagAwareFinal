/*
 * Manager main screen v 1 - The main screen form where a manager type user
 * can manage the cases for the , has option to call for a graph
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

public class ManagerMainScreen extends javax.swing.JFrame {

    public static String labelCodeSelected = null;
    Connection conn = null;
    ResultSet rs1 = null;
    ResultSet rs2 = null;
    PreparedStatement pst = null;
    public static ResultSet rsmatch = null;
    ResultSet rs = null;
    private JavaConnect jc;
    
    /**
     * Creates new form ManagerPopupScreen
     */
    ManagerMainScreen() {
        initComponents();
        jc = new JavaConnect();
        Update_Table();


    }

      private void Update_Table() {
        try {
            conn = jc.ConnecrDb();
            String sql = "SELECT baglabelcode 'Bagage Label', Status, "
                    + "Datecreated 'Created On' "
                    + "FROM bagawaredb.FOUND";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            tableCases.setModel(DbUtils.resultSetToTableMod
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            System.out.println(e.getMessage());
        }
    }

    private void TableSearch() {
        try {

            String sql = "select * from bagawaredb.FOUND where (username=? OR"
                    + " brand=? OR color=? weight=?)";
            pst = conn.prepareStatement(sql);
            pst.setString(1, txt_search.getText());
            pst.setString(2, txt_search.getText());
            pst.setString(3, txt_search.getText());
            pst.setString(4, txt_search.getText());
            rs = pst.executeQuery();
            tableCases.setModel(DbUtils.resultSetToTableModel(rs));

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
        jLabel1 = new javax.swing.JLabel();
        button_logout = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        button_refresh = new javax.swing.JButton();
        button_Statistics = new javax.swing.JButton();
        button_search = new javax.swing.JButton();
        txt_search = new javax.swing.JTextField();
        button_delete = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCases = new javax.swing.JTable();
        jScrollBar1 = new javax.swing.JScrollBar();
        button_findmatch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(159, 13, 10));
        jPanel1.setForeground(new java.awt.Color(159, 13, 10));
        jPanel1.setToolTipText("");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bagawareapp/logo - Small.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        button_logout.setText("Logout");
        button_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_logoutActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Manager");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("Logged in as:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setText(usernameOfLogin);

        jLabel10.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(240, 240, 240));
        jLabel10.setText(locationOfLogin);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(240, 240, 240));
        jLabel9.setText("Location:");

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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button_refresh)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button_logout))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(button_logout)
                            .addComponent(button_refresh))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        button_Statistics.setText("Statistics");
        button_Statistics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_StatisticsActionPerformed(evt);
            }
        });

        button_search.setText("Search");
        button_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_searchActionPerformed(evt);
            }
        });

        button_delete.setText("Delete case");
        button_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_deleteActionPerformed(evt);
            }
        });

        jButton6.setText("Create new case");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
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
        jScrollPane1.setViewportView(tableCases);

        button_findmatch.setText("Find match");
        button_findmatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_findmatchActionPerformed(evt);
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
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(button_delete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(button_findmatch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(button_search, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button_Statistics, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(617, Short.MAX_VALUE)
                    .addComponent(jScrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_Statistics)
                    .addComponent(button_search)
                    .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_delete)
                    .addComponent(jButton6)
                    .addComponent(button_findmatch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(165, Short.MAX_VALUE)
                    .addComponent(jScrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_logoutActionPerformed
        //close current window
        this.dispose();
        //reopen the loginscreen
        LogonScreen login = new LogonScreen();
        login.setVisible(true);
        java.awt.EventQueue.invokeLater(new Runnable() {
            // these lines force the login screen to the foreground and centere it
            public void run() {
                login.toFront();
                login.repaint();
                login.setLocationRelativeTo(null);
            }
        });
    }//GEN-LAST:event_button_logoutActionPerformed

    private void button_StatisticsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_StatisticsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_StatisticsActionPerformed

    private void button_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_searchActionPerformed
        TableSearch();        // TODO add your handling code here:
    }//GEN-LAST:event_button_searchActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void Table_CasesMouseClicked(java.awt.event.MouseEvent evt) {

        try {
            int row = tableCases.getSelectedRow();
            String TableClick = (String) (tableCases.getModel().getValueAt(row, 0));
            String sql = "SELECT * FROM bagawaredb.FOUND where baglabelcode='" + TableClick + "' ";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();

            if (rs.next()) {

                String add1 = rs.getString("baglabelcode");
                labelCodeSelected = add1;
            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);

        }
    }
    private void button_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_deleteActionPerformed
        CasePopupDelete CDelete = new CasePopupDelete();
        CDelete.setVisible(true);
        java.awt.EventQueue.invokeLater(new Runnable() {
            // these lines force the screen to the foreground and centere it
            public void run() {
                CDelete.toFront();
                CDelete.repaint();
                CDelete.setLocationRelativeTo(null);
            }
        });        // TODO add your handling code here:
    }//GEN-LAST:event_button_deleteActionPerformed

    private void button_findmatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_findmatchActionPerformed
        try {

            String sql1 = "SELECT baglabelcode FROM bagawaredb.LOST";
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
                    String sql = "SELECT (baglabelcode, status, datecreated) FROM bagawaredb.FOUND WHERE brand =?";
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
                        String sql = "SELECT (baglabelcode, status, datecreated) FROM bagawaredb.FOUND WHERE brand =?";
                        pst = conn.prepareStatement(sql1);
                        pst.setString(1, sql1);
                        rsmatch = pst.executeQuery();
                        tableCases.setModel(DbUtils.resultSetToTableModel(rs));
                    } else {
                        JOptionPane.showMessageDialog(null, "No matches found");
                    }
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_button_findmatchActionPerformed

    private void button_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_refreshActionPerformed
        //refreshes the screen and table contents
        ManagerMainScreen MMain = new ManagerMainScreen();
        MMain.setTitle("Manager Main Screen");        // set title
        MMain.setVisible(true);
        java.awt.EventQueue.invokeLater(new Runnable() {
            // these lines force the screen to the foreground and centere it
            public void run() {
                MMain.toFront();
                MMain.repaint();
                MMain.setLocationRelativeTo(null);
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
            java.util.logging.Logger.getLogger(ManagerMainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagerMainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagerMainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagerMainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagerMainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_Statistics;
    private javax.swing.JButton button_delete;
    private javax.swing.JButton button_findmatch;
    private javax.swing.JButton button_logout;
    private javax.swing.JButton button_refresh;
    private javax.swing.JButton button_search;
    private javax.swing.JButton jButton6;
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
