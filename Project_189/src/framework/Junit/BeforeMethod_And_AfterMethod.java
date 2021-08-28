package framework.Junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BeforeMethod_And_AfterMethod {

	@Before //It invoke every @Test before
	public void setUp() throws Exception 
	{
		System.out.println("Test PreCondition");
	}

	@After //It invoke every @Test after
	public void tearDown() throws Exception
	{
		System.out.println("Test PostCondition"+"\n");
	}

	@Test
	public void test1() 
	{
		System.out.println("Test1 executed");
	}
	
	
	@Test
	public void test2() 
	{
		System.out.println("Test2 executed");
	}


}
