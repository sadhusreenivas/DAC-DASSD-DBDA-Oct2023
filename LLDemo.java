package collections;

import java.util.*;
public class LLDemo {

	public static void main(String[] args) {
		
		List<String> ll = new LinkedList();
		
		ll.add("Sachin");
		ll.add("Dhoni");
		ll.add("Rohit");
		ll.add("Bumra");
		ll.add("Shami");
		ll.add("Jadeja");
		System.out.println(ll);
		
		ListIterator<String> litr  = ll.listIterator();
		
		while(litr.hasNext()) {
			
			String name = litr.next();
			if(name.equalsIgnoreCase("Sachin")) {
				litr.set("Virat");
			}
			
			if(name.equalsIgnoreCase("Dhoni")) {
				litr.remove();
			}
			
		}
		
		System.out.println(ll);
		System.out.println(litr.previous()); //
		
		Collections.sort(ll); // NSO - ASC
		System.out.println(ll);

	}

}
