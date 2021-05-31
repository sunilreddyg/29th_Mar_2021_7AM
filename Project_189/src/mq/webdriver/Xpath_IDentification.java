package mq.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_IDentification {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();		//Open Browser
		driver.get("http://facebook.com");			//Load webapge
		driver.manage().window().maximize();		//Maximize browser window
		
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("darshan@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Hello123");
		driver.findElement(By.xpath("//button[contains(@value,'1')]")).click();
	}

}
