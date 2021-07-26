package waitcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_For_Alert {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "new_driver_path\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://bridgeqsystems.com/demo.php");
		driver.manage().window().maximize();
		
		
		WebElement Nav_alert=driver.findElement(By.xpath("//a[@id='v-pills-messages-tab']"));
		Nav_alert.click();
		Thread.sleep(4000);
		
		WebElement Alert_link=driver.findElement(By.xpath("//button[contains(.,'Alerts')]"));
		Alert_link.click();
		Thread.sleep(4000);
		
		WebElement Alert_button=driver.findElement(By.xpath("//button[@id='alertButton']"));
		Alert_button.click();    //This action bring alert window
		
		
		WebDriverWait wait=new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.alertIsPresent()).accept();
		System.out.println("Alert presented and closed");

	}

}
