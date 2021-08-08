package pageobjects.with_PageFactory.Runner;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pageobjects.with_PageFactory.Admin;
import pageobjects.without_pagefactory.HRM_Login;

public class Get_FIndBY_Elements_From_Different_Class {

	public static void main(String[] args) 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "new_driver_path\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.get(HRM_Login.Login_page_url);
		
		HRM_Login login=new HRM_Login(driver);
		login.Account_login("Admin", "admin123");
		
		
		/*
		 * inorder to get @findby annotated element from differnet class
		 * we should access through pagefactory class only..
		 */
		 Admin admin_page=PageFactory.initElements(driver, Admin.class);
		 admin_page.Admin_Menu_Tab.click();
		 
		 admin_page.Username.sendKeys("Dominic");
		 new Select(admin_page.UserRole_DD).selectByVisibleText("ESS");
		 admin_page.EmployeeName.sendKeys("David Hawking Morris",Keys.ENTER);
		 new Select(admin_page.Status_DD).selectByIndex(1);
		 admin_page.Search_button.click();
		
		
		
		
		
		

	}

}
