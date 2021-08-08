package pageobjects.without_pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HRM_Login 
{
	
	WebDriver driver;
	
	public HRM_Login(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	
	public static String Login_page_url="https://opensource-demo.orangehrmlive.com/";
	public static String password_err_msg="Invalid credentials";
	
	public static By Username=By.xpath("//input[@id='txtUsername']");
	public static By Password=By.xpath("//input[@id='txtPassword']");
	public static By Login_button=By.xpath("//input[@id='btnLogin']");
	public static By Forgot_password_link=By.xpath("//a[@href='/index.php/auth/requestPasswordResetCode']");
	public static By Password_Error=By.xpath("//span[contains(@id,'spanMessage')]");
	
	
	public boolean Verify_login_page_url()
	{
		String Act_url=driver.getCurrentUrl();
		boolean flag=Act_url.contains(Login_page_url);
		
		return flag;
	}
	
	
	public void Account_login(String UID,String PWD)
	{
		driver.findElement(Username).sendKeys(UID);
		driver.findElement(Password).sendKeys(PWD);
		driver.findElement(Login_button).click();
	}
	
	public boolean Verify_password_Err_Msg_Displayed()
	{
		String Err_msg=driver.findElement(Password_Error).getText();
		boolean flag=Err_msg.contains(password_err_msg);
		return flag;
	}
	
	

}
