package framework.Datadriven.NotepadFiles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Read_Data_From_Notepad_File 
{

	public static void main(String[] args) throws IOException 
	{
		
		//Read notepad file location
		String filepath="src\\framework\\Datadriven\\NotepadFiles\\InputData.txt";
		FileReader fr=new FileReader(filepath);
		System.out.println("file is located");
		
		
		//Create object for BufferedReader inorder to read data from notepad file
		BufferedReader reader=new BufferedReader(fr);
		
		//Use readline method to read each line in notepad file
		String Header=reader.readLine();
		System.out.println(Header);
		
		
		String line1=reader.readLine();
		String rec[]=line1.split(",");
		System.out.println(rec[0]+"     "+rec[1]);
		
		
		//Read all lines in notepad file
		String Rline;
		while((Rline=reader.readLine())!=null)
		{
				String Column[]=Rline.split(",");
				System.out.println(Column[0]+"   "+Column[1]);
		}
		
		
		
		
		
	}

}
