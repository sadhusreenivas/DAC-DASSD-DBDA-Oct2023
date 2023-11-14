package collections;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Stack;
import java.util.Vector;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack s = new Stack(); // LIFO
		System.out.println(s.size()); // 0
		
		s.add(10);
		s.add("C-DAC");
		s.push("Hyd");
		s.push(10);
		s.push(null);
		s.addElement(123);
		
		System.out.println(s);
		
		System.out.println(s.peek());// 123
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.peek());//10
		
		System.out.println(s);
		
		Iterator itr = s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("*********************");
		
		Enumeration e = s.elements();
		
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		Collections.reverse(s);
		System.out.println(s);
	}

}
