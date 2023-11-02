class Person1{
	// data
	String name; // instance - heap
	int age; // instance - heap
    static String country; // class -> class / method area

    void setPerson(String n, int a){ // local - stack
    name = n;
    age = a;
    }
    
    void getPerson(){
    	System.out.println("Name: "+name+"\tAge: "+age);
    }
    
}

// 30 * 100cr =3000cr Bytes