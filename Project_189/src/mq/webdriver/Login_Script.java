package mq.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Script {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();		//Open Browser
		driver.get("http://facebook.com");			//Load webapge
		driver.manage().window().maximize();		//Maximize browser window
		
		
		
		driver.findElement(By.id("email")).sendKeys("darshan@gmail.com");
		System.out.println("Typing email completed");
		
		driver.findElement(By.id("pass")).sendKeys("Hello1234");
		System.out.println("Typing password completed");
		
		driver.findElement(By.name("login")).click();
		System.out.println("Login button clicked");
		
		
		
	}

}
