package ui_validation_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Runtime_Behaviour_Object_Disabled {

	public static void main(String[] args) 
	{
		/*
		 * 	Testcase:-->
		 *
		 *	Given site url is "https://v1.hdfcbank.com/branch-atm-locator"
		 * 	Verify Locality editbox disabled before select state and city dropdown
		 */
		
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://v1.hdfcbank.com/branch-atm-locator");
		driver.manage().window().maximize();
		
		
		WebElement Locality_Editbox=driver.findElement(By.xpath("//input[@id='customLocality']"));
		
		
		if(!Locality_Editbox.isEnabled())		//!--NOT
		{
			System.out.println("Testpass, As expected locality editbox is disabled");
		}
		else
		{
			System.out.println("Testfail, Locality editbox is enabled");
		}
		
		
		/*
		 * Note:--> IN Selenium webdriver we don't have direct method to validate disabled
		 * 			functionality. So that we can use enabled method to validate disabled
		 * 			behaviour by just adding  [!] Validation.
		 */
		

	}

}
