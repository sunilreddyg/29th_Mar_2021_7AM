package framework.testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Method_Ignore 
{
  @Test(priority=1)
  public void login() 
  {
	  Reporter.log("login is successfull");
  }
  
  @Test(priority=2)
  public void logout() 
  {
	  Reporter.log("logout is successfull");
  }
  
  @Test(priority=0,enabled=false)
  public void registration() 
  {
	  Reporter.log("registration is successfull");
  }
  
  
}
