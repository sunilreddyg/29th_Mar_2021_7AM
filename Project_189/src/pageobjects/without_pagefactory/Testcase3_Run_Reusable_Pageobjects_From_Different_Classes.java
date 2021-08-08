package pageobjects.without_pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase3_Run_Reusable_Pageobjects_From_Different_Classes {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "new_driver_path\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get(HRM_Login.Login_page_url);
		
		HRM_Login login=new HRM_Login(driver);
		login.Account_login("Admin", "admin123");
		
		HRM_Account_page account_page=new HRM_Account_page(driver);
		boolean flag=account_page.verify_acccount_page_is_Displayed();
		System.out.println("Account Page displayed status is ----> "+flag);
		
		
		

	}

}
