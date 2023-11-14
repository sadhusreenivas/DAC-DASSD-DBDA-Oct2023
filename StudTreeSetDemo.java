package collections;
import java.util.*;
public class StudTreeSetDemo {

	public static void main(String[] args) {
		
		TreeSet<Student>  studSet1 = new TreeSet(new MyNameComparator());
		
		Student s1 = new Student(123,"Vivek",8.7);
		Student s2 = new Student(129,"Rithik",5.7);
		Student s3 = new Student(111,"Kartik",7.9);
		Student s4 = new Student(199,"Abhisek",6.5);
		Student s5 = new Student(139,"Koushik",9.5);
		
		studSet1.add(s1);
		studSet1.add(s2);
		studSet1.add(s3);
		studSet1.add(s4);
		studSet1.add(s5);
		studSet1.add(new Student(200,"Tarak",8.9));
		
		System.out.println("Students as per the Name ASC:");
        Iterator itr1 = studSet1.iterator();
        while(itr1.hasNext()) {
        	System.out.println(itr1.next());
        }
        
        
        TreeSet<Student>  studSet2 = new TreeSet(new MyGpaComparator());
        studSet2.add(s1);
		studSet2.add(s2);
		studSet2.add(s3);
		studSet2.add(s4);
		studSet2.add(s5);
		studSet2.add(new Student(200,"Tarak",8.9));
		
		System.out.println("\nStudents as per the GPA DESC:");
		 Iterator itr2 = studSet2.iterator();
	        while(itr2.hasNext()) {
	        	System.out.println(itr2.next());
	        }
	}
           
}


