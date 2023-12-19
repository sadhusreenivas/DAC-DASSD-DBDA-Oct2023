package jdbc;

import java.sql.*; // JDBC API

public class Demo {
	public static void main(String[] args) throws Exception {
	
	   // 1. Load the Driver or Registering the Driver
		 Class.forName("com.mysql.cj.jdbc.Driver");  // Type 4 JDBC Driver 
		 
	   // 2. Establishing the connection - 3 things
         String url = "jdbc:mysql://localhost:3306/world";
         String user = "root";
         String pwd = "root";
         
         Connection con = DriverManager.getConnection(url, user, pwd);
         
         if(con != null) {
        	 System.out.println("Connection Established");
         }
         else {
        	 System.err.println("Connection Failed");
         }
		
         //3. Creating the statement
         Statement st = con.createStatement();
         String query = "select Code, Name, Continent, Capital from country where Continent ='Asia'";
         
         //4.  Execute Query and Process the result
         ResultSet rs = st.executeQuery(query);
          
         while(rs.next()) {
        	 System.out.println(rs.getString("Code")+" "+rs.getString("Name"));
         }
        
        //5. closing connection
         con.close();
	}

}
