package collections;

import java.util.Comparator;

public class MyGpaComparator implements Comparator<Student>{
	
	   @Override
		public int compare(Student s1, Student s2) {
			
			if(s2.getGpa()>s1.getGpa())
				return 1;
			else
				return -1;
		}
		
	}
