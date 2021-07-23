package waitcommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_timeouts {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "new_driver_path\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.manage().timeouts()
		.implicitlyWait(100, TimeUnit.SECONDS)
		.pageLoadTimeout(100, TimeUnit.SECONDS)
		.setScriptTimeout(100, TimeUnit.SECONDS);
		
		
		
		driver.get("http://facebook.com");
		driver.manage().window().maximize();

	}

}
