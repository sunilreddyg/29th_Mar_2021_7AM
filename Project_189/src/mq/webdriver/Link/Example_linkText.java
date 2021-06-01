package mq.webdriver.Link;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_linkText {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();			//Open Browser
		driver.get("https://www.facebook.com");			//Load webapge
		driver.manage().window().maximize();			//Maximize browser window
		
		
		
		/*
		 * <a href="/directory/pages/" title="Browse our Pages directory.">Pages</a>
		 */
		driver.findElement(By.linkText("Pages")).click();
		
		
		
		/*
		 * <a href="/pages/Leo-Messi/176063032413299" title="Leo Messi">Leo Messi</a>
		 */
		driver.findElement(By.linkText("Leo Messi")).click();
		
		

	}

}
