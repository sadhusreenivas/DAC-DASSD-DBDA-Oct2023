public class Vehicle{
	int chassisNo;
    
    public Vehicle(int chassisNo){
    this.chassisNo = chassisNo;
    System.out.println(chassisNo);
    }

	public void run(){
		System.out.println("Vehicle is running.....!");
	}
}

class Bike extends Vehicle{

public Bike(int chassis){
	super(chassis); // Vehicle(){}
}

// Override
public void run(){
	    super.run();
		System.out.println("Bike is running with 50km speed");
		System.out.println(super.chassisNo);
	}

}