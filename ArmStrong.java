import java.util.Scanner;
class ArmStrong{
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = s.nextInt();
        int m = n;
        int sum = 0;
        while(n>0){
        	int d = n%10;
            sum += Math.pow(d,3); // d*d*d;
            n = n/10;
        }

        if(sum == m)
        	System.out.println(m+ " is Armstrong");
        else
        	System.out.println(m+ " is not Armstrong");

	}
}