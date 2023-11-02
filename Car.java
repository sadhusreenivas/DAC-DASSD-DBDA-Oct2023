class Car{
	String color;
	int safetyRating;
	double cost;
	// setter by cons
    Car(String c, int r,double p){
    	color = c;
    	safetyRating = r;
    	cost = p;
    }
    /*
    void disp(){
    	System.out.println("Car Details:  ");
    	System.out.println("Color: "+color+"\nSafety Rating: "+safetyRating);
    	System.out.println("Cost: "+cost);
    }
    */
    // eliminating the need of a getter by using toString() of object class
    // Overriding
    @Override // annotation
    public String toString(){
    	return "Color: "+color+"\nSafety Rating: "+safetyRating+"\nCost: "+cost;
    } 

}