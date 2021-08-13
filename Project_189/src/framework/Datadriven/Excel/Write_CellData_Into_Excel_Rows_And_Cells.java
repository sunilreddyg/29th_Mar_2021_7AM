package framework.Datadriven.Excel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Date;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_CellData_Into_Excel_Rows_And_Cells {

	public static void main(String[] args) throws Exception 
	{
		
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("file located");
		
		//Get wokbook access
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Get sheet using book reference
		XSSFSheet sht=book.getSheet("Sheet1");
		
		//Change Existing row and Existing cell value
		sht.getRow(1).getCell(1).setCellValue("chrome");
		
		//Change Existing row and NewCell value
		sht.getRow(1).createCell(3).setCellValue("TestPass");
		
		//write Data into New role and new Cell value
		sht.createRow(2).createCell(0).setCellValue(new Date());
		
		//Create new Excel file
		FileOutputStream fo=new FileOutputStream("TestData\\output.xlsx");
		//Write Data into new book
		book.write(fo);
		//Close workbook
		book.close();
		
		

	}

}
