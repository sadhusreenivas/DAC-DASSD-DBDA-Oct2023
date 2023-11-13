package multithreading;

public class TableDemo {

	public static void main(String[] args) {
        
		Table t = new Table();
		Thread1 t1 = new Thread1(t);
		Thread2 t2 = new Thread2(t);
		Thread3 t3 = new Thread3(t);

		t1.start();
		t2.start();
		t3.start();
	}

}
