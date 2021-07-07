package switchcommands.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Alertnative_Method_To_Verify_Alert_Presented {

	public static void main(String[] args) throws Exception {
		
		
		/*
		 * FAQ:--> Is there any alertnative or direct method to verify
		 * 			alert presented at webpage
		 */
		
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
		//Alert_button.click();    //This action bring alert window
		
		
		
		
		if(ExpectedConditions.alertIsPresent().apply(driver)!=null)
		{
			System.out.println("Alert presented");
		}
		else
		{
			System.out.println("Alert not presented");
		}

	}

}
