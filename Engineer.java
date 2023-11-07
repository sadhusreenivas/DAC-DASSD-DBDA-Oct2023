class Human{
	void eat(){
		System.out.println("eats fruits");
	}
	void speak(){
		System.out.println("speaks English");
	}
}

public class Engineer extends Human{
@Override
void eat(){
		System.out.println("eats veggies");
	}

@Override
void speak(){
		System.out.println("speaks Hindi");
	}

public static void main(String[] args) {
	Engineer e1 = new Engineer();
	e1.eat();
	e1.speak();
}
}