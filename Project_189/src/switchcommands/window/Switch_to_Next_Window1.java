package switchcommands.window;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch_to_Next_Window1 
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		
		String MainWindowID=driver.getWindowHandle();
		System.out.println(MainWindowID);
		
		WebElement Instagram_link=driver.findElement(By.linkText("Instagram"));
		Instagram_link.click();   //This action bring new window
		
		//This syntax capture every window ID into Set<String> 
		Set<String> All_Win_IDs=driver.getWindowHandles();
		
		//This Syntax convert a group string into independent tokens
		Iterator<String> itr=All_Win_IDs.iterator();
		
		//Iterator class allow to read each token with next keyword
		String WIN1=itr.next();
		String WIN2=itr.next();
		
		
		driver.switchTo().window(WIN2);
		System.out.println("Current window title is --->"+driver.getTitle());
		
		
		
		/*
		 * => Set is a unorder collection of objects
		 * -> It doesn't accept duplicate values
		 * 
		 * Note:--> IF more windows open set order changes
		 */
		
		
		
	}

}
