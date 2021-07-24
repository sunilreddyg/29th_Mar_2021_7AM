package waitcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait_Object_Visibility {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "new_driver_path\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		
		
		//Enable dynamic timeout for automation browser
		WebDriverWait wait=new WebDriverWait(driver, 50);
		
		
	
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated
				(By.xpath("//a[@class='nav-item'][contains(.,'Downloads')]"))).click();
		System.out.println("Download button clicked");
		
		
		
		/*
		 * new WebdriverWait(Webdriver,50).until(ExpectedConditions.Visibilityof(WebElement));
		 * new WebdriverWait(Webdriver,50).until(ExpectedConditions.visibilityofELementLocated(By));
		 */
		
		

	}

}
