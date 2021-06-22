package mq.java.variable.WrapElement_And_Locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Common_Objects 
{
	
	static String username="Darshan@gmail.com";
	static String password="Newpwd@123";

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();			
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
		
		driver.findElement(Common_Objects.Login_Email).sendKeys(username);
		driver.findElement(Common_Objects.Login_password).sendKeys(password);
		driver.findElement(Common_Objects.Signin_button).click();
		

	}

}
