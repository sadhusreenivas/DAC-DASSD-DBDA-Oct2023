class LocalOuter{
	
	private int data = 100;

	void display(){
		// local class
        class Local{
        	void msg(){
        		System.out.println("The data from the Outer class is: "+data);
        	} 
        } // class end
        
        Local l = new Local();
        l.msg();

	}// method end

	public static void main(String[] args) {
		LocalOuter lout = new LocalOuter();
		lout.display();
	}

}