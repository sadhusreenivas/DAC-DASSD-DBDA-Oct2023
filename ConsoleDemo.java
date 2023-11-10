import java.io.*;
public class ConsoleDemo{	
	public static void main(String[] args) {		
		Console c = System.console(); // to create object

		System.out.println("Name: ?");
		String name = c.readLine();
         int age = 0;
        try{
		System.out.println("Age:?");
		age = Integer.parseInt(c.readLine());
	    }
	    catch(NumberFormatException e){
	    	System.out.println(e);
	    }

	    System.out.println("Name: "+name+"\nAge: "+age);

	    System.out.println("Enter password");
	    char[] pwd = c.readPassword();
	    System.out.println(pwd);

	}
}