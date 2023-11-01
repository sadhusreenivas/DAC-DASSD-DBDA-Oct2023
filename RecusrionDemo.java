class RecusrionDemo{
	
	static int no = 1;

	public static void main(String[] args) {
		
		String[] cdac = null; // dummy

		if(no <=100){
			System.out.print(no++ +" ");
			main(cdac); // recursion
		}

	}
}