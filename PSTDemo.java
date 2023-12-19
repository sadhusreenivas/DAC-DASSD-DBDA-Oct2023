package jdbc;

import java.sql.*;
import java.util.Scanner;

public class PSTDemo {
	
	public static void main(String[] args) throws Exception {
		
		DBConnection dbcon = new DBConnection();
		Connection con = dbcon.getDBConnection();
		
		if(con != null) {
			System.out.println("Conection Established");
		}
	   
		Scanner in = new Scanner(System.in);
		
		String iq = "insert into account(accBal, accType) values (?,?)";
		PreparedStatement pst = con.prepareStatement(iq);
		System.out.println("Enter Balance");
		double bal = in.nextDouble();
		
		pst.setDouble(1,bal);
		
		System.out.println("Enter Acc Type");
		String type = in.next();
		
		pst.setString(2, type);
		
		int x = pst.executeUpdate(); 
		if(x>0)
		System.out.println("Record inserted");
		
		
		String uq = "update account set accType = ? where accBal = ?";
		PreparedStatement pst1 = con.prepareStatement(uq);
		
		pst1.setString(1, "Savings");
		pst1.setDouble(2, 12000);
		
		int y = pst1.executeUpdate(); 
		
		 
		ResultSet rs = pst.executeQuery("select * from account");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"    "+rs.getDouble(2)+"    "+rs.getString(3));
		}
		
		con.close();

	}

}
