package mq.webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_Dropdown_Multiple_Selection_State {

	public static void main(String[] args) throws Exception 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://v1.hdfcbank.com/branch-atm-locator");
		driver.manage().window().maximize();
		
		
		
		boolean flag=new Select(driver.findElement(By.name("stateName"))).isMultiple();
		System.out.println("Dropdown multiple selection status is ---> "+flag);
		
		
		
		/*
		 * JavascriptExecutor:--> It Execute Real javascript at your automation browser. 
		 * 						  Right now we are partially changing single selection
		 * 						  dropdown into multiple selection dropdown..
		 */
		((JavascriptExecutor)driver).executeScript
		("document.getElementById('customState').setAttribute('multiple','multiple')");
		Thread.sleep(3000);
		
		
		boolean flag1=new Select(driver.findElement(By.name("stateName"))).isMultiple();
		System.out.println("Dropdown multiple selection status is ---> "+flag1);
		

	}

}
