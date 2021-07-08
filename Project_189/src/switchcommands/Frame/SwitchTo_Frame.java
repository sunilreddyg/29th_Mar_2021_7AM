package switchcommands.Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Frame {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/account/trips");
		driver.manage().window().maximize();
		
		
		//This command switch controls to frame from webpage.
		driver.switchTo().frame("modal_window");
		
		
		WebElement Email=driver.findElement(By.xpath("//input[@id='email']"));
		Email.clear();
		Email.sendKeys("darshan@gmail.com");
		
		
		WebElement TripID=driver.findElement(By.xpath("//input[@id='tripidSecond']"));
		TripID.clear();
		TripID.sendKeys("7979797987");
		
		
		//Bring control back to mainpage
		driver.switchTo().defaultContent();
		
		
		WebElement FeedBack_link=driver.findElement(By.xpath("//a[contains(.,'Feedback')]"));
		FeedBack_link.click();
		Thread.sleep(5000);
		
		
		/*
		 * Note:-->In selenium inorder to identify frame under objects we need to 
		 * 		   switch to frame first.
		 */
		 driver.switchTo().frame(1);     //Index number starts from zero
		
		
		WebElement Feedback_Email=driver.findElement(By.xpath("//input[@id='email_address']"));
		Feedback_Email.clear();
		Feedback_Email.sendKeys("darshan@gmail.com");
		
		
		//get Control back to mainpage
		driver.switchTo().defaultContent();
		
		

	}

}
