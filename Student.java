package collections;

public class Student {

	private int rno;
	private String name;
	private double gpa;
	static String org = "C-DAC HYd";
	
	public Student(int rno, String name, double gpa) {
		super();
		this.rno = rno;
		this.name = name;
		this.gpa = gpa;
	}

	public int getRno() {
		return rno;
	}

	public String getName() {
		return name;
	}

	public double getGpa() {
		return gpa;
	}

	@Override
	public String toString() {
		return "Student:-> "+rno+"\t"+name+"\t"+gpa+"\t"+org;
	}

}


