package interactions.KeyBoard;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyUp_and_Keydown 
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		
		
		//Identify frame and switch to it
		WebElement Demo_frame=driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(Demo_frame);
		
		
		//Press and hold control key
		new Actions(driver).keyDown(Keys.CONTROL).perform();
	
		
		driver.findElement(By.xpath("//li[contains(.,'Item 1')]")).click();
		driver.findElement(By.xpath("//li[contains(.,'Item 3')]")).click();
		driver.findElement(By.xpath("//li[contains(.,'Item 5')]")).click();
		driver.findElement(By.xpath("//li[contains(.,'Item 7')]")).click();
		
		
		//Release control key
		new Actions(driver).keyUp(Keys.CONTROL).perform();
		
		
		

	}

}
