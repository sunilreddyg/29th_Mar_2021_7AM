package ui_verification_Commands.gettext;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Element_Text {

	public static void main(String[] args) throws Exception 
	{
		
		/*
		 * Scenario:-->
		 * 			Verify login with invalid email
		 * 	
		 * 			Given site url http://outlook.com
		 * 			And click signin button
		 * 			When user Enter invalid email "info3efdf@gmail.com"
		 * 			And click Next button
		 * 			Then verify Error message displayed at error location
		 */
		
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://outlook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		WebElement Signin_btn=driver.findElement(By.xpath("(//a[contains(.,'Sign in')])[1]"));
		Signin_btn.click();
		
		WebElement Email=driver.findElement(By.xpath("//input[@id='i0116']"));
		Email.clear();
		Email.sendKeys("info3efdf@gmail.com"+Keys.ENTER);
		Thread.sleep(4000);
		
		
		WebElement Error_location=driver.findElement(By.id("usernameError"));
		String Runtime_Err_msg=Error_location.getText();
		System.out.println(Runtime_Err_msg);
		
		
		String Exp_err_msg="That Microsoft account doesn't exist. Enter a different account or get a new one.";

		
		//Verify Expected error message matching with actual error message
		if(Runtime_Err_msg.equals(Exp_err_msg))
			System.out.println("Testpass, Expected error message displayed");
		else
			System.out.println("Testfail, Wrong error message displayed");
		
	}

}
