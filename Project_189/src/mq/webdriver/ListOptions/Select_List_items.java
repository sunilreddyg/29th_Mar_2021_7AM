package mq.webdriver.ListOptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Select_List_items {

	public static void main(String[] args) throws Exception {
		

		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		
		
		//Open ListBox items
		driver.findElement(By.linkText("Select Product Type")).click();
		Thread.sleep(1000);
		//Select one of item in listbox..
		driver.findElement(By.xpath("//li[@value='4'][contains(.,'Loans')]")).click();
		
		
		//Open Listbox items using click method
		driver.findElement(By.linkText("Select Product")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@value='3'][contains(.,'SmartEMi')]")).click();
		
		
		//Click A link 
		driver.findElement(By.linkText("Apply online")).click();

	}

}
