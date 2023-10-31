import java.util.Arrays;
class ArrayDemo{
	public static void main(String[] args) {
		
		int[] arr = new int[25];

		String[] cities = {"Hyd","Pune","Nagpur","Delhi","Varanasi","Ujjain","Amaravathi"};

		// populate the array
		for(int i=0; i<arr.length; i++)
			arr[i] = 1+(int)(Math.random()*10);
         Arrays.sort(arr);
		// for- each
          for(int x : arr)
          	System.out.print(x+" ");

          System.out.println();
          
        Arrays.sort(cities);
        for(String s : cities)
        	System.out.print(s+" ");


	}
}