package multithreading;
public class MultiDemo extends Thread {

	public void run() {
		
		if(Thread.currentThread().getName().equals("even")){
			System.out.println("Priortiy: "+Thread.currentThread().getPriority());
			for(int i=0; i<=15; i=i+2)
				System.out.println(i);
		}
		else if (Thread.currentThread().getName().equals("odd")){
			System.out.println("Priortiy: "+Thread.currentThread().getPriority());
			for(int i=1; i<=15; i=i+2)
				System.out.println(i);
		}
		else {
			System.out.println("Priortiy: "+Thread.currentThread().getPriority());
			for(int i=3; i<=15; i=i+3)
				System.out.println(i);
		}
	    }
	
	public static void main(String[] args) {
	
		MultiDemo t1 = new MultiDemo();
		System.out.println(t1.getName()); // Thread-0
		t1.setName("even");
		MultiDemo t2 = new MultiDemo();
		t2.setName("odd");
	    System.out.println(t2.getName()); // odd
	    t2.setPriority(MAX_PRIORITY);
		MultiDemo t3 = new MultiDemo();
		t3.setPriority(MIN_PRIORITY);
		t1.start();
		t2.start();
		t3.start();
	}

}
