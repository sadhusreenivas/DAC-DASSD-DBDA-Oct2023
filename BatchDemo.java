package jdbc;

import java.sql.*;

public class BatchDemo {

	public static void main(String[] args) throws Exception {
		
		DBConnection dbcon = new DBConnection();
		Connection con = dbcon.getDBConnection();
		
		if(con != null)
			System.out.println("Connection success");
		
		Statement st = con.createStatement();
		String iq = "insert into account(accBal, accType) values(50000,'Savings'),(35000,'Curent')";
		st.addBatch(iq);
		String uq = "update account set accType ='Current' where accNum = 1";
		st.addBatch(uq);
		String dq = "delete from account where accNum = 8";
		st.addBatch(dq);
		
		int[] x = st.executeBatch();
		
		ResultSet rs = st .executeQuery("select * from account");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"    "+rs.getDouble(2)+"    "+rs.getString(3));
		}
		
		con.close();
		
	}
}
