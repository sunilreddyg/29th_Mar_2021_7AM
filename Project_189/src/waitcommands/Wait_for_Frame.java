package waitcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_for_Frame {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "new_driver_path\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/account/trips");
		driver.manage().window().maximize();
		
		
		WebDriverWait wait=new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("modal_window"));
		
		
		WebElement Email=driver.findElement(By.xpath("//input[@id='email']"));
		Email.clear();
		Email.sendKeys("darshan@gmail.com");

	}

}
