package generics;

public class GenMethodDemo {
	
	public static <E> void printArrays(E[] arr) {
		
		for(E ele: arr) {
			System.out.print(ele+"  ");
		}
	}

	public static void main(String[] args) {
		
		Integer[] iarray = {1,2,3,4,5,6,7,8,9,10};
		printArrays(iarray);
		System.out.println();
		String[] courses = {"DAC","DBDA", "DASSD","DESD", "DVLSI"};
        printArrays(courses);
	}

}
