package extentreports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class WebDriver_Test_With_Extent_Reports {

	public static void main(String[] args) 
	{
		
		String filepath="reports\\report2.html";
		ExtentReports reporter=new ExtentReports(filepath,true);
		
				ExtentTest test1=reporter.startTest("Tc001_valid_login");
				
						System.setProperty("webdriver.chrome.driver", "new_driver_path\\chromedriver.exe");
						WebDriver driver=new ChromeDriver();
						test1.log(LogStatus.INFO, "Browser launched");
						
						driver.get("https://opensource-demo.orangehrmlive.com/");
						test1.log(LogStatus.INFO, "site url loaded");
						
						driver.findElement(By.id("txtUsername")).sendKeys("Admin");
						test1.log(LogStatus.INFO, "Username Entered");
						
						driver.findElement(By.id("txtPassword")).sendKeys("admin123");
						test1.log(LogStatus.INFO, "Password Entered");
						
						driver.findElement(By.id("btnLogin")).click();
						test1.log(LogStatus.INFO, "Click on signin button");
						
						WebElement Dashboard=driver.findElement(By.xpath("//h1[contains(.,'Dashboard')]"));
						if(Dashboard.isDisplayed())
						{
							test1.log(LogStatus.PASS, "Login successfull");
						}
						else
						{
							test1.log(LogStatus.FAIL, "Login successfull");
						}
						
				
				reporter.endTest(test1);

	
		reporter.flush();   //Save and genarate report
		

	}

}
