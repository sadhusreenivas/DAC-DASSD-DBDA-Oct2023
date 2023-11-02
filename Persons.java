import java.util.Scanner;
class Persons{
	// data
	String name;
	int age;

	Scanner s = new Scanner(System.in);
    // setter - mutator
    void setName(){
    System.out.println("Enter Name");
    name = s.next();
    }
    void setAge(){
    System.out.println("Enter age");
    age = s.nextInt();
    }
    // getter - accessor
    String getName(){
    return name;
    }
    int getAge(){
    return age;
    }

    public static void main(String[] args) {
    
    Persons p1 = new Persons(); // creating object - Heap
    // Person() - constructor
    p1.setName();
    p1.setAge();
    System.out.println(p1.getName());
    System.out.println(p1.getAge());

    Persons p2 = new Persons(); // creating object - Heap
    // Person() - constructor
    p2.setName();
    p2.setAge();
    System.out.println(p2.getName());
    System.out.println(p2.getAge());

    }
}