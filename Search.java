import java.util.Scanner;
class Search{
	public static void main(String[] args) {
		
		int[] nums = new int[40];

       for(int i=0; i<nums.length; i++)
			nums[i] = 1+(int)(Math.random()*1000); // 1- 100

		for(int x : nums)
          	System.out.print(x+" ");
         System.out.println();
        // B L
          Scanner s = new Scanner(System.in);
          System.out.println(" Enter search element");
          int x = s.nextInt();
          boolean flag = false;
          for(int i=0; i<nums.length;i++){
             if(x == nums[i]){
             	System.out.println(x+ " is found at index: "+i);
             	flag = true;
             	break;
             }
          }
          if(flag == false)
          System.out.println(x+ " is not found ");

	}
}