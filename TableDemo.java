package multithreading;

public class TableDemo {
	public static void main(String[] args) {      
		Table t = new Table();
		
	     new Thread() {
			public void run() {
				t.printTable(23);
			}
		}.start();
		
	    new Thread() {
			public void run() {
				t.printTable(29);
			}
		}.start();
		
		 new Thread() {
			public void run() {
				t.printTable(26);
			}
		}.start();
	}

}
