package mq.webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_Dropdown_Deselecting_Single_Option {

	public static void main(String[] args) throws Exception 
	{
		/*
		 * How to verify Deselction Count..
		 */
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://v1.hdfcbank.com/branch-atm-locator");
		driver.manage().window().maximize();
		
		
		/*
		 * JavascriptExecutor:--> It Execute Real javascript at your automation browser. 
		 * 						  Right now we are partially changing single selection
		 * 						  dropdown into multiple selection dropdown..
		 * 
		 * Note:--> Just for practice we are converting this feature, Don't try this...
		 * 
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
			Thread.sleep(2000);
			
				//Get Only Select Options at dropdown
				int Selection_Count=State_Dropdown.getAllSelectedOptions().size();
				//Nested if condition to verify selectioncount
				if(Selection_Count == 2)
				{
							//Deselect Single Options
							State_Dropdown.deselectByIndex(4);
							//Get Selected option after deselection
							int DCount=State_Dropdown.getAllSelectedOptions().size();
							
							if(DCount==1)
							{
								System.out.println("Deselected Single option successfully");
							}
							else
							{
								System.out.println("Deselection failed");
							}
				}
				else
				{
					System.out.println("Failed to select more than one option");
				}
			
		}
		else
		{
			System.out.println("Dropdown is not a multiple selection type");
		}
		

	}

}
