package mq.java.methods;

public class SmartDore 
{
	
	public static void openDoor()
	{
		System.out.println("Door is opened");
	}
	
	public static void CloseDoor()
	{
		System.out.println("Door is closed");
		
	}
	

	public static void main(String[] args) 
	{
		/*
		 * Any public class static methods to call we should follow below syntax
		 * 	Syntax:-->
		 * 				Classname.methodname();
		 */
		SmartDore.openDoor();
		SmartDore.CloseDoor();
		
		/*
		 * static is a access specifier it allow to call any static methods and variables
		 * without object creation.
		 */

	}

}
