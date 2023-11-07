class Human{
	void eat(){
		System.out.println("eats fruits");
	}
	void speak(){
		System.out.println("speaks English");
	}

	public static void main(String[] args) {
	Human h = new Human(){
		@Override
        void eat(){
		System.out.println("eats veggies");
	    }
        @Override
        void speak(){
		System.out.println("speaks Hindi");
	    }
	};

	h.eat();
	h.speak();	
}
}




