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
        catch(ArithmeticException e){
         System.err.println(e);
         System.err.println();
         e.printStackTrace();
        }
        finally{
        	if(br!=null)
        		br.close();
        	System.out.println("Resource closed: BR");
        }
   
        System.out.println("Name: "+name+"\tAge: "+age);

        System.out.println("Rest of the code follows...............");

	}
}