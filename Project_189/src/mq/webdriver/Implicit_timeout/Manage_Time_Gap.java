package mq.webdriver.Implicit_timeout;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Manage_Time_Gap 
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		System.out.println("maximized");
		
		
		
		driver.findElement(By.id("identifierId"));
		System.out.println("Object identified");
		
		

		/*
		 * => In general selenium throw quick exception when element not
		 * 	  idenitfy at page. Instead of Implicitly wait hold exception
		 * 	  for given timeout..
		 */
		

	}

}
