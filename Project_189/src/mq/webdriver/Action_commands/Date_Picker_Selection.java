package mq.webdriver.Action_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Date_Picker_Selection 
{

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Datepicker.html");
		driver.manage().window().maximize();
		
		//Pick a date from calendar
		WebElement Datepicker1=driver.findElement(By.id("datepicker1"));
		Datepicker1.click();
		
		WebElement Next_Month_button=driver.findElement(By.xpath("//span[contains(.,'Next')]"));
		Next_Month_button.click();
		
		WebElement Selected_Date=driver.findElement(By.xpath("//a[contains(.,'22')]"));
		Selected_Date.click();
		
		
		
		//Select date from datepicker
		WebElement DatePicker2=driver.findElement(By.id("datepicker2"));
		DatePicker2.click();
		
		WebElement DP_Month=driver.findElement(By.xpath("//select[@title='Change the month']"));
		new Select(DP_Month).selectByVisibleText("October");
		
		WebElement DP_Year=driver.findElement(By.xpath("//select[contains(@title,'Change the year')]"));
		new Select(DP_Year).selectByVisibleText("2022");
		
		
		WebElement Required_Date=driver.findElement(By.xpath("//a[@href='javascript:void(0)'][contains(.,'18')]"));
		Required_Date.click();
		

	}

}
