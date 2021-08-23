package framework.Datadriven.Excel;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Reading_Different_Types_of_Data_From_Multiple_Cells {

	public static void main(String[] args) throws Exception 
	{
		
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("file located");
		
		//Get wokbook access
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Get sheet using book reference
		XSSFSheet sht=book.getSheetAt(3);
		
		
		//Get in which row data was started
		int Frow=sht.getFirstRowNum();
		System.out.println("Data started in excel is --> "+Frow);
		
		
		//Get in which row data was ended
		int Lrow=sht.getLastRowNum();
		System.out.println("Last row number where data was exist --> "+Lrow);
		
		
		//Applying for loop to iterate for expected number of rows
		for (int i = Frow+1; i <= Lrow; i++)
		{
			
			XSSFCell uid_Cell=sht.getRow(i).getCell(0);
			
			String username=null;
			if(uid_Cell.getCellType()==CellType.STRING)
			{
				username=uid_Cell.getStringCellValue();
			}
			else if(uid_Cell.getCellType()==CellType.NUMERIC)
			{
				Double dble_value=uid_Cell.getNumericCellValue();
				username=NumberToTextConverter.toText(dble_value);
			}
			else if(uid_Cell.getCellType()==CellType.BOOLEAN)
			{
				Boolean boolean_value=uid_Cell.getBooleanCellValue();
				username=boolean_value.toString();
			}
			
			System.out.println(username);
			
			
		}
		
		
		
		
		

	}

}
