package switchcommands.Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Switch_BetWeen_Frames {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://epass.apcfss.in/");
		driver.manage().window().maximize();
		
		
		driver.switchTo().frame(6);
		
		
		WebElement Officer_Details=driver.findElement(By.xpath("//a[contains(@href,'colleges.do')]"));
		Officer_Details.click();
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(5);
		
		
		WebElement Academic_Year=driver.findElement(By.xpath("//select[@id='acyearid']"));
		new Select(Academic_Year).selectByIndex(3);
		
		
		
		
		
		
	}

}
