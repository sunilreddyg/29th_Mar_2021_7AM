package objectidentification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector_With_Partial_Selector 
{

	public static void main(String[] args) 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();					//Open Browser
		driver.get("https://www.rediff.com/");					//Load webapge
		driver.manage().window().maximize();					//Maximize browser window
		
		
		WebElement create_Account_link=driver.findElement(By.xpath("//a[contains(@href,'details')]"));
		create_Account_link.click();
		
		
		driver.findElement(By.cssSelector("input[name*='name']"));
		System.out.println("Object is IDentified");
		
		
		driver.findElement(By.cssSelector("input[name*='login']"));
		System.out.println("Object id Identified ");
		
		

	}

}
