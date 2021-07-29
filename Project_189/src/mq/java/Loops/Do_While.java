package mq.java.Loops;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Do_While {

	public static void main(String[] args) throws Exception 
	{
		
		/*
		 * Do-while:-->
		 * 		Do-while is a condition loop it work similar as
		 * 		while loop . but only difference do-while execute
		 * 		once even  condition return false.
		 */
		
		int i=100;
		do {
			System.out.println(i);
		} while (i < 1);
		
		
		
		int j=100;
		while(j<10)    //While doesn't accept iteration when condition return false
		{
			System.out.println(j);
			j=j+1;
		}
		
		
		
		//Do while with true condition
		int k=0;
		do {
			System.out.println(k);
			k=k+1;
		} while (k < 10);
		
		
		
		
		
		/*
		 * Example:--> Using do-while write a program to reload page
		 * 				until expected page found..
		 */
		System.setProperty("webdriver.chrome.driver",  "new_driver_path\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		boolean flag = false;
		int count=0;
		do {
			
			driver.get("https://www.facebook.com");
			try {
				 flag=new WebDriverWait(driver, 30)
				.until(ExpectedConditions.titleContains("Facebook"));
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
			count=count+1;
			if(count==10)
			{
				break;
			}

		} while (flag==false);
		
		System.out.println("page title found");
	
	}

}
