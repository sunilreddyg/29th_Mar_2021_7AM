package chrome_options;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headless_Chrome_Browser 
{

	public static void main(String[] args) 
	{
		
		ChromeOptions options=new ChromeOptions();
		options.setHeadless(true);
		
		//Second method to set headless argument
		//options.addArguments("--headless");
		
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		System.out.println("browser launched");
		
		driver.get("http://facebook.com");
		System.out.println("url typed");
		
		driver.findElement(By.id("email")).sendKeys("NEwuser");
		System.out.println("email typed");
		

	}

}
