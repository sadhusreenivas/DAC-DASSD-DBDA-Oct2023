class Student{
	int rno;
	String name;
	double gpa;
	String course; // new data member
	static String org; // null
    // loading time
	static {
		// used initilaize the static members
		org = "C-DAC";
		System.out.println("This is static block");
	}

    Student(int rno, String name, double gpa){  // local variables - instance
    	this.name = name;
    	this.rno = rno;
    	this.gpa = gpa;
    }

    Student(int rno, String name, double gpa,String course){
    	this(rno,name,gpa); // must first statement
    	this.course = course;
    }

    void getStudent(){
    	System.out.println(rno+" "+name+" "+gpa+" "+course+" "+org);
    }

    static void changeOrg(){  // static method
    	org = "C-DAC Hyd";
    }
}