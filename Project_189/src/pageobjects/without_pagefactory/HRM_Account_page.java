package pageobjects.without_pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HRM_Account_page 
{
	WebDriver driver;

	public HRM_Account_page(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	
	public static By DashBoard_header_location=By.xpath("//h1[contains(.,'Dashboard')]");
	public static By WelCome_User_location=By.xpath("//a[contains(@id,'welcome')]");
	
	
	public boolean verify_acccount_page_is_Displayed()
	{
		boolean flag=driver.findElement(DashBoard_header_location).isDisplayed();
		return flag;
	}
	
	public boolean verify_username_Displayed_At_WelcomeNote(String username)
	{
		String username_text=driver.findElement(WelCome_User_location).getText();
		boolean flag=username_text.equals(username);
		return flag;
	}
	

}
