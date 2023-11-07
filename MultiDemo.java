interface Printable{
 void print();	
}

interface Showable {
	void show();
}

public class MultiDemo implements Showable, Printable{
	public void print(){
     System.out.println("Printing.......");
	}
	public void show(){
    System.out.println("Displays");
	}

	public static void main(String[] args) {
		MultiDemo m = new MultiDemo();
		m.print();
		m.show();
	}
}