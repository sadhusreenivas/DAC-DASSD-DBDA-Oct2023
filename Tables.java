import java.util.Scanner;
class Tables{	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

	    System.out.println("Enter the range");
	    int n = scanner.nextInt();
	    int m = scanner.nextInt();

	    for(int i=n; i<=m; i++){
	    	System.out.println("**********"+i+"th Table"+"**********");
	    	for(int j=1; j<=10;j++){
	    		System.out.println(i+" * "+j+" = "+ (i*j));
	    	}
	    	System.out.println();
	    }

	}
}