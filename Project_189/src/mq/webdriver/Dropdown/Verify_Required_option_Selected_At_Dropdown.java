package mq.webdriver.Dropdown;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_Required_option_Selected_At_Dropdown {

	public static void main(String[] args) throws Exception 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		

		//Verify default option showing Current Month...
		String OptionName=new Select(driver.findElement(By.id("month"))).getFirstSelectedOption().getText();
		if(OptionName.equals("Jun"))
		{
			System.out.println("Testpass");
		}
		else
		{
			System.out.println("Testfail");
		}
		
	}

}
