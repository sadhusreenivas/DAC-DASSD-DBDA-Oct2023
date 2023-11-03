public class TechEmp extends Emp{

	private final int BONUS = 10000;
    
    // all non - private members
	// setEmp();
	// getEmp()
	//calSalary()
    
    //  redefining by adding bonus 
	public void getEmp(){
		super.getEmp(); //eid name basic company
		System.out.println("Bonus: "+BONUS);
	}

	// redefine the calSalary  - overriding
	 @Override
	 public void calSalary(){
    	double da = 0.46;
    	double hra = 0.30;
    	double ta = 0.08;
    	double salary = basicSalary + da*basicSalary + hra*basicSalary + ta*basicSalary+BONUS;
    	System.out.println("Salary: "+salary);
    }
     


}