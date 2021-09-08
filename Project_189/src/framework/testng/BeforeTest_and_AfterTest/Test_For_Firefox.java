package framework.testng.BeforeTest_and_AfterTest;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Test_For_Firefox
{
	
	

	  @AfterTest
	  public void afterTest() 
	  {
		  System.out.println("posttest after firefox launch ");
	  }
	  
	  @BeforeTest
	  public void beforeTest()
	  {
		  System.out.println("Pretest before firefox launch");
	  }
	  
	  @Test
	  public void Logout()
	  {
		  System.out.println("Logout");
	  }
	  
	  
	  
}
