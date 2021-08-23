package framework.Datadriven.NotepadFiles;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Write_Data_into_NotepadFile {

	public static void main(String[] args) throws Exception {
		
		
		
		//Create File
		String filepath="src\\framework\\Datadriven\\NotepadFiles\\OP.txt";
		FileWriter fw=new FileWriter(filepath);
		System.out.println("File created");
		
		
		//Create object for buffered writer
		BufferedWriter writer=new BufferedWriter(fw);
		
		writer.write("UserProfile");
		
		//Create new line
		writer.newLine();
		writer.write("Sunil Reddy");
		
		//Create new line
		writer.newLine();
		writer.write("QA mentor and sr. architect");
		
		
		
		//It Close writing data and also save time
		writer.close();
		
		
		
		
	}

}
