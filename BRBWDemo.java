import java.io.*;
public class BRBWDemo{
	
	public static void main(String[] args) throws IOException{
		
        //FileReader fr = new FileReader("RWDemo.java");
        BufferedReader br = new BufferedReader(new FileReader("dac.txt")); // readLine()


        //FileWriter fw = new FileWriter("RWTest.java");
        BufferedWriter bw = new BufferedWriter(new FileWriter("dbda.txt"));

        String line = br.readLine(); // reading first line
        
        while(line != null){
        	System.out.println(line); // printing on console

            bw.write(line); // writing to file

        	line = br.readLine(); // reading nest line
        }
        
       
       br.close();
       bw.close();
	}
}