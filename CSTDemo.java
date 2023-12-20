package jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Types;

public class CSTDemo {

	public static void main(String[] args) throws Exception {
		DBConnection dbcon = new DBConnection();
		Connection con = dbcon.getDBConnection();
		
		if(con != null) {
			System.out.println("Connection established");
		}
		
		/*
		String query = "call first_pro(?,?)";
		CallableStatement cst = con.prepareCall(query);
		
		cst.setInt(1, 17); // set input value a
		cst.registerOutParameter(2, Types.INTEGER);
		
		 cst.execute();
		
		 int x = cst.getInt(2);
		 
		 System.out.println(x);

	}
	*/

		String query = "{? = call add_ab(?,?)}";
		CallableStatement cst = con.prepareCall(query);
		
		cst.setInt(2,  123);
		cst.setInt(3,  321);
		cst.registerOutParameter(1, Types.INTEGER);
		
		cst.execute();
		
		int sum = cst.getInt(1);
		
	    System.out.println(sum);
	
	/*
	create function add_ab(a int, b int)
	    -> returns int deterministic
	    -> begin
	    -> declare c int;
	    -> set c = (a+b);
	    -> return c;
	    -> end
	    -> $$
	*/

	
	/*
	delimiter $$
	mysql> create procedure first_pro(a int, out b int)
	    -> begin
	    -> set b = (a*a);
	    -> end
	    -> $$
	*/
}
}
