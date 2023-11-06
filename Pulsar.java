class Bike{
public void run(){
		System.out.println("Bike is running with 50kmph");
	}
}

public class Pulsar extends Bike{
	@Override
	public void run(){
		System.out.println("Pulsar is running with 70kmph");
	}
	public static void main(String[] args) {
		
		Bike b = new Bike(); //
		Pulsar p = new Pulsar();
		p.run(); // 70
		b.run(); // 50
        b = p; // upcasting
        b.run(); //70 - overidden - parent ref (upcasting) - dynamic method dispatch - RTP

	}
}