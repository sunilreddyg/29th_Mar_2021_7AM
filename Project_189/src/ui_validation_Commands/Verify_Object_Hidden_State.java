package ui_validation_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Object_Hidden_State 
{

	public static void main(String[] args) throws Exception 
	{
		
		
		
		/*
		 * Testcase:-->
		 *		Verify Return date calendar Hidden status
		 *
		 * 		Given site url is "http://Cleartrip.com"
		 *		When Select oneway Radio button
		 *		Then verify Returun date calendar goes to hidden state.
		 */
		
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		
		
		WebElement oneway_Radio_btn=driver.findElement(By.xpath("(//span[@class='radio__circle bs-border bc-neutral-500 bw-1 ba'])[1]"));
		oneway_Radio_btn.click();
		Thread.sleep(2000);
		
		
		
		
		boolean flag=false;
		try {
			//Return date object
			driver.findElement(By.xpath("(//div[@class='fs-2 c-inherit flex flex-nowrap'])[5]"));
			flag=true;
			
		} catch (NoSuchElementException e) 
		{
			flag=false;
		}
		
		
		
		if(flag==false)
		{
			System.out.println("Testpass, Return date is not available at source");
		}
		else
		{
			System.out.println("Testfail, Return date is available at source");
		}
		
		
		
		
	
		
		
		

	}

}
