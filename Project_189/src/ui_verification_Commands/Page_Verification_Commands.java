package ui_verification_Commands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page_Verification_Commands 
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		//load url to browser window
		driver.get("https://www.selenium.dev/");
		
		
		//Get Current Window title
		String page_title=driver.getTitle();
		System.out.println("Current window page title is "+page_title);
		
		//Get Current Window URL
		String page_url=driver.getCurrentUrl();
		System.out.println("current window page url is --> "+page_url);
		
		//Get Current Window ID
		String WIndowID=driver.getWindowHandle();
		System.out.println("Runtime ID is --> "+WIndowID);
		
		
		//get Current Page source
		String page_source=driver.getPageSource();
		System.out.println("current window pag source is --->"+page_source);
		
		
		
		

	}

}
