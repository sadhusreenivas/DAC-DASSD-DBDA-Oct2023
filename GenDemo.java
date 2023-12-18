package generics;

public class GenDemo {

	public static void main(String[] args) {
		
		MyGen<String> m1 =  new MyGen();
		m1.setData("CDAC");
		System.out.println(m1.getData());
		
		MyGen<Integer> m2 = new MyGen();
		m2.setData(123);
		System.out.println(m2.getData());
	}

}
