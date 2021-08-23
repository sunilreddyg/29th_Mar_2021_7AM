package oops.polymorphism.overriding;

public class Circle extends Shape
{
	
	public void draw()
	{
		System.out.println("Circle draw method");
	}

	public static void main(String[] args) {
		
		
		Circle c=new Circle();
		c.draw();
		
		
		Shape s=new Circle();
		s.draw();

	}

}
