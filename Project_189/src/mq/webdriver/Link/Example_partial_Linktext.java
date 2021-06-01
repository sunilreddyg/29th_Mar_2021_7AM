package mq.webdriver.Link;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_partial_Linktext {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();						//Open Browser
		driver.get("https://www.icicidirect.com/equity");			//Load webapge
		driver.manage().window().maximize();						//Maximize browser window
		driver.manage().deleteAllCookies();
		
		
		/*
		 * When to use partialLinktext:-->
		 * 		Whenever required identification with partial name of link. Instead
		 * 		of using complete name 
		 */
		driver.findElement(By.partialLinkText("Knowledge Cent")).click();
		
		
		
		

	}

}
