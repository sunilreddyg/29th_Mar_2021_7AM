package framework.framework.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

public class Before_And_After_method 
{
	
	
	@Test
	public void tc001()
	{
		Reporter.log("Tc001 Finished",true);
	}
	
	

	@Test
	public void tc002()
	{
		Reporter.log("Tc002 Finished",true);
	}
	
	
  
  @BeforeMethod  //This method will invoke every @Test annotation before
  public void beforeMethod() 
  {
	  System.out.println("Method PreCondition");
  }

  @AfterMethod  //This method will invoke every @Test annotation after
  public void afterMethod() 
  {
	  System.out.println("Method PostCondition"+"\n");
  }

}
