class ThisDemo{

	void demo(){
		System.out.println(this);
	}
	
	public static void main(String[] args) {
		
		ThisDemo t = new ThisDemo();
		System.out.println(t); //
		t.demo();
	}
}