package different_packge;

import mq.java.methods.InstanceMethods.Computer;

public class Test_Sample_Robot 
{

	public static void main(String[] args) 
	{
		
		/*
		 * In java other package mehods and variable to call
		 * we must import otherpackage references to current class.
		 * 
		 * Syntax:-->
		 * 
		 * 			import packagename.*;
		 * 			import packagename.classname;
		 * 
		 * Rule2:-->
		 * 		Only public modifier method able to call outside package.
		 */
		
		
		
		//WIth in package any class methods and variables to access no need to import..
		Sample_Robot robot=new Sample_Robot();
		robot.connect();
		robot.disconnect();
		
		//Calling Instant methods from diffent pacakge
		Computer com=new Computer();
		com.calculator();
		com.openexcel();
		
		
	}

}
