package framework.Datadriven.Excel;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data_From_Excel {

	public static void main(String[] args) throws Exception 
	{
		
		String file_path="TestData\\InputData.xlsx";
		FileInputStream fi=new FileInputStream(file_path);
		System.out.println("file located");
		
		//Get Existing workbook access
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Get sheet from workbook using its sheetname
		XSSFSheet sht=book.getSheet("Sheet1");
		
		//Target row from sheet reference
		XSSFRow row=sht.getRow(1);
		
		//Target cell from row referecne
		String url=row.getCell(0).getStringCellValue();
		System.out.println(url);
		
		//Read Browsername from excel
		String browsername=row.getCell(1).getStringCellValue();
		System.out.println(browsername);
		
		//Read page title
		String page_title=row.getCell(2).getStringCellValue();
		System.out.println(page_title);
		

	}

}
