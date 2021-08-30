package framework.Junit;


import org.junit.Ignore;
import org.junit.Test;

public class Ignore_method 
{

	@Test
	public void test1()
	{
		System.out.println("test1 executed");
		
	}
	
	@Ignore //It ignore method execution
	public void test2()
	{
		System.out.println("test2 executed");
		
	}
	
	public void test3()
	{
		System.out.println("test3 executed");
		
	}


}
