package mq.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_Interface_Example {

	public static void main(String[] args) 
	{
		
		
		
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();     //Launching chrome browser
		driver.get("http://www.facebook.com");		 //Loading new page to browser window
		driver.manage().window().maximize();     //maximize browser window [optional]
		
	
		
		/*
		 * Exceptions:-->
		 * 	=>  WebDriver driver=new ChromeDriver();
		 * 		
		 * 		IllegalStateException:-->
		 * 			When Chromdriver.exe file not located
		 * 			under current system.
		 * 
		 * 	=> driver.get("http://google.com");
		 * 		
		 * 		SessionNotCreated:-->
		 * 			Exception display when browserdriver
		 * 			version mismatch with browser version.
		 * 
		 * 		InvalidArgumentException:-->
		 * 			When Url defined without http:// or https://
		 * 	
		 * 			Invalid:-->    driver.get("www.google.com");
		 * 			Valid:---->	   driver.get("http://google.com");
		 */
		
		
		
		/*
		 * Webdriver is a interface class it is designed to automate
		 * all browser instances supported by selenium.
		 * 
		 * Webdriver is a common interface it helps to automate
		 * all browser instances.
		 */
		
	}

}
