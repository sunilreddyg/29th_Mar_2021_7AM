package framework.testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Method_Description 
{
	
  @Test(description="browser launch")
  public void tc001() 
  {
	  Reporter.log("browser launch is successfull");
  }
  
  
  @Test(description="User Login valid")
  public void tc002() 
  {
	  Reporter.log("User login valid completed");
  }
  
  
  @Test(description="User login invalid")
  public void tc003() 
  {
	  Reporter.log("User login invalid completed");
  }
}
