package mq.webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Multiple_Option_In_Single_Dropdown {

	public static void main(String[] args) throws Exception 
	{
		
		/*
		 * 1. Visit site https://v1.hdfcbank.com/branch-atm-locator
		 * 2. Make sure State dropdown is multiple selection type
		 * 3. Select Multiple options under State Dropdown.
		 */
		
		
		
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://v1.hdfcbank.com/branch-atm-locator");
		driver.manage().window().maximize();
		
		
		
		/*
		 * JavascriptExecutor:--> It Execute Real javascript at your automation browser. 
		 * 						  Right now we are partially changing single selection
		 * 						  dropdown into multiple selection dropdown..
		 */
		((JavascriptExecutor)driver).executeScript
		("document.getElementById('customState').setAttribute('multiple','multiple')");
		Thread.sleep(3000);
		
		
		//This command verify drodpown multiple selection status and return boolean true/false.
		boolean flag=new Select(driver.findElement(By.name("stateName"))).isMultiple();
		System.out.println("Dropdown multiple selection status is ---> "+flag);
		
		
		
		//Writing conditional statement IF-ELSE
		if(flag==true)
		{
			Select State_Dropdown=new Select(driver.findElement(By.id("customState")));
			State_Dropdown.deselectAll();   
			State_Dropdown.selectByIndex(2);
			State_Dropdown.selectByIndex(4);
			State_Dropdown.selectByIndex(6);
		}
		else
		{
			System.out.println("Dropdown is not a multiple selection type");
		}
		
		
		
		
		
		

	}

}
