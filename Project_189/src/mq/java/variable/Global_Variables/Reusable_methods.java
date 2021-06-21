package mq.java.variable.Global_Variables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Reusable_methods 
{
	String driver_path;
	WebDriver driver;
	String url;
	String username;
	String password;
	
	public void Launch_Browser()
	{
		System.setProperty("webdriver.chrome.driver", driver_path+"chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	public void Enter_site_url()
	{
		driver.get(url);
	}
	
	public void User_login()
	{
		driver.findElement(By.xpath("//input[@id='email']")).clear();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
		
		driver.findElement(By.xpath("//input[@id='pass']")).clear();
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);
	}
	
	
	

}
