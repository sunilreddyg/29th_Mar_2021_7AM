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
	    driver.findElement(By.cssSelector(".form-group:nth-child(1) > .col-md-4:nth-child(2) > .form-control")).click();
	    driver.findElement(By.xpath("//form[@id=\'basicBootstrapForm\']/div/div/input")).sendKeys("Aakash");
	    driver.findElement(By.xpath("//form[@id=\'basicBootstrapForm\']/div/div[2]/input")).click();
	    driver.findElement(By.xpath("//form[@id=\'basicBootstrapForm\']/div/div[2]/input")).sendKeys("kiran");
	    driver.findElement(By.xpath("//form[@id=\'basicBootstrapForm\']/div[2]/div/textarea")).click();
	    driver.findElement(By.xpath("//form[@id=\'basicBootstrapForm\']/div[2]/div/textarea")).sendKeys("Hyderabad");
	    driver.findElement(By.xpath("//input[@type=\'email\']")).click();
	    driver.findElement(By.xpath("//input[@type=\'email\']")).sendKeys("aaksah@gmail.com");
	    driver.findElement(By.xpath("//form[@id=\'basicBootstrapForm\']/div[4]/div/input")).click();
	    driver.findElement(By.xpath("//form[@id=\'basicBootstrapForm\']/div[4]/div/input")).sendKeys("9030248855");
	    driver.findElement(By.name("radiooptions")).click();
	    driver.findElement(By.id("checkbox2")).click();
	    
		

	}

}
