package mq.webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selecting_Dropdown_Using_Click_method 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://v1.hdfcbank.com/branch-atm-locator");
		driver.manage().window().maximize();
		
		//Select Option Xpath under Select Tag
		driver.findElement(By.xpath("//option[@value='karnataka'][contains(.,'karnataka')]")).click();
		Thread.sleep(3000);   //Load cities
		
		
		//Select Option xpath under Select Tag
		driver.findElement(By.xpath("//option[@value='bangalore'][contains(.,'Bengaluru')]")).click();

		
		
		
	}

}
