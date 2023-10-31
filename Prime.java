class Prime{
	
	public static void main(String[] args) {
		
		int n = 1 + (int) (Math.random()*1000); // 1-100
        System.out.println(n);
        int count = 0;
        int i;
        for(i=1; i<=n/2; i++){
         if(n%i==0){
         	count++;
            if(count>1)
            	break;
         }
        }
		
		if(count == 1)
			System.out.println(n+" is prime");
		else
			System.out.println(n+" is not prime");

		 System.out.println("No of times the loop executes: "+ (i-1));
}
}