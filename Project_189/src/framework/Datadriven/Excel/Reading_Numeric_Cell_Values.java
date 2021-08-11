package framework.Datadriven.Excel;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Reading_Numeric_Cell_Values 
{

	public static void main(String[] args) throws IOException 
	{
		
		
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("file located");
		
		//Access existing workbook using file inputstream
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//get sheet using above book reference
		XSSFSheet sht=book.getSheet("celltypes");
		
		//Get row using above sheet
		XSSFRow row=sht.getRow(1);
		
		//Target Mobile number cell
		double Mobile_In_Numeric=row.getCell(1).getNumericCellValue();
		//Converting Number format value into String format
		String Mobile_In_String=NumberToTextConverter.toText(Mobile_In_Numeric);
		System.out.println("Mobile Number in String format ---> "+Mobile_In_String);
		
		
		//Target Age cell
		double Age=row.getCell(3).getNumericCellValue();
		System.out.println(Age+" --> In double format");
		//Converting double format into int value
		Double Age_dble_frmt=new Double(Age);
		System.out.println(Age_dble_frmt.intValue()+"   --> in Number format");
		
		
		//Target salary cell
		double salary=row.getCell(4).getNumericCellValue();
		System.out.println(salary);
		
		
		
		
		
		

	}

}
