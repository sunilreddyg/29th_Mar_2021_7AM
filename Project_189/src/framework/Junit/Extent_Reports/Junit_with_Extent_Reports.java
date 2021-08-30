package framework.Junit.Extent_Reports;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Junit_with_Extent_Reports 
{
	public @Rule TestName rule=new TestName();
	
	static ExtentReports logger;
	static ExtentTest test;
	static String filepath="Reports\\Junit_Reports.html";


	@Test
	public void Tc001_Login_page()
	{
		test.log(LogStatus.INFO, "login page displayed");
	}
	
	
	@Test
	public void Tc001_Signup_page()
	{
		test.log(LogStatus.INFO, "Register page displayed");
	}
	
	
	@Test
	public void Tc001_Messenger_page()
	{
		test.log(LogStatus.INFO, "Messenger page displayed");
	}
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		logger=new ExtentReports(filepath,true);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		logger.flush();
	}

	@Before
	public void setUp() throws Exception 
	{
		test=logger.startTest(rule.getMethodName());
	}

	@After
	public void tearDown() throws Exception 
	{
		logger.endTest(test);
	}

	

}
