package switchcommands.Active_Element;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_ActiveElement {

	public static void main(String[] args) throws Exception 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://outlook.live.com/owa/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//a[contains(.,'Sign in')])[1]")).click();
		Thread.sleep(2000);
		
		
		driver.switchTo().activeElement().sendKeys("sunilreddy.gajjala@gmail.com"+Keys.ENTER);
		
		
		
		Thread.sleep(5000);
		
		
		driver.get("http://demo.automationtesting.in/Register.html");
	
		driver.findElement(By.xpath("//span[@aria-labelledby='select2-country-container']")).click();
		Thread.sleep(2000);
		
		driver.switchTo().activeElement().sendKeys("India");
		Thread.sleep(2000);
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
		
		

	}

}
