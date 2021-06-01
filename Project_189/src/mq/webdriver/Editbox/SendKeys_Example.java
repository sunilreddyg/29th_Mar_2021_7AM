package mq.webdriver.Editbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys_Example 
{

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();		//Open Browser
		driver.get("http://outlook.com");			//Load webapge
		driver.manage().window().maximize();		//Maximize browser window
		
		
		//Syntax to click Signin Button
		driver.findElement(By.xpath("//a[@data-m='{\"cN\":\"SIGNIN\",\"sN\":\"P6\",\"pV\":\"1\"}'][contains(.,'Sign in')]")).click();
		
		
		//Type text into textbox and press enter using keyboard shortcut
		driver.findElement(By.id("i0116")).clear();   
		driver.findElement(By.id("i0116")).sendKeys("sunilreddy.gajjala@outlook.com"+Keys.ENTER);
		
		Thread.sleep(4000);
		
		//Type Text into textbox and press enter using keybaord shrotcut
		driver.findElement(By.id("i0118")).clear();
		driver.findElement(By.id("i0118")).sendKeys("Darsh@1234"+Keys.ENTER);
		

	}

}
