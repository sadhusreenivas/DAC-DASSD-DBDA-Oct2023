package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	
	Connection con = null;

	public Connection getDBConnection() throws Exception {
		
		// 1. Loading the driver
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				//2. Establish Connection
				 String url = "jdbc:mysql://localhost:3306/jdbcdb";
		         String uname = "root";
		         String pwd = "root";
				 con  = DriverManager.getConnection(url,uname, pwd);

		return con;
	}
	
}
