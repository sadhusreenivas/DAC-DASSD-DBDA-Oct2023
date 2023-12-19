package jdbc;

import java.sql.*;
public class JDBCDemo {

	public static void main(String[] args) throws Exception {
	
		// 1. Loading the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//2. Establish Connection
		 String url = "jdbc:mysql://localhost:3306/jdbcdb";
         String uname = "root";
         String pwd = "root";
		 Connection con  = DriverManager.getConnection(url,uname, pwd);
		 
		 if(con != null) {
			 System.out.println("Connection Established");
		 }
		 else
		 {
			 System.out.println("Connection Failed");
		 }
		 
		// 3. Creating Statement
		 Statement st = con.createStatement();
		 
		// String iq = "insert into student (sname, cgpa, city) values ('Aniket',8.8,'Pune'), ('Sharvari',7.5,'Indore')"; 
		 //String uq = "update student set city = 'Nanded' where sid = 3" ;
		 //String dq = " delete from student where sid = 3";
		// 4. Execute Queries
		 
		 /*
		  int x = st.executeUpdate(iq);
		  
		 if(x>0)
			 System.out.println(x+ " record(s) inserted");
		 
		*/
		 ResultSet rs = st.executeQuery("select sname, city, cgpa, row_number() over(partition by city order by cgpa desc) from student");
		 
		 while(rs.next()) {
			 //System.out.println(rs.getInt("sid")+" "+rs.getString(2)+" "+rs.getDouble("cgpa")+" "+rs.getString(4));
			 System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getDouble(3)+" "+rs.getInt(4));
			 
		 }
		 
		 // 5. close the connection
		 con.close();
	}

}
