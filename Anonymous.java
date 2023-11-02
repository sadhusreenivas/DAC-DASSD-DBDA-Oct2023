class Anonymous{
	
    void fibonacci(){
     int n1=0, n2=1, n3;
     System.out.print(n1+" "+n2);
     int terms = 2;

     while(terms <=25){
     	n3 = n2 + n1;
     	System.out.print(n3+" ");
     	terms++;
     	n1=n2;
     	n2=n3;
     }
    }
  
	public static void main(String[] args) {
		// Anonymous Object
		new Anonymous().fibonacci();
	}
}