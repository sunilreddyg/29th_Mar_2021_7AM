package chrome_options;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Firefox_Options {

	public static void main(String[] args) 
	{
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setJavascriptEnabled(true);
		capabilities.setPlatform(Platform.WIN10);
		
		FirefoxOptions options = new FirefoxOptions();
		options.setHeadless(true);
		capabilities.merge(options);
		
		System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver(options);
		System.out.println("Browser launched");
		
		driver.get("http://google.com");
		System.out.println("page loaded");

	}

}
