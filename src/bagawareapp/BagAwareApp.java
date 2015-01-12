/*
 * Version 1.02 of the Bagaware app, to be presented as the untested software
 * This is the main class, it opens a red window and calls the loginscreen from
 * where the rest of the app will be opened
 */
package bagawareapp;

/**
 *
 * @author Team2FYS - IS106
 */
public class BagAwareApp extends javax.swing.JFrame {

    private JavaConnect jc = new JavaConnect();

    /**
     * @description Creates new form form
     */
    private BagAwareApp() {
        initComponents();
    }

    /**
     * @description creates an instance of the application
     * @return
     */
    public static BagAwareApp getInstance() {
        return new BagAwareApp();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    /**
     * @description opens the login screen from bagawareapp.LogonScreen.java
     */
    private void initComponents() {
        LogonScreen login = new LogonScreen();
        login.setTitle("BagAware - Login Screen");          // set title
        login.setVisible(true);
        java.awt.EventQueue.invokeLater(new Runnable() {
            // these lines force the login screen to the foreground and center it
            public void run() {
                login.toFront();
                login.repaint();
                login.setLocationRelativeTo(null);
            }
        });

        /**
         * This code block makes a red box appear in the background while the
         * app is running
         */
        // <editor-fold defaultstate="collapsed" desc="Generated Code">
        frame = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(156, 10, 13));
        setMinimumSize(new java.awt.Dimension(400, 300));
        setPreferredSize(new java.awt.Dimension(1024, 768));

        frame.setBackground(new java.awt.Color(156, 10, 13));
        frame.setFocusable(false);

        javax.swing.GroupLayout frameLayout = new javax.swing.GroupLayout(frame);
        frame.setLayout(frameLayout);
        frameLayout.setHorizontalGroup(
                frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 1024, Short.MAX_VALUE)
        );
        frameLayout.setVerticalGroup(
                frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 768, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 1024, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(frame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 768, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(frame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setSize(new java.awt.Dimension(1024, 768));
        setLocationRelativeTo(null);

    }// </editor-fold>                        

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
            java.util.logging.Logger.getLogger(BagAwareApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BagAwareApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BagAwareApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BagAwareApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        /**
         * @description code to make the app open with a timer for the
         * splashscreen the splashscreen itself is called from the VM options
         * using: -splash:src/bagawareapp/logo.png
         */
        //Timer voor het splashscherm duurt 100ms
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                    // Do something, if there is a exception
                    System.out.println(ex.toString());
                }

                new BagAwareApp().setVisible(true);

            }

        });//einde timer

    }

    // Variables declaration - do not modify                     
    private javax.swing.JPanel frame;
    // End of variables declaration                   
}
