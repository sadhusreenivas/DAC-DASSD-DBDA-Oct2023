import java.io.*;

public class FWDemo{
	
public static void main(String[] args) throws IOException  {
	
  //File file = new File("dac.txt");
  
  FileWriter fw = new FileWriter("dac.txt", true);  // true - append mode
  String str = "\nHappy Diwali\nLearning Java is Very Good thing\nWelcome to C-DAC Hyd";
  fw.write(str);

  fw.close();

  System.out.println("File Written successfully");

}

}