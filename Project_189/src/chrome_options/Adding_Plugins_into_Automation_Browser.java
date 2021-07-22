package chrome_options;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Adding_Plugins_into_Automation_Browser 
{

	public static void main(String[] args) 
	{
		
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("start-maximized");
		options.addExtensions(new File("C:\\Users\\SUNIL\\Downloads\\SeleniumIDE.crx"));
		options.addExtensions(new File("C:\\Users\\SUNIL\\Downloads\\Truepath.crx"));
		options.addExtensions(new File("E:\\12_july_IDE_Projects\\Katalon_studio.crx"));
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		driver.get("http://google.com");
		
		
		/*
		 * How to downlaod chrome plugins.
		 * 		=> Chrome plugins contain crx extension
		 * 		=> https://www.crx4chrome.com/crx/62796/
		 * 		=> click link at Download crx file from Crx4Chrome >
		 * 		=> It will downlaod crx file
		 * 		=> Rename file and add extension using filepath..
		 */

	}

}
