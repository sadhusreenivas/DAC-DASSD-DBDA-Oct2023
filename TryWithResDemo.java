import java.io.*;
public class TryWithResDemo{
	
	public static void main(String[] args) throws IOException{
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));){

			System.out.println("Enter your State");
			String state = br.readLine();
			System.out.println("My State: "+state);
		}

		/*catch(IOException e){
			System.out.println(e);
		}*/
	}
} 