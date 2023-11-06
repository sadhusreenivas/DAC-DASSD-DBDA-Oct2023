public class Emp{
	private int eid;
	private String name;
	protected double basicSalary;
	private static String company = "C-DAC";

	public Emp(int eid, String name, double basicSalary){
		this.eid = eid;
		this.name = name;
		this.basicSalary = basicSalary;
	}
	public void getEmp(){
		System.out.println(eid+" "+name+" "+basicSalary+" "+company);
	}
    // calculate the salary
    public void calSalary(){
    	double da = 0.46;
    	double hra = 0.30;
    	double ta = 0.08;
    	double salary = basicSalary + da*basicSalary + hra*basicSalary + ta*basicSalary;
    	System.out.println("Salary: "+salary);
    }

}