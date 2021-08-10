package framework.Datadriven.Excel;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestData_For_WebDriver_program {

	public static void main(String[] args) throws IOException 
	{
		
		//Target file location
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		
		//Get Workbook access using above fileinput stream
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Target sheet 
		XSSFSheet sht=book.getSheetAt(0);
		
		String url=sht.getRow(1).getCell(0).getStringCellValue();
		String browsername=sht.getRow(1).getCell(1).getStringCellValue();
		String page_title=sht.getRow(1).getCell(2).getStringCellValue();
		
		
		
		WebDriver driver = null;
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "new_driver_path\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browsername.equals("edge"))
		{
			System.setProperty("webdriver.edge.driver", "new_driver_path\\msedgedriver.exe");
			driver=new EdgeDriver();
		}
		
		
		driver.get(url);
		System.out.println(driver.getTitle().equals(page_title));
		

	}

}
