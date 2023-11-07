public class Outer{
private static String str = "C-DAC Hyd";

// static class
    static class StaticClass{
    	static void msg(){
    		System.out.println("The outer class string is: "+str);
    	}
    }

	public static void main(String[] args) {
		
		Outer.StaticClass.msg();
		
	}
}