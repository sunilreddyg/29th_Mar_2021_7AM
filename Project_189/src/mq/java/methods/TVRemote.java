package mq.java.methods;

public class TVRemote 
{
	
	public void ON()
	{
		System.out.println("TV remote is turned on");
	}
	
	public void OFF()
	{
		System.out.println("TV remote is turned off");
	}
	
	public void I_volume()
	{
		System.out.println("Volume Increased");
	}
	
	public void D_volume()
	{
		System.out.println("Volume Decreased");
	}
	
	

	public static void main(String[] args) 
	{
		
		/*
		 * Create object for class inorder to call methods and variables
		 * 	Syntax:-->
		 * 				ClassName obj=new ClassName();
		 * 				obj.methodname();
		 */
		
		TVRemote obj=new TVRemote();
		obj.ON();
	    obj.I_volume();
		

	}


}
