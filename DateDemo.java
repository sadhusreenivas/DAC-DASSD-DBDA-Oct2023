import java.util.Date; //explicit import
import java.sql.*;// implicit import

//import java.util.Date;  // explicit import

public class DateDemo{
	
	public static void main(String[] args) {
		//FQN
		//java.util.Date d = new java.util.Date();
        
        Date d = new Date();

		System.out.println("Today's date and time: "+d); // d.toString()
	}

}

