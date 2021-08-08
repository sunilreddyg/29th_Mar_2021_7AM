package pageobjects.without_pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase2_Calling_Resuable_Page_Methods {

	public static void main(String[] args) throws Exception 
	{
		
		/*
		 * Testcase:--> ORange HRM user login with valid credentials
		 * 
		 * 			1. OPen Chrome browser
		 * 			2. Enter url of the page
		 * 			3. Enter valid username
		 * 			4. Enter Invalid password
		 * 			5. Click Login Button
		 * 			6. Verify Error message displayed at webpage
		 */
		
		System.setProperty("webdriver.chrome.driver", "new_driver_path\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get(HRM_Login.Login_page_url);
		
		//Create object for HRM_Login Page
		HRM_Login login=new HRM_Login(driver);
		if(login.Verify_login_page_url())
		{
			System.out.println("Login page displayed");
			login.Account_login("Admin", "sunil123");
			Thread.sleep(5000);
			if(login.Verify_password_Err_Msg_Displayed())
				System.out.println("Testpass, Expected Error msg displayed");
			else
				System.out.println("Testfail, Expected Error msg not displayed");
		}
		else
		{
			System.out.println("Login page url is mismatch");
		}
		
		
		//Verify Account page and welcome Note displayed at webpage
		HRM_Account_page account_page=new HRM_Account_page(driver);
		if(account_page.verify_acccount_page_is_Displayed())
			System.out.println("Testpass, dashboard object displayed");
		else
			System.out.println("Testfail, Dashboard object not displayed");
		
		
		if(account_page.verify_username_Displayed_At_WelcomeNote("Welcome Paul"))
			System.out.println("Testpass, username displayed at welcome note");
		else
			System.out.println("Testfail, Username was not displayed at welcome note");
			

	}

}
