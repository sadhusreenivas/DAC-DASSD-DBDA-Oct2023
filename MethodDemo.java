class MethodDemo{

	static int factorial(int x){
		int f1 = 1;
		for(int i=1; i<=x;i++)
			f1 *= i;

	     return f1;
	}

	public static void main(String[] args) {
		int n1 = 4+ (int)(Math.random()*8); // 4 - 11
		System.out.println(n1);
		System.out.println(factorial(n1));

		int n2 = 4+ (int)(Math.random()*10); // 4 - 13
		System.out.println(n2);
			System.out.println(factorial(n2));
		
		int n3 = 4+ (int)(Math.random()*10); // 4 - 13
		System.out.println(n3);
		System.out.println(factorial(n3));

	}
}