class Person{
	// data
	String name;
	int age;
    // setter - mutator
    void setName(String n){
    name = n;
    }
    void setAge(int a){
    age = a;
    }
    // getter - accessor
    String getName(){
    return name;
    }
    int getAge(){
    return age;
    }

    public static void main(String[] args) {
    
    Person p = new Person(); // creating object - Heap
    // Person() - constructor

    p.setName("ABC");
    p.setAge(24);

    System.out.println(p.getName());
    System.out.println(p.getAge());

    }
}