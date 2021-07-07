package switchcommands.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Alert {

	public static void main(String[] args) throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
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
		
		
		//Before interact with page we need to close alert
		
		
		//This syntax read text available at alert
		String Alert_msg=driver.switchTo().alert().getText();
		System.out.println("Alert conatinas text is---> "+Alert_msg);
		
		//This syntax click ok button at alert
		driver.switchTo().alert().accept();
		
		
		
		
		

	}

}
