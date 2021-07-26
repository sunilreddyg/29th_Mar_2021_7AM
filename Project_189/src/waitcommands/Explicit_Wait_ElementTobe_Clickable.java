package waitcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait_ElementTobe_Clickable 
{

	public static void main(String[] args) throws Exception 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "new_driver_path\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		
		
		
		
		
		//Enabled Explicitwait timeout on automation browser
		WebDriverWait wait=new WebDriverWait(driver, 50);
	
		
		By Deparute_Loc=By.xpath("(//input[@placeholder='Any worldwide city or airport'])[1]");
		driver.findElement(Deparute_Loc).click();
		
		
		By Delhi_City_Option=By.xpath("//p[contains(.,'New Delhi, IN - Indira Gandhi Airport (DEL)')]");
		wait.until(ExpectedConditions.elementToBeClickable(Delhi_City_Option)).click();
		System.out.println("Timeout released element is at clickable position");
		
		

	}

}
