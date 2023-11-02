class Person1{
	// data
	String name; //ref - instance - heap
	int age; // prim - instance - heap
    static String country = "India"; //ref  class -> class / method area
    // default cons
    Person1(){
    }
    //eliminate the need of a setter by using constuctor
    //constructor - param
    Person1(String n, int a){ // local - stack
    name = n;
    age = a;
    }
    
    void getPerson(){
    	System.out.println("Name: "+name+"\tAge: "+age+"\tCounty: "+country);
    }
    
}

// 30 * 100cr =3000cr Bytes