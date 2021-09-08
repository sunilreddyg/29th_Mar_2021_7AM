package framework.testng.listeners;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTests 
{
  @Test
  public void tc001() 
  {
	  Reporter.log("Tc001 Executed");
  }
  
  
  @Test
  public void tc002() 
  {
	  Reporter.log("Tc002 Executed");
  }
}
