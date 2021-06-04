package mq.webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Option_Count 
{

	public static void main(String[] args) 
	{
		
		/*
		 * Step1:--> launch Cleartrip website
		 * Step2:--> Select Adults dropdown maximum option as 9
		 * Step3:--> Verify Children option should show zero options
		 * Step4:--> Infants should show number of options same as Adults
		 */
		

		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		
		
		Select Adults_Selector=new Select(driver.findElement(By.xpath("(//select[contains(@class,'bc-neutral-100 bg-transparent')])[1]")));
		Adults_Selector.selectByVisibleText("9");
		
	
		Select Children_Selector=new Select(driver.findElement(By.xpath("(//select[contains(@class,'bc-neutral-100 bg-transparent')])[2]")));
		int Count=Children_Selector.getOptions().size();
		System.out.println("Children count is ---> "+Count);
		
		
		if(Count > 1)
		{
			System.out.println("Testfail");
		}
		else
		{
			System.out.println("Testpass");
		}

	}

}
