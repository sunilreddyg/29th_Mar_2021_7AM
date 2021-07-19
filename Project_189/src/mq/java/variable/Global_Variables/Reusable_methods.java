package mq.java.variable.Global_Variables;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

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
	
	
	public void Capture_Screen()
	{
		Date d=new Date();       //import from java.util
		//Create simple date format
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MMM-dd hh-mm-ss");
		//Convert current system date using simpledateformat
		String time=sdf.format(d);
		
		//Capture screen
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		try {
			FileHandler.createDir(new File("screens"));
			FileHandler.copy(src, new File("screens\\image"+time+".png"));
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	
	

}
