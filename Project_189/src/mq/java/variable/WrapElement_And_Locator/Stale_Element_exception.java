package mq.java.variable.WrapElement_And_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Stale_Element_exception
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();			
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
	
		WebElement Username=driver.findElement(By.id("email"));
		driver.navigate().refresh();
		Username.clear();           //Here variable is expired because page get refreshed
		Username.sendKeys("newuser");
		
		
		By Password_locator=By.xpath("//input[@id='pass']");
		driver.findElement(Password_locator).clear();
		driver.findElement(Password_locator).sendKeys("Hello@123");
		
		
		/*
		 * When do we get staleelementreference exception.
		 * 
		 * 			when any page object stored into reference variable and page
		 * 			is navigated/refreshed because of user interactions selenium will 
		 * 			expire variable information and throw "StaleElement Exception"
		 * 
		 */
		
	}

}
