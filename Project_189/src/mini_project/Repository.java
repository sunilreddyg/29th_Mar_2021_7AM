package mini_project;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Repository 
{

	public WebDriver driver;
	String driver_path="new_driver_path\\";
	
	
	/*
	 * KeywordName:--> Launch any browser using keyname [chrome,firefox,edge]
	 * Author:-->
	 * CreatedoN:-->
	 * parameters used:-->
	 */
	public void launch_browser(String browername)
	{
		switch (browername) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", driver_path+"chromedriver.exe");
			driver=new ChromeDriver();
			break;
			
		case "edge":
			System.setProperty("webdriver.edge.driver", driver_path+"msedgedriver.exe");
			driver=new EdgeDriver();
			break;


		default: System.out.println("browser name mismatched");
			break;
		}
	}
	
	
	
	/*
	 * KeywordName:--> Launch any browser using keyname [chrome,firefox,edge]
	 * Author:-->
	 * CreatedoN:-->
	 * parameters used:-->
	 */
	public void loadwebpage(String url)
	{
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	

	/*
	 * KeywordName:--> Launch any browser using keyname [chrome,firefox,edge]
	 * Author:-->
	 * CreatedoN:-->
	 * parameters used:-->
	 */
	public void manage_timeout(int time)
	{
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
	
	
	/*
	 * KeywordName:--> Enter text into editbox
	 * Author:-->
	 * CreatedoN:-->
	 * parameters used:-->
	 */
	public void Enter_text(String location,String input)
	{
		driver.findElement(By.xpath(location)).clear();
		driver.findElement(By.xpath(location)).sendKeys(input);
	}
	
	/*
	 * KeywordName:--> Select Dropdown
	 * Author:-->
	 * CreatedoN:-->
	 * parameters used:-->
	 */
	public void Select_Dropdown(String location,String option_name)
	{
		new Select(driver.findElement(By.xpath(location))).selectByVisibleText(option_name);
	}
	
	
	/*
	 * KeywordName:--> Click Method
	 * Author:-->
	 * CreatedoN:-->
	 * parameters used:-->
	 */
	public void click_Element(String location)
	{
		driver.findElement(By.xpath(location)).click();
	}
	
	
	/*
	 * KeywordName:--> Click Method
	 * Author:-->
	 * CreatedoN:-->
	 * parameters used:-->
	 */
	public void Capture_Screen(String ScreenName) 
	{
		try {
			
			Date d=new Date();       //import from java.util
			//Create simple date format
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MMM-dd hh-mm-ss");
			//Convert current system date using simpledateformat
			String time=sdf.format(d);
			
			//Capture screen
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.createDir(new File("screens"));
			FileHandler.copy(src, new File("screens\\"+ScreenName+time+".png"));
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	

	/*
	 * KeywordName:--> MosueHover
	 * Author:-->
	 * CreatedoN:-->
	 * parameters used:-->
	 */
	public void Mouse_hover(String location)
	{
		WebElement element=driver.findElement(By.xpath(location));
		new Actions(driver).moveToElement(element).pause(2000).perform();
	}
	

}
