package ui_verification_Commands.gettext;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Header_Text_Visibility {

	public static void main(String[] args) throws Exception 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://outlook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		WebElement Signin_btn=driver.findElement(By.xpath("(//a[contains(.,'Sign in')])[1]"));
		Signin_btn.click();
		Thread.sleep(4000);
		
		
		//Verify Singin page header displayed
		WebElement Login_Header=driver.findElement(By.xpath("//div[@role='heading']"));
		String Header_Text=Login_Header.getText();
		
		
		
		if(!Header_Text.isEmpty())  //!--NOT
		{
			System.out.println("Text visible at webpage");
			
			if(Header_Text.equals("Sign in"))
				System.out.println("Expected Header displayed");
			else
				System.out.println("Wrong Header displayed");
		}
		else
		{
			System.out.println("Location Doesn't contain text");
		}
		
		
		
		
		
		
	}

}
