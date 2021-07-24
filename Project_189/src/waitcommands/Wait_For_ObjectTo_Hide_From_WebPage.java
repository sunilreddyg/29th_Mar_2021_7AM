package waitcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_For_ObjectTo_Hide_From_WebPage 
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "new_driver_path\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		
		
		//Enable dynamic timeout for automation browser
		WebDriverWait wait=new WebDriverWait(driver, 100);
		
		
		By Downlaod_loc=By.xpath("//a[@class='nav-item'][contains(.,'Downloads')]");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(Downlaod_loc));
		System.out.println("Object is hidden at webpage");

	}

}
