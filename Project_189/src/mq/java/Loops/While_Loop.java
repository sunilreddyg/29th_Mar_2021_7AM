package mq.java.Loops;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class While_Loop 
{

	public static void main(String[] args) throws Exception 
	{
		
		/*
		 * while:-->
		 * 		=> While is a condition based loop.
		 * 		=> While accept loop when condition return true
		 * 			and continue iteration until condition return false.
		 * 		=> During while loop we should provide icrement/decrement
		 * 			or Any condition to break loop othewise it get into
		 * 			infinity loop.
		 * 
		 * 
		 * 		Syntax:--> 
		 * 				while(condition)
		 * 				{
		 * 
		 * 				}
		 */
		
		
	
		
		
		//Example:--> Print numbers 1 to 10 using while loop
		int i=0;
		while(i <= 10)
		{
			System.out.println(i);
			i=i+1;
		}
		
		
		
		
		//Example:--> Using while loop manage explicit wait.
		
		System.setProperty("webdriver.chrome.driver",  "new_driver_path\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		
		
		WebElement Retype_Email=driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		//driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("info@gmail.com");
		
		int count=0;
		while(!Retype_Email.isDisplayed())     //Loop accept when object is not visible at webpage
		{
			Thread.sleep(1000);
			System.out.println("Verifying");
			

			if(count==10)
			{
				throw new Exception("Element is not visible after many attemps ");
			}
			count=count+1;
		}
		System.out.println("Retype object is visible");
		
		
		
		
		
		
		
		
		

	}

}
