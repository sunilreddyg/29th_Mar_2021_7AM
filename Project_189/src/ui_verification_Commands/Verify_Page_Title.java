package ui_verification_Commands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Page_Title 

{

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//load url to browser window
		driver.get("https://www.selenium.dev/");
		
		//Get Current Window title runtime title
		String act_title=driver.getTitle();
		
		String exp_title="SeleniumHQ Browser Automation";
		
		
		//Condition to print Test result
		if(act_title.equals(exp_title))
		{
			System.out.println("Testpass, Expected title presented");
		}
		else
		{
			System.out.println("Testfail, Wrong title presented");
		}

	}

}
