package switchcommands.Active_Element;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_ActiveElement 
{

	public static void main(String[] args) throws Exception 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
	    driver.manage().window().setSize(new Dimension(1276, 728));
	    
	    
	    
	    //Click Country Listbox
	    driver.findElement(By.xpath("//span[@id='select2-country-container']")).click();
	    Thread.sleep(2000);
	    
	    //Switch to active element
	    driver.switchTo().activeElement().sendKeys("India");
	    Thread.sleep(2000);
	    
	    //Switch to active element
	    driver.switchTo().activeElement().sendKeys(Keys.ENTER);
	    
	    
	    
	    
	    
	    
	    
		

	}

}
