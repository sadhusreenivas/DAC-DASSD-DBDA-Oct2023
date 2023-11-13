package multithreading;

public class Thread1 extends Thread {
	Table table;
	
	public Thread1(Table table) {
		this.table = table;
	}

	public void run() {
		table.printTable(19);
	}

}

class Thread2 extends Thread {
	Table table;
	
	public Thread2(Table table) {
		this.table = table;
	}

	public void run() {
		table.printTable(17);
	}
}

class Thread3 extends Thread {
	Table table;
	
	public Thread3(Table table) {
		this.table = table;
	}

	public void run() {
		table.printTable(18);
	}

}