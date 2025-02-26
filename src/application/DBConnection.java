package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    public static Connection connect() throws SQLException {
        Connection con = null;
        String dbName = "Lms";  // Database name
        String username = "root";  // MySQL username
        String password = "1234";  // MySQL password
        
        try {
            // Load and register MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Establish the connection
            String url = "jdbc:mysql://localhost:3306/" + dbName;
            con = DriverManager.getConnection(url, username, password);
            
            System.out.println("Connection established successfully.");
        } catch (ClassNotFoundException e) {
             		
        } 
        return con;
    }
}
