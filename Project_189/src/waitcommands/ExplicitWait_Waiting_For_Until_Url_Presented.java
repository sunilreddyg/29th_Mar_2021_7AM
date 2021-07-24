package waitcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_Waiting_For_Until_Url_Presented {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "new_driver_path\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		
		
		//Enable dynamic timeout for automation browser
		WebDriverWait wait=new WebDriverWait(driver, 50);
		
		
		//Managing timeout until expected url presented
		wait.until(ExpectedConditions.urlToBe("https://www.selenium.dev/"));
		System.out.println("url verified for homepage");
		
		
		WebElement Download_Tab=driver.findElement(By.xpath("//a[@class='nav-item'][contains(.,'Downloads')]"));
		Download_Tab.click();
		
		//managing timeout until partial url presented
		wait.until(ExpectedConditions.urlContains("downloads/"));
		System.out.println("downloads page title verified");
		

	}

}
