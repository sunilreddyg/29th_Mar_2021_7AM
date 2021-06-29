package ui_verification_Commands.gettext;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Text_Visible_At_WebPage {

	public static void main(String[] args) throws Exception {
		
		/*
		 * Scenario:-->
		 * 			Verify login with invalid email
		 * 	
		 * 			Given site url http://outlook.com
		 * 			And click signin button
		 * 			When user Enter invalid email "info3efdf@gmail.com"
		 * 			And click Next button
		 * 			Then verify Error message displayed at webpage
		 */
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://outlook.com");
		driver.manage().window().maximize();
		
		
		
		WebElement element=driver.findElement(By.xpath("(//a[contains(.,'Sign in')])[1]"));
		element.click();
		
		WebElement Email=driver.findElement(By.xpath("//input[@id='i0116']"));
		Email.clear();
		Email.sendKeys("info3efdf@gmail.com"+Keys.ENTER);
		Thread.sleep(4000);
		
		//Identifying total webpage
		WebElement Page=driver.findElement(By.tagName("body"));
		System.out.println(Page.getText());
		
		String Exp_Errmsg="That Microsoft account doesn't exist. Enter a different account or get a new one.";
		
		if(Page.getText().contains(Exp_Errmsg))
			System.out.println("Testpass, Expected text visible at webpage");
		else
			System.out.println("Tetfail, Expected text not visible at webpage");
	}

}
