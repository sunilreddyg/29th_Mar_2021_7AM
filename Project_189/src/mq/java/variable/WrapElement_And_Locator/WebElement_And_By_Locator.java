package mq.java.variable.WrapElement_And_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class WebElement_And_By_Locator 
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();			
		driver.get("https://en-gb.facebook.com/");
		
		
		
		Window win=driver.manage().window();
		win.maximize();
		win.getSize();
		win.getPosition();
		
		
	
		//Without wrapping object into webelement
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("Darshan@gmail.com");
		
		
		//wrap webpage object into WebElement Reference
		WebElement password_textbox=driver.findElement(By.id("pass"));
		password_textbox.clear();
		password_textbox.sendKeys("newpwd@123");
		
		
		
		By Login_locator=By.xpath("//button[@name='login']");
		driver.findElement(Login_locator).click();
		
		
		
		
		
		
		
		
		
		

	}

}
