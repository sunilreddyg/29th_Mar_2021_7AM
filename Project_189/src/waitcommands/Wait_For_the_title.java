package waitcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_For_the_title 
{

	public static void main(String[] args) throws Exception
	{
		
		System.setProperty("webdriver.chrome.driver", "new_driver_path\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		
		//Enable dynamic timeout for automation browser
		WebDriverWait wait=new WebDriverWait(driver, 50);
		
		
		//Manage timeout until partial title presented at browser window
		wait.until(ExpectedConditions.titleContains("SeleniumHQ"));
		System.out.println("Title verified for selenium homepage");
		
		
		WebElement Download_Tab=driver.findElement(By.xpath("//a[@class='nav-item'][contains(.,'Downloads')]"));
		Download_Tab.click();
		
		
		//Manage timeout until exact title presented at browser window
		wait.until(ExpectedConditions.titleIs("Downloads"));
		System.out.println("Title verified for downlods page");
		
		
		
		
		
		

	}

}
