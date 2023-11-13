package multithreading;
public class Multi extends Thread {	
	@Override
	public void run() {
	
		for(int i = 1; i <= 25;i += 2) {
			System.out.println(i);
			
			try {
			Thread.sleep(500);
			}catch(Exception e) {
				System.out.println(e);
			}
		}
	}
	public static void main(String[] args) throws Exception{ // main  thread
	
       Multi t1 = new Multi(); // thread
       t1.start(); // ready - t1 has its own flow
       
       t1.join(2500);
       
       Multi t2 = new Multi(); // thread
       t2.start(); // ready - t1 has its own flow
     
	}
}
