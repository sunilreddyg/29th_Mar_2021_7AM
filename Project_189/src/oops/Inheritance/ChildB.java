package oops.Inheritance;

public class ChildB extends ChildA
{
	
	void testcase()
	{
		System.out.println(username);  //From parent class
		System.out.println(name);      //From ChildA class
		
		method1();   //Parent class mehtod
		method2();   //ClassA class method
	}
	
	public static void main(String args[])
	{
		
		ChildB obj=new ChildB();
		obj.method1();   //From parent class
		obj.method2();   //From child class classA
		obj.testcase();  //From child class ClassB
		
		//Create object with parent class
		Parent obj1=new ChildB();
		System.out.println(obj1.username);
		
		
		
		
	}
	
	

}
