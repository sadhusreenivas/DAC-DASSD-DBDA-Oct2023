package collections;

import java.util.*;
public class ALDemo {

	
	public static void main(String[] args) {
		
		String[] courses = {"DAC", "DASSD","DBDA", "DESD","DVLSI", "DITISS","DAI"};
		
		List<String> al =  Arrays.asList(courses);  // array to List - ArrayList
		
		System.out.println(al);
		
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		ArrayList al1 = new ArrayList();
		
		for(String str:al) {
			al1.add(str);
		}
		
		al1.add("DGI");
		al1.add("DHPC");
		
		System.out.println(al1);
		
	}
	
}
