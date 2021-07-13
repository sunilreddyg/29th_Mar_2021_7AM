package switchcommands.window;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Window_With_Target_Property 
{

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://bridgeqsystems.com/demo.php");
		driver.manage().window().maximize();
		
		//Click Windows page link
		driver.findElement(By.xpath("//a[@href='#v-pills-messages']")).click();
		Thread.sleep(2000);
		
		
		//Click Browser windows link
		driver.findElement(By.xpath("//button[contains(.,'Browser Windows')]")).click();
		Thread.sleep(2000);
		
		
		//Click External link to open a page at new window
		driver.findElement(By.xpath("//a[@href='#'][contains(.,'New Tab One')]")).click();
		Thread.sleep(2000);
		
		driver.switchTo().window("_new");
		System.out.println("Current window title is ---> "+driver.getTitle());
		

	}

}
