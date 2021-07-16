package interactions.Mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Context_Click 
{

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		
		//Performing right click action on selected Location
		WebElement Button_Right_click_me=driver.findElement(By.xpath("//span[contains(.,'right click me')]"));
		new Actions(driver).contextClick(Button_Right_click_me).perform();
		
		
		WebElement Delete_btn=driver.findElement(By.xpath("//span[contains(.,'Delete')]"));
		Delete_btn.click();
		
		
		//Accept alert window
		driver.switchTo().alert().accept();
		
		
	}

}
