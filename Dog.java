abstract class Animal{	
	private int age;
    private String name;
	Animal(int age, String name){
		this.age = age;
		this.name = name;
	}

	int getAge(){
		return age;
	}

	String getName(){
		return name;
	}

    void disp(){
    	System.out.println("Name: "+name+"\tAge: "+age);
    }
    abstract void eat();
    abstract void speak();
}

public class Dog extends Animal{
   private String breed;

   public Dog(int a, String n, String breed){
   	super(a,n); // first statement
   	this.breed = breed;
   }

     void eat(){
      System.out.println("Eats Biscuits");
     }
     void speak(){
     System.out.println("Bow..Bow...");
    }

    @Override
    void disp(){

    	System.out.println("Name: "+getName()+"\tAge: "+getAge()+"\tBreed: "+breed);
    }

    public static void main(String[] args) {
    	
    	Animal dog1 = new Dog(7, "Tyson", "Desi");
    	dog1.disp();
    	dog1.eat();
    	dog1.speak();
    }

} 