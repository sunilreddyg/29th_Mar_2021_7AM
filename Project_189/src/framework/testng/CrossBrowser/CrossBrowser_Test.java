package framework.testng.CrossBrowser;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser_Test 
{
	public WebDriver driver;
	String path="new_driver_path\\";
	
	@Test(priority=0)
	@Parameters("browsername")  //Parameter from suite file
	public void launchBrowser(String browser)
	{
		switch (browser) 
		{
		case "firefox":
			System.setProperty("webdriver.gecko.driver",path+"geckodriver.exe");
			driver=new FirefoxDriver();
			break;
			
		case "chrome":
			//Set Runtime environment variable for chrome driver
			System.setProperty("webdriver.chrome.driver", path+"chromedriver.exe");
			driver=new ChromeDriver();
			break;
			
		case "ie":
			System.setProperty("webdriver.ie.driver",path+"IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			break;
				
		default:System.out.println("browser mismatch");
			break;
		}
	}
	
	
	@Test(priority=1)
	@Parameters("Application_url")   //Parameter from suite file
	public void loadApp(String url) throws Exception
	{
		Thread.sleep(5000);
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	
	@Test(priority=2)
	@Parameters({"UID","PWD"})
	public void User_login(String Auid,String Apwd) throws Exception
	{
		WebElement Email_EB=driver.findElement(By.id("email"));
		Email_EB.clear();
		Email_EB.sendKeys(Auid);
		Reporter.log("Email enter finished");
		
		WebElement Passoword_EB=driver.findElement(By.id("pass"));
		Passoword_EB.clear();
		Passoword_EB.sendKeys(Apwd);
		Reporter.log("Password Enter finished");
				

	}
	
	@Test(priority=3)
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.close();
	}
	

}
