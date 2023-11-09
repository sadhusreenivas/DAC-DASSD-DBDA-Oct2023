import java.io.*;

public class BRDemo{
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter name");
        String name = br.readLine();

        System.out.println("Enter Age");
        
        int age=0;

        try{
        age = Integer.parseInt(br.readLine());   // throw new NumberFormatException();
        }
        catch(Exception e){
         System.err.println(e);
         System.err.println();
         e.printStackTrace();
        }

        System.out.println("Name: "+name+"\tAge: "+age);

        System.out.println("Rest of the code follows...............");

	}
}