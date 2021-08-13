package framework.Datadriven.Excel;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data_From_Multiple_Cells {

	public static void main(String[] args) throws IOException 
	{
	
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("file located");
		
		//Get wokbook access
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Get sheet using book reference
		XSSFSheet sht=book.getSheetAt(2);
		
		
		//Get in which row data was started
		int Frow=sht.getFirstRowNum();
		System.out.println("Data started in excel is --> "+Frow);
		
		
		//Get in which row data was ended
		int Lrow=sht.getLastRowNum();
		System.out.println("Last row number where data was exist --> "+Lrow);
		
		
		//Applying for loop to iterate for expected number of rows
		for (int i = Frow+1; i <= Lrow; i++)
		{
			String Username=sht.getRow(i).getCell(0).getStringCellValue();
			String password=sht.getRow(i).getCell(1).getStringCellValue();
			
			System.out.println(Username+"    "+password);
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
