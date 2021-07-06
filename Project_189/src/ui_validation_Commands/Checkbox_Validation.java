package ui_validation_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox_Validation {

	public static void main(String[] args) 
	{
		/*
		 * TestSteps:-->
		 * 	1.  Enter site url https://login.yahoo.com/
		 * 	2.  Uncheck stay signed in chekcbox 
		 * 	  
		 */
		
		
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://v1.hdfcbank.com/branch-atm-locator");
		driver.manage().window().maximize();
		
		
		WebElement Stay_Signed_in=driver.findElement(By.id("persistent"));
		if(Stay_Signed_in.isSelected())
		{
			Stay_Signed_in.click();  //This command uncheck when it was only selected
		}
		
	}

}
