package ui_verification_Commands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Pageurl 
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.get("https://www.selenium.dev/");
		WebElement Download_link=driver.findElement(By.xpath("//a[@class='nav-item'][contains(.,'Downloads')]"));
		Download_link.click();
		
		
		String Exp_url="https://www.selenium.dev/downloads/";
		
		//This syntax capture current window url
		String page_url=driver.getCurrentUrl();
		
		
		//Verify Download page loaded using url
		if(page_url.contains("downloads"))
		{
			System.out.println("Expected url presented");
		}
		else
		{
			System.out.println("Wrong url presented");
		}
		
		
		//Verify page is secured with help of protocal
		if(page_url.contains("https"))
		{
			System.out.println("Page is Secured");
		}
		else
		{
			System.out.println("page is not secured");
		}

	}

}
