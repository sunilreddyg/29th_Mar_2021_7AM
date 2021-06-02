package mq.webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Selection_Commands {

	public static void main(String[] args) throws Exception 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://v1.hdfcbank.com/branch-atm-locator");
		driver.manage().window().maximize();
		
		
		//Selecting dropdown with option name property [Optin name is case-sensitive]
		new Select(driver.findElement(By.id("customState")))
		.selectByVisibleText("Telangana");
		System.out.println("Dropdown option selected with visible option name..");
		
		
		Thread.sleep(4000);   //This timegap is to load cities
		
		//Selecting dropdown with Option value property
		new Select(driver.findElement(By.id("customCity")))
		.selectByValue("hyderabad");
		System.out.println("Hyd option selected ");
		
		
		//Typing text into editbox
		driver.findElement(By.id("customLocality")).clear();
		driver.findElement(By.id("customLocality")).sendKeys("Gandhi Nagar");
		
		
		
		//Selecting a dropdown option with index number
		new Select(driver.findElement(By.id("customRadius")))
		.selectByIndex(4);
		
		
		
		/*
		 * Dropdown options also select with Click Method..
		 */
		
		
		
		
		
		
		//Checkbox selection [In Webdriver checkboxes selected with click method]
		driver.findElement(By.id("amenity_category_order_types50")).click();
		
		
		/*
		 * Note:--> for checkbox selection.
		 * 		
		 * 		For only checkboxes selection and deselection we follow same
		 * 		methdo "Click"..
		 */
		

	}

}
