package ui_verification_Commands.getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Retrieve_Editbox_Input_Value 
{

	public static void main(String[] args) throws Exception 
	{
		
		/*
		 * Scenario:--> Verify system fetching operator and circle inputs
		 * 				according to valid mobile number.
		 * 	
		 * 			Given site url is "https://paytm.com/"
		 * 			When user enter valid Mobile number
		 * 			Then verify System auto filling correct operator and circle
		 */
		
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://paytm.com/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//input[@data-reactid='202']")).sendKeys("9440083511");
		Thread.sleep(4000);
		
		WebElement Operator_textbox=driver.findElement(By.xpath("//input[@data-reactid='213']"));
		String OperatorName=Operator_textbox.getAttribute("value");
		System.out.println("Operator name displayed is ---> "+OperatorName);
		
		WebElement Circle_texbox=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		String Circlename=Circle_texbox.getAttribute("value");
		System.out.println("Circle name displayed is ---->"+Circlename);
		
		
		//Verify Valid Operator dispalyed according to mobile number
		if(OperatorName.equals("BSNL"))
		{
			System.out.println("Testpass, Expected operator displayed");
		}
		else
		{
			System.out.println("Testfail, Expected operator not displayed");
		}
		
		
		
		
		
		
		

	}

}
