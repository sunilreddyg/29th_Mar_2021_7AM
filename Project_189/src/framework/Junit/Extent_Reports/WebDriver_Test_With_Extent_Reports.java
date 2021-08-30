package framework.Junit.Extent_Reports;


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
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class WebDriver_Test_With_Extent_Reports {

    public @Rule TestName rule=new TestName();
	
	static ExtentReports logger;
	static ExtentTest test;
	static String filepath="Reports\\Junit_Reports.html";
	static WebDriver driver;
	static String Driver_path="new_driver_path//";
	String url="http://facebook.com";

	@Test
	public void Tc001_Login_page()
	{
		driver.findElement(By.xpath("//a[@href='/login/']")).click();
		Assert.assertTrue(driver.getTitle().contains("Log in"));
		test.log(LogStatus.INFO, "login page displayed");
	}
	
	
	@Test
	public void Tc001_Signup_page()
	{
		driver.findElement(By.xpath("//a[@href='/r.php'][contains(.,'Sign Up')]")).click();
		Assert.assertEquals("Sign up for Facebook | Facebook", driver.getTitle());
		test.log(LogStatus.INFO, "Register page displayed");
	}
	
	
	@Test
	public void Tc001_Messenger_page()
	{
		driver.findElement(By.xpath("//a[@href='https://messenger.com/']")).click();
		Assert.assertEquals("Messenger", driver.getTitle());
		test.log(LogStatus.INFO, "Messenger page displayed");
	}
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", Driver_path+"chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		logger=new ExtentReports(filepath,true);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		Thread.sleep(5000);
		driver.close();
		logger.flush();
		
	}

	@Before
	public void setUp() throws Exception 
	{
		driver.get(url);
		test=logger.startTest(rule.getMethodName());
	}

	@After
	public void tearDown() throws Exception 
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("Screens\\"+rule.getMethodName()+".png"));
		logger.endTest(test);
	}

}
