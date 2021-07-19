package capture_screen;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capture_Screen_At_Selected_Interface 
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();			
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
		
		WebElement Location=driver.findElement(By.linkText("Sign Up"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView()",Location);
		
		
		
		
		
		

	}

}
