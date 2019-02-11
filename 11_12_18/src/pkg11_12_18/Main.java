/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11_12_18;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
/**
 *
 * @author ΑΛΕΞΑΝΔΡΟΣ
 */
public class Main {
    private static final String DB_URL2 = "localhost:3306";
    private static final String FULL_DB_URL = "jdbc:mysql://" + DB_URL2 + "/test?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private static final String DB_USER = "root";
    private static final String DB_PASSWD = "Root";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String Lname;
        String Fname;
        int tel;
        String Dob;
        
        Scanner user_input = new Scanner(System.in);
        System.out.println("Please input your Last name: ");
        Lname=user_input.next();
        System.out.println("Please input your First name: ");
        Fname=user_input.next();
        System.out.println("Please input your telephone number: ");
        tel=user_input.nextInt();
        System.out.println("Please input your date of birth: ");
        Dob=user_input.next();
        
        System.out.println("Connecting database...");

try (Connection connection = DriverManager.getConnection(DB_URL2, DB_USER, DB_PASSWD)) {
    System.out.println("Database connected!");
} catch (SQLException e) {
    throw new IllegalStateException("Cannot connect the database!", e);
}
    }
    
}
