package framework.Datadriven.Excel;

import java.io.FileInputStream;
import java.io.IOException;

public class Target_Excel_File_with_Try_Catch {

	public static void main(String[] args) 
	{
		
		
		
		FileInputStream fi = null;
		try {
			fi=new FileInputStream("TestData\\InputData1.xlsx");
			System.out.println("File located");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		if(fi!=null)
		{
			System.out.println("Cotinue Data reading from excel");
		}
		else
		{
			System.out.println("Skip reading beauase file not found");
		}
		

	}

}
