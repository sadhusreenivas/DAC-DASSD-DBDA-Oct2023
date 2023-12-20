package jdbc;

import java.sql.*;

public class MetaDataDemo {

	public static void main(String[] args) throws Exception{
		
		DBConnection dbcon = new DBConnection();
		Connection con = dbcon.getDBConnection();
		
		if(con != null) {
			System.out.println("Connection established");
		}
		
		// DatabassMetaData -- meta data about the db
		
		DatabaseMetaData dbmd = con.getMetaData();
		
		System.out.println(dbmd.getDatabaseMajorVersion());
		System.out.println(dbmd.getDriverName());
		System.out.println(dbmd.getDriverVersion());
		System.out.println(dbmd.getDatabaseProductName());
		System.out.println(dbmd.getUserName());
		
		String[] tables ={"TABLE"};
		
        ResultSet rs1 = dbmd.getTables(null, null, null, tables); //
        while(rs1.next()){
            System.out.println(rs1.getString(3));
	}
        
      System.out.println("****************************************");
      
      Statement st = con.createStatement();
      
      ResultSet rs = st.executeQuery("select * from account");
      
      ResultSetMetaData rsmd = rs.getMetaData();
      
      for(int i=0; i<rsmd.getColumnCount();i++) {
    	  System.out.print(rsmd.getColumnName(i+1)+"\t");
      }
      System.out.println();
      while(rs.next()) {
  		System.out.println(rs.getInt(1)+"\t"+rs.getDouble(2)+"\t"+rs.getString(3));
  		}
        
        

}
}
