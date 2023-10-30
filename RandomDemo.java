class RandomDemo{
	
	public static void main(String[] args) {
		
     int x = 1 + (int) (Math.random()*10); // 1 - 10

     int y = 1 + (int) (Math.random()*100); // 1 - 100

     int z = 25 + (int) (Math.random()*76); // 25 - 100
  

     int a = 25 + (int) (Math.random()*51); // 25 - 75


     System.out.println(x+" "+y);
     System.out.println(z+" "+a);     

	}
}