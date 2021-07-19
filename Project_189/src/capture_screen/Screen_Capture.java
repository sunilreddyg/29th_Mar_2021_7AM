package capture_screen;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screen_Capture {

	public static void main(String[] args) throws IOException 
	{
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();			
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
		
		
	
		
		//Capturing screen and converted scree into file format
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//This Syntax crate new folder under your project
		FileHandler.createDir(new File("screens"));
		
		//This syntax helps to dump file into local utilities
		FileHandler.copy(src, new File("screens\\image.png"));
		
		
		/*
		 * Disadvantages of capture screen?..
		 * 
		 * 		1. It capture only visible interface at webpage
		 * 				Solution:--> In Selenium 4 same syntax capture
		 * 							  entire screen
		 * 
		 * 		2. It override image when user rerun test
		 * 				Solution:--> Attach timestamp to imagename
		 * 
		 * 		3. Can't capture screenshot when alert presented
		 * 				Solution:--> Use Robot class to capture alert
		 * 							 when alert presented
		 */
		
		
		

	}

}
