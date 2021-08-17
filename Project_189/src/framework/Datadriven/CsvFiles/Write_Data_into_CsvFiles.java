package framework.Datadriven.CsvFiles;

import java.io.FileWriter;
import java.io.IOException;
import com.opencsv.CSVWriter;

public class Write_Data_into_CsvFiles {

	public static void main(String[] args) throws IOException
	{
		
		
		
		//Create file writer
		String filepath="src\\framework\\Datadriven\\CsvFiles\\output.csv";
		FileWriter fw=new FileWriter(filepath);
		System.out.println("File created");
	
		//Create object for csv writer
		CSVWriter writer=new CSVWriter(fw);
		
		//Using Writenext method write data into CSVwriter file
		String Headers[]={"UID","STATUS","CODE"};
		writer.writeNext(Headers);
		
		
		//Using Writenext method write data into CSVwriter file
		String Line1[]={"SID","TRUE","100"};
		writer.writeNext(Line1);
		
		//Save and close Csvwriter file
		writer.close();
		

	}

}
