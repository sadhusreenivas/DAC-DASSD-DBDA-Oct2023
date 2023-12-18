package generics;

abstract class Shape{
	public abstract void draw();
}

public class Triangle extends Shape {

	@Override
	public void draw() {
		System.out.println("Drawing a Triangle");		
	}

}

class Circle extends Shape {

	@Override
	public void draw() {
		System.out.println("Drawing a Circle");		
	}

}

class Rectangle extends Shape {

	@Override
	public void draw() {
		System.out.println("Drawing a Rectangle");		
	}

}