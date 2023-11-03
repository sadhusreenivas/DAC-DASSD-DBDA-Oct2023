public class Test{
	public static void main(String[] args) {

		Student s1 = new Student(123,"ABC",7.9,"DASSD");
		s1.getStudent(); //123 ABC 7.9 DASSD C-DAC

		Student.changeOrg();  // Class Name

		Student s2 = new Student(321,"XYZ",8.9,"DAC");
		s2.getStudent(); //
		     
	}
} 