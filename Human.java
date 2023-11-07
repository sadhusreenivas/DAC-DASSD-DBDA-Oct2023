public interface Human{
	void eat();
	void speak();

	public static void main(String[] args) {
	// AIS
	Human h = new Human(){
        public void eat(){
		System.out.println("eats food");
	    }
        public void speak(){
		System.out.println("speaks Hindi");
	    }
	};

	h.eat();
	h.speak();	
}
}




