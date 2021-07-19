package capture_screen;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screen_With_TimeStampt {

	public static void main(String[] args) throws IOException
	{
		
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();			
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
		
		
		Date d=new Date();       //import from java.util
		//Create simple date format
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MMM-dd hh-mm-ss");
		//Convert current system date using simpledateformat
		String time=sdf.format(d);
		
		//Capture screen
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.createDir(new File("screens"));
		FileHandler.copy(src, new File("screens\\image"+time+".png"));
		
		
	
		
		
		

	}

}
