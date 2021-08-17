package framework.Datadriven.CsvFiles;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.opencsv.CSVReader;

public class Read_CsvFiles_Using_List_Interface {

	public static void main(String[] args) throws IOException {
		
		//Locate file
		String filepath="src\\framework\\Datadriven\\CsvFiles\\Input.csv";
		FileReader fr=new FileReader(filepath);
		System.out.println("file is located");
		
		
		//Create object for csv reader
		CSVReader reader=new CSVReader(fr);
		
		//Reading all csv file into list interface
		List<String[]> list=reader.readAll();
		list.remove(0);   //It remove headers
		
		
		for (String[] Records : list) 
		{
			System.out.println(Records[0]+"   "+Records[1]+"    "+Records[2]);
		}
				

	}

}
