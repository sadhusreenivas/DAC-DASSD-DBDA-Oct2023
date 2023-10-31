class ArraySum{

	public static void main(String[] args) {
		
       int[] nums = new int[40];

       for(int i=0; i<nums.length; i++)
			nums[i] = 1+(int)(Math.random()*100); // 1- 100

		for(int x : nums)
          	System.out.print(x+" ");
        
        System.out.println();
        // Business Logic
         int sum  = 0;
         for(int i:nums)
         	sum += i;

         double avg = (double)sum/nums.length;
         System.out.println("Sum : "+sum);
         System.out.println("Avearage: "+avg);

        
	}
}