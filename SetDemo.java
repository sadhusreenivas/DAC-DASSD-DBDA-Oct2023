package collections;
import java.util.*;

public class SetDemo {
	public static void main(String[] args) {
		Set<String> hs = new TreeSet(new MyComp());  //
		
		hs.add("Hyderabad");
		hs.add("Chennai");
		hs.add("Pune"); 
		hs.add("New Delhi");
		hs.add("Kolkata");
		hs.add("Mumbai");
		hs.add("Bengaluru");
		hs.add("Mohali");
		hs.add("Patna");
		hs.add("Trivendrum");
		hs.add("Silchar");
		
		System.out.println(hs);
		
		Iterator itr = hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}

class MyComp implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		return s2.compareTo(s1); // DESC
	}
	
}
