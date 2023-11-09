public class StringDemo{
	
	public static void main(String[] args) {
		
         String s = "Sachin" + " Tendulkar"; //

         System.out.println(s); // 

         String s1 = new StringBuffer().append("Sachin").append(" Tendulkar").toString();
         System.out.println(s1);

         String s2 = new StringBuilder().append("Sachin").append(" Tendulkar").toString();
         System.out.println(s2);
		
		
	}
}