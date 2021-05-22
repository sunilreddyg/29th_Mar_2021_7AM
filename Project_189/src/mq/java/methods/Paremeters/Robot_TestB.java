package mq.java.methods.Paremeters;

public class Robot_TestB 
{
	
	//method declare with parameter
	public void run(int km)
	{
		System.out.println("Run completed in km speed--> "+km);
	}
	
	//Method with multiple parameters
	public void Ask_robot_to_walk(String direction, int Steps)
	{
		System.out.println(direction+" --> "+Steps);
	}
	
	public static void main(String[] args) 
	{
		
		Robot_TestB obj=new Robot_TestB();
		obj.run(12);
		obj.run(10);
		obj.run(14);
		
		//Calling method with multiple arguments/functional parameters
		obj.Ask_robot_to_walk("Right", 10);
		obj.Ask_robot_to_walk("left", 4);
		obj.Ask_robot_to_walk("forward", 14);
	}

}
