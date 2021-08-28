package framework.Junit;

import org.junit.Test;

public class Junit_Sample_Test 
{
	
	@Test  //Invoke method to run without object creation
	public void Tc001() throws Exception
	{
		System.out.println("Tc001 Executed");
	}
	
	
	@Test
	public void Tc002()
	{
		System.out.println("Tc002 Executed");
	}
	
	
	@Test
	public void Tc003()
	{
		System.out.println("Tc003 Executed");
	}


}
