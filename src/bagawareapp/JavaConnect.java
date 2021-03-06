/*
 * JavaConnect.java V 1 - This is the file that manages the connection to the
 * BagAware database in MySQL
 */
package bagawareapp;

/**
 * @author Team2FYS - IS106
 */
import java.sql.Connection;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Jens
 */
public class JavaConnect {

    private Connection conn;

    /**
     * @description opens connection with the local database so that SQL can be
     * used
     * @return
     */
    public Connection ConnecrDb() {
        try {
            Driver myDriver = new com.mysql.jdbc.Driver();
            DriverManager.registerDriver(myDriver);
            String URL = "jdbc:mysql://localhost:3306/bagawaredb";
            String USER = "root";
            String PASS = "";
            conn = DriverManager.getConnection(URL, USER, PASS);

            return conn;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }

    }

    /**
     * @description closes the database connection
     */
    public void closeDb() {
        try {
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(JavaConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
