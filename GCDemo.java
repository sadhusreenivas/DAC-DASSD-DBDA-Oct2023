package collections;

public class GCDemo {
	int x;
	double y;
	
	
	public void finalize() {
		
		System.out.println("Garbage Collected....");
	}

	public static void main(String[] args) {
		
		GCDemo[] arr = new GCDemo[2];
		
		for(int i=0; i<arr.length;i++) {
			arr[i] = new GCDemo(); // 10 objects
 		}
		
		arr = null;
		
		System.out.println("This is GC Demo");
        
		System.gc(); // 
	}

}
