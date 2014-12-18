/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bagawareapp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Jens
 */
public class QueryManager {
    
    private JavaConnect jc;
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    public QueryManager(JavaConnect jc) {
        this.jc = jc;
    }
    
    public void addLuggage(Luggage luggage) {
        
        jc.ConnecrDb();
        
         try {
            String sql = "INSERT INTO FOUND (baglabelcode, brand, color, weight,"
                    + " description, LOCATION_locationcode, status, datecreated)"
                    + " VALUE (?,?,?,?,?,?,?,?)";
            pst = conn.prepareStatement(sql);

//            pst.setString(1, luggage.getBagLabelCode())


        } catch (Exception e) {
             System.out.println(e.getMessage());
        }
         
         jc.closeDb();
        
    }
    
}
