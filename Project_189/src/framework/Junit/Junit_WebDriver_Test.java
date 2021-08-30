package framework.Junit;


import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junit_WebDriver_Test 
{
	
	static WebDriver driver;
	static String Driver_path="new_driver_path//";


	@Test
	public void HRM_Login_valid() throws Exception 
	{
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@id='welcome']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='/index.php/auth/logout']")).click();
	}
	

	@Test
	public void HRM_Forgot_password() 
	{
		driver.findElement(By.xpath("//a[@href='/index.php/auth/requestPasswordResetCode']")).click();
		System.out.println("Forgot page title is ---> "+driver.getCurrentUrl());
	}
	
	
	@Before
	public void beforemethod() throws Exception
	{
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", Driver_path+"chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception
	{
		Thread.sleep(5000);
		driver.close();
	}

}
