package mq.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IDentify_Page_Objects {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();		//Open Browser
		driver.get("http://facebook.com");			//Load webapge
		driver.manage().window().maximize();		//Maximize browser window
		
		
		
		driver.findElement(By.id("email"));
		System.out.println("email object identified with id property");
		
		
		driver.findElement(By.name("email"));
		System.out.println("email object idenfied with name property");
		
		
		
		driver.findElement(By.id("pass"));
		System.out.println("Password identified with id property");
		
		
		driver.findElement(By.name("login"));
		System.out.println("Signin button object identified");
		
		
		/*
		 * FindElement is a method it throws exception when requried 
		 * object not found at htmlsource and interrupt test run..
		 * 
		 * 	Exception:-->    NoSuchElementException
		 */
		
		

	}

}
