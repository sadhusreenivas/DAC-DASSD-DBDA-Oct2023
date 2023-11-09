import java.util.*;
public class ExceptDemo{

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter two nos:");
		int x=0, y=0;
         
         try{
         x = in.nextInt(); // 
         y = in.nextInt(); //
         
         System.out.println("Result = "+(x/y)); //
         }
         
         catch(InputMismatchException e){
         	System.out.println(e);
         }
         catch(Exception e){
         	System.out.println(e);
         }
        

         System.out.println("Sum = "+(x+y));
         System.out.println("Product = "+(x*y));
         System.out.println("rest of the code.....");

	}
	
}