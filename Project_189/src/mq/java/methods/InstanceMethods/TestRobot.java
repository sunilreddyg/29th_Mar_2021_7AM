package mq.java.methods.InstanceMethods;

public class TestRobot 
{
	//Instant method
	void walkTest()
	{
		System.out.println("walktest is completed");
	}
	
	//Instant method
	void RunTest()
	{
		System.out.println("Run Test completed");
	}
	
	//Instant method
	void grab_test()
	{
		System.out.println("Grab test completed");
	}
	
	
	

	public static void main(String[] args)
	{
		//robot is a variable name we can declare any thing here
		TestRobot robot=new TestRobot();
		robot.walkTest();
		robot.RunTest();
		robot.grab_test();
		
		
	}

}
