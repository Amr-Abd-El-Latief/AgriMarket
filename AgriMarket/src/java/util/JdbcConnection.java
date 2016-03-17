package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class JdbcConnection {
	
	private static String user = "root";
	private static String pass = "";
	private static String url = "jdbc:mysql://localhost:3306/agri_project";
	private static Connection connection;
        
	/**
	 * Default configurations
	 */
	private JdbcConnection() {
	}

 
	public static Connection getConnection() throws SQLException {
            try {
                
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                if (connection == null) {
                   connection = DriverManager.getConnection(url, user, pass);	   
                }
            }catch (Exception ex) {
                ex.printStackTrace();
             }
          return connection;
	}
        
        public static void main(String[] args) {
            try {
                connection=JdbcConnection.getConnection();
                connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(JdbcConnection.class.getName()).log(Level.SEVERE, null, ex);
            }
            
    }
}
