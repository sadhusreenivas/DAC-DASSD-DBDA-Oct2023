import java.util.Arrays;
class MinMax{
	public static void main(String[] args) {
		
		int[] arr = new int[30];
		 for(int i=0; i<arr.length; i++)
			arr[i] = 1+(int)(Math.random()*100); // 1- 100
        
        Arrays.sort(arr);
		for(int x : arr)
          	System.out.print(x+" ");
        System.out.println();
          // Business Logic
          int min = arr[0];
          int max = arr[0];

          for(int i=0; i<arr.length; i++){
          	if(arr[i]>max)
          		max = arr[i];

          	if(arr[i]<min)
          		min = arr[i];
          }
          
          System.out.println("Min: "+min+"\tMax: "+max);
	}
}