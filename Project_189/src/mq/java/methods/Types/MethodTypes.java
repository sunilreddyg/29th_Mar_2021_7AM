package mq.java.methods.Types;

public class MethodTypes 
{
	
	/*
	 * Method type is a void. It means method doesn't return any value
	 * Simple it execute all statements under method.
	 */
	public void method1()
	{
		System.out.println("Method 1 executed");
	}
	
	
	
	/*
	 * Method type is int.In int place we can define any other method types as well
	 * 	[Datatypes, Classes, arrays, Collection ---etc]
	 * 
	 * 	=> Otherthan void all methodtype return values
	 * 	=> We must decleare return keyword at end of the method
	 * 	=> Return value should match with type of method
	 * 	=> Finally it return value to methodname..
	 * 
	 */
	public int method2()
	{
		return 100;
		
	}
	


	public static void main(String[] args)
	{
		
		MethodTypes obj=new MethodTypes();
		obj.method1();
		//Calling return type method..
		int x=obj.method2();
		System.out.println(x+100);
		

	}

}
