package ui_validation_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runtime_Validation_Is_Displayed {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		
		
		WebElement Roundtrip_Rbtn=driver.findElement(By.xpath("(//span[@class='radio__circle bs-border bc-neutral-500 bw-1 ba'])[2]"));
		Roundtrip_Rbtn.click();
		
		WebElement Return_Date=driver.findElement(By.xpath("(//div[@class='fs-2 c-inherit flex flex-nowrap'])[5]"));
		
		if(Return_Date.isDisplayed())
		{
			System.out.println("As expected return date visible at webpage");
		}
		else
		{
			System.out.println("Testfail, Return date object not visible at webpage");
		}
		
	}

}
