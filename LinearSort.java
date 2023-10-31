class LinearSort{
	public static void main(String[] args) {
		int[] nums = new int[25];

         for(int i=0; i<nums.length; i++)
			nums[i] = 1+(int)(Math.random()*100); // 1- 100

		for(int x : nums)
          	System.out.print(x+" ");
        System.out.println();

        // Business Logic
        for(int i=0; i<nums.length-1;i++){
        	for(int j=i+1; j<nums.length; j++){
        		if(nums[i]>nums[j]){
        			int t = nums[i];
        			nums[i] = nums[j];
        			nums[j] = t;
        		}
        	}
        }

        for(int x : nums)
          	System.out.print(x+" ");
	}
}