package multithreading;

public class MultiRunnable implements Runnable{

	@Override
	public void run() {
		
		for(int i = 1; i <= 25; i += 2) {
			System.out.println(i);
		}
		
	}

	public static void main(String[] args) {
		
		MultiRunnable r1 = new MultiRunnable();  // Runnable instance
		MultiRunnable r2 = new MultiRunnable();
		
		Thread t1 = new Thread(r1); // 
		Thread t2 = new Thread(r2);
		
		t1.start();
		t2.start();

	}

}
