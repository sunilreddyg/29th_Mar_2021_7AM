package waitcommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait_Command {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "new_driver_path\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		System.out.println("browser is up and ready to use");
		
		
		
		long start_time=System.currentTimeMillis();
		
		try {
			
			driver.findElement(By.id("email"));
			System.out.println("object identified in --> "+(System.currentTimeMillis()-start_time));
			
		} catch (Exception e) {
			System.out.println("Elapsed time is "+(System.currentTimeMillis()-start_time));
		}
		
		
		/*
		 * Note:-->
		 * 			We can avoid nosuchelement exception using implicit wait..
		 */
		
		

	}

}
