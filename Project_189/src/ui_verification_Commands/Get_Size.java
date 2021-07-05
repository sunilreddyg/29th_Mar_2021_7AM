package ui_verification_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Size {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		
		
		WebElement Firstname=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		int obj_height=Firstname.getSize().getHeight();
		int obj_width=Firstname.getSize().getWidth();
		
		
		System.out.println("Object height is ---> "+obj_height);
		System.out.println("Object width is ---> "+obj_width);
		
		
		/*
		 * Check Object visibility using getsize 
		 * 
		 * Note:--> Getsize can retrieve object height and width coordinates
		 * 			when object available at visible state only.
		 */
		if(obj_height > 0)
			System.out.println("object visible at webpage");
		else
			System.out.println("object invisible at webpage");

	}

}
