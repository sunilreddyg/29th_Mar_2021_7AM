package mq.webdriver;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebDriver_interface_EdgeBrowser {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\SUNIL\\Desktop\\drivers\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		
		//WEbDriver Script Converted from IDE
		
		driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    driver.findElement(By.id("email")).sendKeys("darshan@gmail.com");
	    driver.findElement(By.id("pass")).sendKeys("Hello12345");
	    driver.findElement(By.name("login")).click();

	}

}
