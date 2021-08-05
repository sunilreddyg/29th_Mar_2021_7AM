package findElements.webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_WebTable_Data_From_Dynamic_Rows {

	public static void main(String[] args) 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "new_driver_path\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.icicidirect.com/equity");
		driver.manage().window().maximize();
		
		
		//Target webtable
		WebElement table=driver.findElement(By.id("tblMarketToday"));
		
		//Finding list of rows available in webtable
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		System.out.println("Number of rows available is --> "+rows.size());
		
		rows.remove(0);  //Remove Table header
		
		
		for (int i = 0; i < rows.size(); i++) 
		{
			WebElement Dynamic_row=rows.get(i);
			   
			//Finding list of cells available in selected row
			List<WebElement> cells=Dynamic_row.findElements(By.tagName("td"));
				
				
			String CompanyName=cells.get(0).getText();
			String CompanyLTP=cells.get(1).getText();
				
			System.out.println(CompanyName+"           "+CompanyLTP);
		}
		

	}

}
