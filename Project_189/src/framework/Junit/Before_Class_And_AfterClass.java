package framework.Junit;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class Before_Class_And_AfterClass 
{

	@BeforeClass  //It invoke before execution of first @Test annotation
	public static void setUpBeforeClass() throws Exception 
	{
		System.out.println("Class PreCondition");
	}

	@AfterClass  //It invoke after execution of last @Test annotation
	public static void tearDownAfterClass() throws Exception
	{
		System.out.println("Class Postcondition");
	}

	@Test
	public void test1() 
	{
		System.out.println("Test1 is executed");
	}
	
	@Test
	public void test2() 
	{
		System.out.println("Test2 is executed");
	}
	
	@Test
	public void abcd() 
	{
		System.out.println("Test3 is executed");
	}


}
