package jdbc;
import java.sql.*;
import java.util.Scanner;
public class TxMgmt {

	public static void main(String[] args) throws Exception{
		
		DBConnection dbcon = new DBConnection();
		Connection con = dbcon.getDBConnection();
		
		if(con != null) {
			System.out.println("Connection established");
		}
		
		Scanner in = new Scanner(System.in);
		System.out.println("Tx - Transfer Amount Demo");
		System.out.println("Enter Source Account Number: ");
		int src = in.nextInt();
		System.out.println("Enter Destination Account Number: ");
		int dest = in.nextInt();
		System.out.println("Enter Amount to Transfer: ");
		double amt = in.nextDouble();
		
		Statement st = con.createStatement();
		String q1 = "update account set accBal = accBal - "+amt+ " where accNum = "+src; // deduct from src
		st.addBatch(q1);
		String q2 = "update account set accBal = accBal + "+amt+ " where accNum = "+dest; // deposit to dest
		st.addBatch(q2);
		
		int[] x = st.executeBatch();  // an array of ints - 2   = { 1, 1}
		
		// logic for commit and roll back
		con.setAutoCommit(false);   // by default its true --
		
		boolean flag = false;
		
		for(int i=0; i<x.length; i++) {
			
			if(x[i] == 0) {
				flag = true;
				break;
			}
		}
		
		if(flag == true) {
			con.rollback(); //
			System.out.println("Transaction rolled back");
		}
		else {
			con.commit();
			System.out.println("Transaction committed");
		}
			
		ResultSet rs = st.executeQuery("select * from account");
		while(rs.next()) {
		System.out.println(rs.getInt(1)+"    "+rs.getDouble(2)+"    "+rs.getString(3));
		}
		
		con.close();
	}

}
