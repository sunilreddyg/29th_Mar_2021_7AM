package interactions.KeyBoard;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Sendkeys_Action {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		
		
		

	}

}
