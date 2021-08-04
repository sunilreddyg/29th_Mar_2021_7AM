package findElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selected_Required_Data_From_Calendar {

	public static void main(String[] args) throws Exception 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "new_driver_path\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		
		
		
		WebElement Departure_Date_Cal=driver.findElement(By.xpath("//input[contains(@id,'ctl00_mainContent_view_date1')]"));
		Departure_Date_Cal.click();
		Thread.sleep(1000);
		
		
		
		WebElement Next_button=driver.findElement(By.xpath("//a[@title='Next']"));
		String Runtime_Class=Next_button.getAttribute("class");
		boolean Next_btn_Enabled_status=Runtime_Class.contains("ui-state-disabled");
		
		
		String Exp_Month="December";
		String Exp_Date="21";
		
		
		//it accept loop when next button enabled and eject loop when it was disabled
		while(Next_btn_Enabled_status==false)
		{
			
			
			WebElement Current_Month_Table=driver.findElement(By.xpath("(//table[@class='ui-datepicker-calendar'])[1]"));
			WebElement Current_month_header=driver.findElement(By.xpath("(//span[@class='ui-datepicker-month'])[1]"));
			System.out.println(Current_month_header.getText());
			
			if(Current_month_header.getText().equals(Exp_Month))
			{
				Current_Month_Table.findElement(By.linkText(Exp_Date)).click();
				break;
			}
			
			
			Next_button.click();
			Thread.sleep(1000);
			
		
			//Restoring next button to avoid stale element reference exception
			Next_button=driver.findElement(By.xpath("//a[@title='Next']"));
			Runtime_Class=Next_button.getAttribute("class");
			Next_btn_Enabled_status=Runtime_Class.contains("ui-state-disabled");
		}
		
		
		
		

	}

}
