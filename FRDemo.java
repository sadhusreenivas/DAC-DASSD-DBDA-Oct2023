import java.io.*;
public class FRDemo{
	
	public static void main(String[] args) throws IOException {
		FileReader fr =  new FileReader("dac.txt");
       
        FileWriter fw = new FileWriter("output.txt");

		int c;
		int count = 0;
        int lc = 0;
		
		while( (c = fr.read()) != -1){

              System.out.print((char)c);
              count++;

              if(c == '\n')
              	lc++;
		}

		System.out.println("\n\nNo of chars: "+count);
		System.out.println("\nNo of lines: "+(lc+1));

		fw.write("**************DASSD01*************\n");
		fw.write("\nNo of chars: "+count);
		fw.write("\nNo of lines: "+(lc+1));

		fr.close();
		fw.close();
	}
}