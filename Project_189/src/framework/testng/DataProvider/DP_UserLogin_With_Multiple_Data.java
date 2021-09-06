package framework.testng.DataProvider;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DP_UserLogin_With_Multiple_Data {
 

  @DataProvider
  public Object[][] Login_Data() 
  {
    return new Object[][] {
      new Object[] { "user1","pwd1"},
      new Object[] { "user2","pwd2"},
      new Object[] { "user3","pwd3"},
      new Object[] { "user4","pwd4"},
      new Object[] { "user5","pwd5"},
      new Object[] { "user6","pwd6"},
      new Object[] { "user7","pwd7"},
    };
  }
  
  
  WebDriver driver;
  String driver_path="new_driver_path\\";
  String url="http://facebook.com";
  
  @BeforeClass
  public void SetupBrowser()
  {
	  System.setProperty("webdriver.chrome.driver", driver_path+"chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }
  
 @BeforeMethod
 public void loadPage()
 {
	 driver.get(url);
 }
  
  
  @Test(dataProvider="Login_Data")
  public void Test_login(String UID, String PWD) throws Exception
  {
	  driver.findElement(By.id("email")).sendKeys(UID);
	  driver.findElement(By.id("pass")).sendKeys(PWD);
	  Thread.sleep(3000);
  }
  
  
  
}
