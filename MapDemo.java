package collections;
import java.util.*;
public class MapDemo {
	public static void main(String[] args) {
		Map<String,Integer> m = new TreeMap(new MyComp1()); // random order
		
		m.put("ABC", 56000);
		m.put("XYZ", 78000);
		m.put("PQR", 86000);
		m.put("MNR", 78000);
		m.put("ASDF", 123000);
		m.put("QWERTY",98000);
		
		System.out.println(m);
		
		Collection c1 = m.keySet(); // keys
		Collection c2 = m.values(); // values
		
		System.out.println(c1);
		System.out.println(c2);
		
		//Iterating a map
		Set s = m.entrySet(); // entry sets - entries (Map.Entry) - key and value
		Iterator itr = s.iterator();
		
		while(itr.hasNext()) {
			Map.Entry me = (Map.Entry) itr.next(); 
			System.out.println(me.getKey()+" "+me.getValue());
		}
		
	}

}


class MyComp1 implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		return s2.compareTo(s1); // DESC
	}
	
}