import java.util.Scanner;
class ReadChar{
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a character");
		//char ch = in.next().charAt(0);
		String str = in.next();
		char ch = str.charAt(0);
		System.out.println("Character enetered is: "+ch);
	}
}