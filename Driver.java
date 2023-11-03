public class Driver{
	public static void main(String[] args) {
		
		TechEmp  te1 = new TechEmp();
		te1.setEmp(123,"XYZ",50000);
		te1.getEmp(); // overidden
		te1.calSalary(); // child specific method 
	}
}