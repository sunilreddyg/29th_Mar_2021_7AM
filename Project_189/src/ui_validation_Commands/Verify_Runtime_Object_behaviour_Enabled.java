package ui_validation_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_Runtime_Object_behaviour_Enabled {

	public static void main(String[] args)
	{
		
		
		/*
		 * 	TestCase:-->
		 *	Given site url is "https://v1.hdfcbank.com/branch-atm-locator"
		 *	Verify Locality editbox enabled after state and city selection.
		 */
		
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://v1.hdfcbank.com/branch-atm-locator");
		driver.manage().window().maximize();
		
		
		//State selection
		WebElement State_Dropdown=driver.findElement(By.xpath("//select[@id='customState']"));
		new Select(State_Dropdown).selectByVisibleText("Telangana");
		
		//City Selection
		WebElement City_Dropdown=driver.findElement(By.xpath("//select[@id='customCity']"));
		new Select(City_Dropdown).selectByVisibleText("Hyderabad");
		
		
		WebElement Locality_Editbox=driver.findElement(By.xpath("//input[@id='customLocality']"));
		
		
		if(Locality_Editbox.isEnabled())
		{
			System.out.println("Testpass, As expected locality editbox is enabeld");
		}
		else
		{
			System.out.println("Testfail, As expected locality editbox is disabled");
		}
		
		
		
		
		

	}

}
