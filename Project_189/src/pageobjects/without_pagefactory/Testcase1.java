package pageobjects.without_pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase1 
{

	public static void main(String[] args) 
	{
		
		/*
		 * Testcase:--> ORange HRM user login with valid credentials
		 * 
		 * 			1. OPen Chrome browser
		 * 			2. Enter url of the page
		 * 			3. Enter valid username
		 * 			4. Enter valid password
		 * 			5. Click Login Button
		 * 			6. Validate Account is login successfull
		 */
		
		System.setProperty("webdriver.chrome.driver", "new_driver_path\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get(HRM_Login.Login_page_url);
		driver.findElement(HRM_Login.Username).sendKeys("Admin");
		driver.findElement(HRM_Login.Password).sendKeys("admin123");
		driver.findElement(HRM_Login.Login_button).click();
		
		
		

	}

}
