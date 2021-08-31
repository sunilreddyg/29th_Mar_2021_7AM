package framework.testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class My_TestngTest 
{
  @Test  //Invoke method to run without object creation
  public void tc001() 
  {
	 Reporter.log("tc001 executed");
  }
  
  
  @Test  //Invoke method to run without object creation
  public void tc002() 
  {
	  Reporter.log("tc002 executed");
  }
  
  @Test  //Invoke method to run without object creation
  public void tc003() 
  {
	  Reporter.log("tc002 executed");
  }
  
  
  
}
