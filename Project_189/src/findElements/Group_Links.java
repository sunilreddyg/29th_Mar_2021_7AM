package findElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Group_Links 
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "new_driver_path\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		Thread.sleep(3000);
		
		
		//identifying footer location and finding number of links available
		WebElement Main_Menu_Area=driver.findElement(By.id("mainMenuFirstLevelUnorderedList"));
		List<WebElement> Main_Menu_Links=Main_Menu_Area.findElements(By.className("firstLevelMenu"));
	
		System.out.println("Number links available is --> "+Main_Menu_Links.size());
		
		
		for (int i=0; i < Main_Menu_Links.size();i++) 
		{
			WebElement Eachlink=Main_Menu_Links.get(i);
			
			String linkname=Eachlink.getText();
			String linkhref=Eachlink.getAttribute("href");
			System.out.println(linkname+"    "+linkhref);
			
			Eachlink.click();   //If New page loaded list interface will be expired
			Thread.sleep(2000);
			
			//Restore all links to avlid stale element reference exception
			Main_Menu_Area=driver.findElement(By.id("mainMenuFirstLevelUnorderedList"));
			Main_Menu_Links=Main_Menu_Area.findElements(By.className("firstLevelMenu"));
		}
		
		
	}
	

}
