package reflection;
import java.lang.reflect.*;
import java.util.ArrayList;

import generics.Book;

public class ReflectDemo {
	public static void main(String[] args) {
		
		     ArrayList al = new ArrayList();
		     Class c = al.getClass();  // entry point
		     System.out.println(c.getName()); //
		     int mc = 0;
		     int fc = 0;
		     Method[] m = c.getDeclaredMethods();
		     for(Method m1: m) {
		    	 System.out.println(m1);
		    	 mc++;
		    	 
		    	 System.out.println("Looking at each method: ");
		    	 
		    	 Class<?> parameterType[]=m1.getParameterTypes();
		            for(int i=0;i<parameterType.length;i++)
		                System.out.println("Parameter "+(i+1)+" parameter type :"+parameterType[i].getName());

	
		     }
		     System.out.println("Method count of "+c.getName()+" is :"+mc);
		     
		     Field[] f = c.getDeclaredFields();
		     for(Field f1: f) {
		    	 System.out.println(f1);
		    	 fc++;
		     }
		     
		     System.out.println("Field count of "+c.getName()+" is :"+fc);
	}

}
