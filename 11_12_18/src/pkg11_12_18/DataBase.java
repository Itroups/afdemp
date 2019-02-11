/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11_12_18;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author ΑΛΕΞΑΝΔΡΟΣ
 */
public class DataBase {
     private static final String DB_URL2 = "localhost:3306";
   private static final String FULL_DB_URL = "jdbc:mysql://" + DB_URL2 + "/test?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private static final String DB_USER = "root";
    private static final String DB_PASSWD = "Root";
    
    
    
    
    
}
