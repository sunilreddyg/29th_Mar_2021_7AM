package framework.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test_with_Invacation_Count 
{
	
	int count=1;
  @Test(invocationCount=12,timeOut=500)
  public void Tc001() 
  {
		new Select(driver.findElement(By.id("month"))).selectByIndex(count);
		count=count+1;
  }
  
  
  WebDriver driver;
  String driver_path="new_driver_path\\";
  String url="https://www.facebook.com/r.php";
  
  @BeforeClass
  public void SetupBrowser()
  {
	  System.setProperty("webdriver.chrome.driver", driver_path+"chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get(url);
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }
  
 
  
  
  
  
  
}
