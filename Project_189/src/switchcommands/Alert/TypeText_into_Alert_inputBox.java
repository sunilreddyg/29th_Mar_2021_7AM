package switchcommands.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TypeText_into_Alert_inputBox {

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
		
		
		WebElement prompt_button=driver.findElement(By.xpath("//button[@id='promtButton']"));
		prompt_button.click();  //This action bring prompt dialog at webpage
		
		
		//Type text into alert input box
		driver.switchTo().alert().sendKeys("SunilReddy");
		driver.switchTo().alert().accept();
		
		

	}

}
