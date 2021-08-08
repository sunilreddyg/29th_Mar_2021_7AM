package pageobjects.with_PageFactory.Runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageobjects.with_PageFactory.PIM;
import pageobjects.without_pagefactory.HRM_Login;

public class Running_PIM_Class {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "new_driver_path\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.get(HRM_Login.Login_page_url);
		
		HRM_Login login=new HRM_Login(driver);
		login.Account_login("Admin", "admin123");
		
		
		PIM pim=new PIM(driver);
		pim.PIM_menu_Tab.click();
		
		pim.PIM_Search("Lisa", "0208", "Full-Time Probation");
		
		

	}

}
