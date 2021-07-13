package switchcommands.window;

import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Window_Reusable_Method 
{
	
	static WebDriver driver;
	
	
	static void switch_to_window(String window_title)
	{
		//Get All Dynamic window ID's
		Set<String> allwindow_ids=driver.getWindowHandles();
		
		//Applying foreach loop to iterate for number of windows
		for (String EachWindowID : allwindow_ids) 
		{
			driver.switchTo().window(EachWindowID);
			
			//Get Current URL
			String Runtime_title=driver.getTitle();
			
			
			if(Runtime_title.contains(window_title))
			{
				break;  //It break iteration when condition match
			}
			
		}
	}
	
	

	public static void main(String[] args) 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.naukri.com");
		driver.manage().window().maximize();
		
		
		System.out.println(driver.getWindowHandles().size());
		
		switch_to_window("Tech Mahindra");
		System.out.println("title is ---> "+driver.getTitle());
		
		
		switch_to_window("Jobs - Recruitment");
		System.out.println("title is ----> "+driver.getTitle());
	

	}

}
