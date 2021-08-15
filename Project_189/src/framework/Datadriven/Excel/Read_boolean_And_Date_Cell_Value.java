package framework.Datadriven.Excel;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_boolean_And_Date_Cell_Value 
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
		
		
		//Target Status Cell
		boolean status=row.getCell(5).getBooleanCellValue();
		System.out.println(status);
		
		//Converting primitive datatype into Class
		Boolean bvalue=new Boolean(status);
		System.out.println(bvalue.toString());
		
		
		//Target Date cell
		Date date=row.getCell(6).getDateCellValue();
		System.out.println(date.toString());
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		String new_Date=sdf.format(date);
		System.out.println(new_Date);
			

	}

}
