package waitcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_for_Element_Selection_State_To_BE {

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "new_driver_path\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		
		//Enabled Explicitwait timeout on automation browser
		WebDriverWait wait=new WebDriverWait(driver, 50);
		
		
		By Roundtrip_Radio_Btn=By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']");
		wait.until(ExpectedConditions.elementSelectionStateToBe(Roundtrip_Radio_Btn, true));
		System.out.println("Roundtrip radio button selection is true");
		
		
		wait.until(ExpectedConditions.elementSelectionStateToBe(Roundtrip_Radio_Btn, false));
		System.out.println("Roundtrip radio button selection state is false");
		
			
		

	}

}
