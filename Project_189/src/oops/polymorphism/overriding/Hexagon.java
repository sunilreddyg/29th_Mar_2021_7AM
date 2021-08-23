package oops.polymorphism.overriding;

public class Hexagon extends Shape
{
	@Override  //This syntax will findout the method is really overriden or not
	public void draw()
	{
		super.draw();   //Super keyword call parent class methods
		System.out.println("Hexagon draw method");
	}

	public static void main(String[] args) {
		
		
		Shape s=new Hexagon();
		s.draw();
		
		

	}

}
