package oops.polymorphism.overriding;

public class Square extends Shape
{
	
	
	public void draw()
	{
		System.out.println("Square draw method");
	}
	

	public static void main(String[] args) {
		
		Square sq=new Square();
		sq.draw();
		
		Shape parent=new Square();
		parent.draw();

	}

}
