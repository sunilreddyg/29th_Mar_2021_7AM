package switchcommands.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Alert_Presented_At_Webpage 
{

	public static void main(String[] args) throws Exception
	{
		
		/*
		 * FAQ:--> How to verify alert presented at webpage
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
		Alert_button.click();    //This action bring alert window
		
		
		boolean Alert_status=false;
		try {
			
			driver.switchTo().alert();   //Switch to is a method it throws exception incase alert not presented
			Alert_status=true;
			
		} catch (NoAlertPresentException e) {
			
		}
		
		
		
		if(Alert_status==true)
		{
			System.out.println("Alert is presented");
			driver.switchTo().alert().accept();
		}
		else
		{
			System.out.println("Alert is not presented");
		}
		
		
		
		
		
		
		

	}

}
