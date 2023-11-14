package collections;

import java.util.*;
public class EvenOddList {

	public static void main(String[] args) {
		
		int[] numbers = new int[100];
		for(int i=0;i<100;i++) {
			numbers[i] = 51 + (int) (Math.random()*100); // 51 - 150
		}
        
		ArrayList<Integer> evenList = new ArrayList();
		ArrayList<Integer> oddList = new ArrayList();
		
		for(int i:numbers) {
			if(i%2==0)
				evenList.add(i);
			else
				oddList.add(i);
		}
	
      System.out.println("Even Numbers:");
	  Iterator itr = evenList.iterator();
	
	  while(itr.hasNext()) {
		  System.out.print(itr.next()+" ");
	  }
	 
	  System.out.println("\nOdd Numbers:");
	  Iterator itr1 = oddList.iterator();
	
	  while(itr1.hasNext()) {
		  System.out.print(itr1.next()+" ");
	  }
}
}