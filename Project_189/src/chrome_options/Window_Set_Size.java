package chrome_options;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Window_Set_Size {

	public static void main(String[] args) throws Exception {
	
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("window-size=600,400");
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		driver.get("http://outlook.com");
		
		

		Thread.sleep(5000);
		driver.manage().window().setSize(new Dimension(1020, 200));
		
		

	}

}
