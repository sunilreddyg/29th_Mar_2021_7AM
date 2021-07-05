package ui_verification_Commands;

import java.awt.Dimension;
import java.awt.Toolkit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_location 
{

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		
		
		WebElement Roundtrip_Radio_btn=driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']"));
		
		//Read x and y coordinates of object
		int Objx=Roundtrip_Radio_btn.getLocation().getX();
		int Objy=Roundtrip_Radio_btn.getLocation().getY();
		
		System.out.println("Object x coordinates are --->"+Objx);
		System.out.println("Object y coordinates are --->"+Objy);
		
		
		
		/*
		 * Check Object visibility using Getlocation
		 * Note:--> Getlocation can retrieve object x and y coordinates
		 * 			when object available at visible state only.
		 */
		if(Objx > 0)
			System.out.println("Object visible at webpage");
		else 
			System.out.println("Object not visible at webpage");
		
		
		
		
		
		
		/*
		 * Note:--> Inorder to find system screen dimension we can foolow 
		 * 			below syntax
		 */
		
		//Import dimensions from awt package
		Dimension ScreenSize=Toolkit.getDefaultToolkit().getScreenSize();
		
		//Get Screen Width
		Double Screen_width=ScreenSize.getWidth();
		Double Screen_height=ScreenSize.getHeight();
		
		//Convert double value into integer format
		int S_height=Screen_height.intValue();
		int S_width=Screen_width.intValue();
		System.out.println(S_height+"      "+S_width);
		
		
		int Half_screen=S_height/2;
		System.out.println(Half_screen);
		if(Objy < Half_screen)
			System.out.println("Object available at top position");
		else
			System.out.println("Object available at bottom position");
		
		

	}

}
