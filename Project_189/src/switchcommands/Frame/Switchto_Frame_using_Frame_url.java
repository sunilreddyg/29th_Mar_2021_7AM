package switchcommands.Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switchto_Frame_using_Frame_url {

	public static void main(String[] args) 
	{
		
		/*
		 * FAQ:--> How to navigate to frame without using switch command
		 * 		Ans:-->In webpage every frame contains separate url
		 * 				we can switch to frame by using  naviage mthod.
		 */
		
		
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/account/trips");
		driver.manage().window().maximize();
		
		
		driver.navigate().to("https://www.cleartrip.com/signinstatic/tripidlogin.shtml?popup=no&guest=true");
		
		
		WebElement Email=driver.findElement(By.xpath("//input[@id='email']"));
		Email.clear();
		Email.sendKeys("darshan@gmail.com");
		
		
		//This syntax navigate back to previous page
		driver.navigate().back();

	}

}
