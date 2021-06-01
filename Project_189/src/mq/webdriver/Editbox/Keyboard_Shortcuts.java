package mq.webdriver.Editbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keyboard_Shortcuts {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();					//Open Browser
		driver.get("https://www.facebook.com/r.php");			//Load webapge
		driver.manage().window().maximize();					//Maximize browser window
		
		
		driver.findElement(By.name("firstname"))
		.sendKeys("Aakash"+Keys.TAB+"Kumar"+Keys.TAB+"9030248855");
		
		
		//Select Dropdown options using keyboard shortcut
		driver.findElement(By.id("month")).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN);
	}

}
