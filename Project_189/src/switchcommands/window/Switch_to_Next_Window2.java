package switchcommands.window;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch_to_Next_Window2 
{

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		String MainWindowID=driver.getWindowHandle();
		System.out.println(MainWindowID);
		
		WebElement Instagram_link=driver.findElement(By.linkText("Instagram"));
		Instagram_link.click();   //This action bring new window
		
		
		//Get All Window ID's
		Set<String> All_windIDs=driver.getWindowHandles();
		
		/*
		 * this loop iterate for number of windows
		 * and bring focus on last window
		 */
		for (String Each_WinID : All_windIDs)
		{
			driver.switchTo().window(Each_WinID);
		}
		
		
		System.out.println("Current focused window title is ---> "+driver.getTitle());
		
		Thread.sleep(5000); //Timeout to load new window page
		//Type Mobile number in instagram page
		WebElement MobileNumber=driver.findElement(By.xpath("//input[@name='username']"));
		MobileNumber.clear();
		MobileNumber.sendKeys("9030248855");
		
		

	}

}
