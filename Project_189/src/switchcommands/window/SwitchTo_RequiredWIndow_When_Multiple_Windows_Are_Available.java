package switchcommands.window;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_RequiredWIndow_When_Multiple_Windows_Are_Available {

	public static void main(String[] args) 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		driver.manage().window().maximize();
		
		
		//Hyper link opens at new window
		driver.findElement(By.xpath("//a[@href='http://www.cleartrip.com/trains/pnr']")).click();
		
		
		//Hyper link opens at new window
		driver.findElement(By.xpath("//a[@href='http://www.cleartrip.com/trains/calendar']")).click();
		
		//Hyper link opens at new window
		driver.findElement(By.xpath("//a[contains(@href,'cancellation.shtml#cancel')]")).click();
		
		//Hyper link opens at new window
		driver.findElement(By.xpath("//a[@href='http://www.cleartrip.com/offers/india/irctc-packages']")).click();
		
		
		//Get All Dynamic window ID's
		Set<String> allwindow_ids=driver.getWindowHandles();
		
		//Applying foreach loop to iterate for number of windows
		for (String EachWindowID : allwindow_ids) 
		{
			driver.switchTo().window(EachWindowID);
			
			//Get Current URL
			String Runtime_title=driver.getTitle();
			
			
			if(Runtime_title.contains("Indian Railway Seat Availability"))
			{
				break;  //It break iteration when condition match
			}
			
		}
		
		
		
		
		System.out.println("Current Focused window title is --->"+driver.getTitle());
		
		
		

	}

}
