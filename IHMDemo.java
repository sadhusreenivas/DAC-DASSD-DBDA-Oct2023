package collections;
import java.util.*;

public class IHMDemo {
	
	public static void main(String[] args) {
	IdentityHashMap m=new IdentityHashMap();
	
	Integer i1=new Integer(10);
	Integer i2=new Integer(10);
	m.put(i1,"sadhu");
	m.put(i2,"sreeni");
	System.out.println(m);
	}
	
	}
