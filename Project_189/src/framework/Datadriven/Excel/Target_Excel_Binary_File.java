package framework.Datadriven.Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


public class Target_Excel_Binary_File 
{

	public static void main(String[] args) throws IOException
	{
		
		//Target excel file
		File file=new File("TestData\\InputData.xlsx");
		FileInputStream fi=new FileInputStream(file);
		System.out.println("File located");
		
		
		
		

	}

}
