package findElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElement_Reference_Exception {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "new_driver_path\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		//Page reference object stored into Username reference
		WebElement Username=driver.findElement(By.xpath("//input[@id='txtUsername']"));
		Username.sendKeys("Admin");
		
		Thread.sleep(2000);
		driver.navigate().refresh();   
		/*
		 * When page get refreshed or navigated to some other page it will expired
		 * previously stored references and it lead to staleElement reference exception
		 */
		
		//It works beacuse we identify object using page refernce once again
		driver.findElement(By.id("txtUsername")).clear();
		driver.findElement(By.id("txtUsername")).sendKeys("Pranil");
		Thread.sleep(3000);
		
				
		//This does't work we are using expired variable
		Username.clear();
		Username.sendKeys("Sunil");
		

	}

}
