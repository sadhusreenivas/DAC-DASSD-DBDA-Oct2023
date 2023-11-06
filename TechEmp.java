public class TechEmp extends Emp{

	private int BONUS;  
    
    public TechEmp(int eid, String name, double basic, int BONUS){
           super(eid, name, basic); // invoking the parent class cons
           this.BONUS = BONUS;
    }
    
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