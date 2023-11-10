import java.io.*;
public class RWDemo{
	
	public static void main(String[] args) throws IOException{
		
        //FileReader fr = new FileReader("RWDemo.java");
        BufferedReader br = new BufferedReader(new FileReader("RWDemo.java")); // readLine()


        //FileWriter fw = new FileWriter("RWTest.java");
        BufferedWriter bw = new BufferedWriter(new FileWriter("RWTest.java"));


        int c;
        while( (c=br.read()) != -1){
        	bw.write(c);
        	System.out.print((char)c);
        }
       
       br.close();
       bw.close();
	}
}