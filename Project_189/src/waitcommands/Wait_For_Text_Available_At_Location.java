package waitcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_For_Text_Available_At_Location {

	public static void main(String[] args) 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "new_driver_path\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.outlook.com/");
		driver.manage().window().maximize();
		
		//Enabled Explicitwait timeout on automation browser
		WebDriverWait wait=new WebDriverWait(driver, 50);
		
		By Singin_btn=By.xpath("(//a[contains(.,'Sign in')])[1]");
		wait.until(ExpectedConditions.visibilityOfElementLocated(Singin_btn)).click();
		
		
		By Email_textbox=By.xpath("//input[@id='i0116']");
		WebElement Email=wait.until(ExpectedConditions.visibilityOfElementLocated(Email_textbox));
		Email.clear();
		Email.sendKeys("sunilreddy.gajjala@outlook.com",Keys.ENTER);
		
		
		//Verify Display name showing requried text
		By DisplayName_loc=By.xpath("//div[@id='displayName']");
		wait.until(ExpectedConditions.textToBePresentInElementLocated(DisplayName_loc, "sunilreddy.gajjala@outlook.com"));
		System.out.println("Text presented at location");
		
		
		
		
	}

}
