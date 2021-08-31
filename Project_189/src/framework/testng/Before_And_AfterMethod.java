package framework.testng;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class Before_And_AfterMethod 
{

  
  @BeforeClass //Method invoke before execution of first @Test with in class
  public void beforeClass() 
  {
	  System.out.println("Class Precondition");
  }

  @AfterClass  //Method invoke after execution of last @Test with in class
  public void afterClass() 
  {
	  System.out.println("Class PostCondition");
  }

  
  @Test
  public void tc001()
  {
	  Reporter.log("tc001 finished",true);
  }
  
  
  @Test
  public void tc002()
  {
	  Reporter.log("tc002 finished",true);
  }
  
  
}
