package in.cdac.hyd;

import java.io.*;
public class SerializeTest {

	public static void main(String[] args) throws Exception {
		
      Book b1 = new Book("Java Complete Reference","Herbert Schildt",650,700);
      System.out.println(b1); // b1.toString();
      
      // Serialization
      FileOutputStream fos = new FileOutputStream("book.data");
      ObjectOutputStream oos = new ObjectOutputStream(fos);
      oos.writeObject(b1);
       
      // De-serialization
      FileInputStream fis = new FileInputStream("book.data");
      ObjectInputStream ois = new ObjectInputStream(fis);
      Book b2 = (Book) ois.readObject();
      
      System.out.println("After De-serilaization");
      System.out.println(b2); // b2.toString();
	}
}
