package mq.java.methods.static_methods;

public class StaticMethods 
{
	
	public void method1()
	{
		method2();   //Instant method calling
		method3();   //Static method calling
		System.out.println("method1 executed");
	}
	
	public void method2()
	{
		System.out.println("method2 executed");
	}
	
	
	public static void method3()
	{
		method4();  //Calling other static method inside static method with in class
	
		System.out.println("method3 executed");
	}
	
	public static void method4()
	{
		System.out.println("method4 executed");
	}
	

	public static void main(String[] args)
	{
		/*
		 * When main method available in same class incase method delcear with static keyword
		 * their is a posibility we can call static method without help of classname..
		 */
		method4();
		method3();
		
		
		/*
		 * Inorder to call instant methods from main method with in class we should
		 * create object to class. because main method is a static specifier.
		 */
		StaticMethods obj=new StaticMethods();
		obj.method1();
		obj.method2();

	}

}
