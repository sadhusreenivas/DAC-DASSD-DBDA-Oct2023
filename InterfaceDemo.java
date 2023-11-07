interface Printable{
 void print();	
}

interface Showable {
	void show();
}


public class MultiDemo implements Showable{
	public void print(){
     System.out.println("Printing.......");
	}
	public void show(){
    System.out.println("Displays");
	}

	public static void main(String[] args) {
		Showable s = new MultiDemo();
		s.print();
		s.show();
	}
}