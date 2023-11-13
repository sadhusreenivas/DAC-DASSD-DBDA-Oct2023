package collections;
import java.util.*;

public class ListDemo {
	public static void main(String[] args) {
		List al = new ArrayList();
		System.out.println(al.size()); //
		al.add("C-DAC");
		al.add(501510);
		al.add(34.56);
		al.add(false);
		al.add("C-DAC");
		al.add(null);
		al.add(199139);
		
		System.out.println(al);
		System.out.println(al.size());
		
		for(Object obj: al)
			System.out.println(obj);  // 7 objects
		
		al.remove(1);
		al.remove(false);
		
		System.out.println(al);
		System.out.println(al.size());
		
		Iterator itr = al.iterator(); // Universal Cursor 
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
}
