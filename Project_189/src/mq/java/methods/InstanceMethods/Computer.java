package mq.java.methods.InstanceMethods;

public class Computer 
{
	public Computer()
	{
		System.out.println("Start Computer");
	}
	
	
	//Instant method[Because these method not declare with static]
	public void calculator()          
	{
		System.out.println("Calculator opened");
	}
	
	//Instant method[Because these method not declare with static]
	public void openexcel()			  
	{
		System.out.println("Excel is opened");
	}
	
	

	public static void main(String[] args) 
	{
		
		/*
		 * Calling instant methods with help of class constructor.
		 */
		new Computer().calculator();
		new Computer().openexcel();
		
		
		/*
		 * Calling instant methods using object creation.
		 * 	Syntax:-->
		 * 			Classname obj=new Classname();
		 * 			obj.methodname();
		 */
		Computer obj=new Computer();
		obj.calculator();
		obj.openexcel();
			
	}

}
