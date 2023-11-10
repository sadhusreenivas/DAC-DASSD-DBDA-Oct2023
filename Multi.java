package multithreading;

public class Multi extends Thread {
		
	@Override
	public void run() {
	
		for(int i = 51; i <= 75;i += 2) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) { // main  thread
	
       Multi t1 = new Multi(); // thread
       t1.start(); // ready - t1 has its own flow

       Multi t2 = new Multi(); // thread
       t2.start(); // ready - t1 has its own flow
       
	}

}
