package ui_verification_Commands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Verify_Element_Presented_At_Source {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
		//Get Entire page source
		String PageSource=driver.getPageSource();
		
		
		//Verify Object ID property available at page source
		if(PageSource.contains("email"))
		{
			System.out.println("Email object available at pagesource");
			WebElement Email=driver.findElement(By.id("email"));
			Email.clear();
			Email.sendKeys("darshan@gmail.com");
		}
		else
		{
			System.out.println("Email object not available at pagesoruce");
		}
		
		
		
		/*
		 * Where getpagesource is usefull:-->
		 * 
		 * 			=> It is helpfull to prevent unnecessary actions 
		 * 				when element is not available at source..
		 */
		
		
		
		
		/*
		 * SecondMethod:-->
		 * 			How to Prevent performing action when element is not presented
		 * 			at source.
		 * 
		 * 			Note:--> FindElement is a method designed to identify object
		 * 					 at webpage incase object not presented at source 
		 * 					 this method throws exception "NoSuchElementException"
		 */
		
		
		
		try {
			
			WebElement Password=driver.findElement(By.xpath("//div[@id='passContainer']"));
			System.out.println("Object is Identified");
		
			Password.clear();
			Password.sendKeys("Hello12345");
			
			
		} catch (Exception e) 
		{
			System.out.println("Exception presented element is not availabel at source");
		} 
		
		
		
		System.out.println("Run Continued");
		
		

		
		
		
		
		
		
		
		
		
		
		

	}

}
