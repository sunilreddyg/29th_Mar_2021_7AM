package framework.Junit;


import java.io.File;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Junit_WebDriver_Test2 {

	static WebDriver driver;
	static String Driver_path="new_driver_path//";
	
	public @Rule TestName test=new TestName();
	//Allow Current Constructed methods to access
	
	@Test
	public void verify_Signup_link()
	{
		driver.findElement(By.xpath("//a[@href='/r.php'][contains(.,'Sign Up')]")).click();
		Assert.assertEquals("Sign up for Facebook | Facebook", driver.getTitle());
		System.out.println("Signup page title verified");
		
	}
	
	
	@Test
	public void verify_Login_link()
	{
		driver.findElement(By.xpath("//a[@href='/login/']")).click();
		Assert.assertTrue(driver.getTitle().contains("Log in"));
		System.out.println("Login page title verified");
	}
	
	
	@Test
	public void verify_messnger_link()
	{
		driver.findElement(By.xpath("//a[@href='https://messenger.com/']")).click();
		Assert.assertEquals("Messenger", driver.getTitle());
		System.out.println("Messenger page title verified");
	}
	
	
	@After
	public void aftermethod() throws Exception
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.createDir(new File("Screens"));
		FileHandler.copy(src, new File("Screens\\"+test.getMethodName()+".png"));
		//test.getMethodname();
		//Capture current constructed method name
	}
	
	
	@Before
	public void beforemethod() throws Exception
	{
		driver.get("https://facebook.com");
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
