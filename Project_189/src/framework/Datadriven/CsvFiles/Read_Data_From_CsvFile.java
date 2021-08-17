package framework.Datadriven.CsvFiles;

import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;

public class Read_Data_From_CsvFile {

	public static void main(String[] args) throws IOException 
	{
		
		
		//Locate file
		String filepath="src\\framework\\Datadriven\\CsvFiles\\Input.csv";
		FileReader fr=new FileReader(filepath);
		System.out.println("file is located");
		
		
		//Create object for csv reader
		CSVReader reader=new CSVReader(fr);
		
		
		String Headers[]=reader.readNext();
		System.out.println(Headers[0]+"    "+Headers[1]+"    "+Headers[2]);
		
		
		String Line1[]=reader.readNext();
		System.out.println(Line1[0]+"      "+Line1[1]+"       "+Line1[2]);
		
		
		//Read all Records using csvFiles
		String Rline[];
		while((Rline=reader.readNext())!=null)
		{
			System.out.println(Rline[0]+"      "+Rline[1]+"      "+Rline[2]);
			
		}
		
		
		

	}

}
