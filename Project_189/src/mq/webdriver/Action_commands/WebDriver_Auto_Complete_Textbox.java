package mq.webdriver.Action_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_Auto_Complete_Textbox 
{

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		
		
		//Selecting Radio button
		WebElement Roundtrip_Radio_btn=driver.findElement(By.xpath("(//span[contains(@class,'radio__circle bs-border bc-neutral-500 bw-1 ba')])[2]"));
		Roundtrip_Radio_btn.click();
		
		
		//Selecting Auto suggesstion from Auto complete textbox
		WebElement From_AutoComplete_Editbox=driver.findElement(By.xpath("//input[@class='field bw-1 bs-solid w-100p p-2 box-border br-4 fs-2 c-neutral-900 h-8 bc-neutral-100 c-neutral-900 focus:bc-secondary-500 flex flex-middle flex-between t-all fs-2 focus:bc-secondary-500 bg-transparent bc-neutral-100 pr-2 pl-3 pt-2 pb-2 ba br-4 h-8 null']"));
		From_AutoComplete_Editbox.clear();
		From_AutoComplete_Editbox.sendKeys("HYD");
		Thread.sleep(5000);   //Timeout to load suggesstion
		WebElement HYD_City_Option=driver.findElement(By.xpath("//p[contains(.,'Hyderabad, IN - Rajiv Gandhi International (HYD)')]"));
		HYD_City_Option.click();
		
		//Selecting auto suggestions from auto complete textbox
		WebElement To_autoComplete_Editbox=driver.findElement(By.xpath("//input[@class='field bw-1 bs-solid w-100p p-2 box-border br-4 fs-2 c-neutral-900 h-8 bc-neutral-100 c-neutral-900 focus:bc-secondary-500 flex flex-middle flex-between t-all fs-2 focus:bc-secondary-500 bg-transparent bc-neutral-100 pr-2 pl-3 pt-2 pb-2 ba br-4 h-8']"));
		To_autoComplete_Editbox.clear();
		To_autoComplete_Editbox.sendKeys("DEL");
		Thread.sleep(5000);   //Timeout to load suggesstion
		WebElement Del_City_option=driver.findElement(By.xpath("//li[contains(.,'New Delhi, IN - Indira Gandhi Airport (DEL)')]"));
		Del_City_option.click();
		
		
		

	}

}
