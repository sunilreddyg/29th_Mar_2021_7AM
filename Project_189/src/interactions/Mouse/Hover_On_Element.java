package interactions.Mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hover_On_Element {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		//This syntax enable mouse and keyboard interactions on automation page
		Actions action=new Actions(driver);
		
		
		//Performing hover action on selected location
		WebElement Main_Menu_JOBS=driver.findElement(By.xpath("//div[@class='mTxt'][contains(.,'Jobs')]"));
		action.moveToElement(Main_Menu_JOBS).perform();
		
		//Performing click method on selected location using action class
		WebElement Sub_menu_jobs_by_SKILLS=driver.findElement(By.xpath("//a[@data-ga-track='Main Navigation Jobs|Jobs by Skill']"));
		action.click(Sub_menu_jobs_by_SKILLS).perform();
		
		
		
		Thread.sleep(4000);
		driver.quit();  //This action will close all automation session windows
		
		
		
		
		
		
		
	}

}
