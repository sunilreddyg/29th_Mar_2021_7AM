package framework.Datadriven.Excel.Reusable_Keywords;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Keywords 
{
	
	static String Ifile_path="TestData\\InputData.xlsx";
	static String Ofile_path="TestData\\OP.xlsx";
	static FileInputStream fi;
	static XSSFWorkbook book;
	static XSSFSheet sht;
	

	/*
	 * Reusable Keyword:-->
	 * Author:-->
	 * Created Date:-->
	 * Last Modified Date:-->		
	 */
	public static void ConnectTo_Excel_Workbook(String sheetname)
	{
		
		try {
			
			fi=new FileInputStream(Ifile_path);
			System.out.println("----------Excel file is located ---------");
			
			book=new XSSFWorkbook(fi);
			
			sht=book.getSheet(sheetname);
			System.out.println("-----------Workbook Sheet located---------");
			
		} catch (IOException e) {
			 System.out.println(e.getMessage());
		}
	}
	
	
	/*
	 * Reusable Keyword:-->
	 * Author:-->
	 * Created Date:-->
	 * Last Modified Date:-->		
	 */
	public static String get_cellData(int rownum, int cellnum)
	{
		String CellData=sht.getRow(rownum).getCell(cellnum).getStringCellValue();
		return CellData;
	}

	
	
	/*
	 * Reusable Keyword:--> Method return row count in interger format [Last row of data exist]
	 * Author:-->
	 * Created Date:-->
	 * Last Modified Date:-->		
	 */
	public static int get_rowcount()
	{
		return sht.getLastRowNum();
	}
	
	
	/*
	 * Reusable Keyword:--> Method Write data into Excel in perticular row and perticular cell
	 * Author:-->
	 * Created Date:-->
	 * Last Modified Date:-->		
	 */
	public static void Write_CellData(int Rownum, int Cellnum, String result)
	{
		sht.getRow(Rownum).createCell(2).setCellValue(result);
	}
	
	
	/*
	 * Reusable Keyword:--> Close workbook
	 * Author:-->
	 * Created Date:-->
	 * Last Modified Date:-->		
	 */
	public static void Close_workbook()
	{
		try {
			FileOutputStream fo=new FileOutputStream(Ofile_path);
			book.write(fo);
			book.close();
			System.out.println("----------------Workbook is Closed -----");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
}
