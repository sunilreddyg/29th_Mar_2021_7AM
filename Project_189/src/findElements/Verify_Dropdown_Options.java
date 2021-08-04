package findElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Dropdown_Options {

	public static void main(String[] args) throws Exception 
	{
	
		/*
		 * Example:--> verify expected cities displayed
		 * 	w.r.t state selection.
		 */
		System.setProperty("webdriver.chrome.driver", "new_driver_path\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://v1.hdfcbank.com/branch-atm-locator");
		driver.manage().window().maximize();
		
		
		
		String Exp_cities[]= 
			{
				"South Andaman",	
				"South Andaman",
				"Anantapur",
				"East Siang",
				"Darrang",
				"Banka",
				"Chandigarh",
				"Durg",
				"Dadra",
				"Dadra",
				"Daman",
				"New Delhi",
				"South Goa"
			};
		
		System.out.println("Second index value is -> "+Exp_cities[2]);
		
		
		
		WebElement State_Dropdown=driver.findElement(By.id("customState"));
		
		//Under dropdown finding list of option elements
		List<WebElement> All_State_Options=State_Dropdown.findElements(By.tagName("option"));
		
		//Iterate for number of options
		for (int i = 1; i < 13; i++) 
		{
			
			WebElement SIngle_option=All_State_Options.get(i);
			String StateName=SIngle_option.getText();
			SIngle_option.click();
			Thread.sleep(4000);
			
			
			WebElement City_Dropdown=driver.findElement(By.id("customCity"));
			//Read All options from city dropdown
			String City_OPtions=City_Dropdown.getText();
		
			if(City_OPtions.contains(Exp_cities[i]))
			{
				System.out.println("City Displayed According to state --> ");
				System.out.println(StateName+"                  "+Exp_cities[i]);
				System.out.println("\n");
			}
			else
			{
				System.out.println("City not Displayed According to state --> ");
				System.out.println(StateName+"                  "+Exp_cities[i]);
				System.out.println("\n");
			}
			
			
			
		}
		
		
		

	}

}
