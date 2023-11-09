public class NestedTryDemo{
	public static void main(String[] args) {
		try{
			System.out.println("Im in outer try");
			try{
				int[] arr = new int[5];
				arr[5] = 99; // throw new AIOBE();
			}catch(Exception e){
				System.out.println(e); //
			}
            
            int res = 99/0; //throw new AE();
			System.out.println("Second stmt in outer try");
             
			try{
				String str = null;
				System.out.println(str.length()); // throw new NPE();
			}catch(Exception e){
				System.out.println(e); //
			}

            System.out.println("Third statement in outer try");
		}catch(ArithmeticException e){ 
			System.out.println(e);}

		System.out.println("Rest of the code follows");
	}
}
