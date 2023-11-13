package multithreading;

public class SyncDemo {

	public static void main(String[] args) {
		
		Display d = new Display();
		
		new Thread() {
			public void run() {
				d.dispLowerCase();
			}
		}.start();
		
		new Thread() {
			public void run() {
				d.dispUpperCase();
			}
		}.start();
		
		new Thread() {
			public void run() {
				d.dispNumbers();
			}
		}.start();

	}

}
