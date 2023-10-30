class ReferenceDemo {
	
static int a;
int b;
//constructor

ReferenceDemo(int a, int b ){
	
	this.a= a;
	this.b= b;
}



public static void main(String args[]){
	
	ReferenceDemo referenceDemo1 = new ReferenceDemo(10,20);
	System.out.println("Before"+a);

	referenceDemo1 = new ReferenceDemo(20,30);
	System.out.println("After"+a);




}

}