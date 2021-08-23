package oops.Inheritance;

public class ChildA extends Parent
{

	String name="BQ"; 
	
	void method2()
	{
		System.out.println("ChildA method executed");
	}
	
	void testcase()
	{
		/*
		 * Here variable and method access without object creation.
		 *  because ChildA class extended from parent class
		 * 
		 */
		System.out.println(name);	  //Variable from child class 
		System.out.println(username); //Parent class variable  
		method1();					  //Parent class method
	}
	
	
	public static void main(String args[])
	{
		ChildA obj=new ChildA();
		obj.method1();   //Method from parent class
		obj.method2();   //Method from child class
		
		Parent ref=new ChildA();
		ref.method1();
		System.out.println(ref.username);
	}

}
