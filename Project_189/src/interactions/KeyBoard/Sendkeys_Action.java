package interactions.KeyBoard;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Sendkeys_Action 
{

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		
		 //Click Country Listbox
	    driver.findElement(By.xpath("//span[@id='select2-country-container']")).click();
	    Thread.sleep(2000);
		
		
		Actions action=new Actions(driver);
	
		WebElement Country_Selector=driver.findElement(By.xpath("//input[@class='select2-search__field']"));
		action.sendKeys(Country_Selector, "India")
		.pause(5000).
		sendKeys(Keys.ARROW_DOWN)
		.pause(5000)
		.sendKeys(Keys.ENTER)
		.perform();
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
