package framework.Datadriven.PropertyFiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Read_Data_From_PropertyFiles {

	public static void main(String[] args) throws IOException 
	{
		
		
		//Target file location
		String Input_File_Path="src\\framework\\Datadriven\\PropertyFiles\\Input.properties";
		FileInputStream fi=new FileInputStream(Input_File_Path);
		System.out.println("File located");
		
		//Create object for property files
		Properties repository=new Properties();
		repository.load(fi);   //Load all input values into repository
		System.out.println("All inputs are loaded to property repository");
		
		
		//Get Property value using property keyname
		String URL=repository.getProperty("facebook.url");
		System.out.println(URL);
		
		
		//Get Property value using property keyname
		String UID=repository.getProperty("username");
		System.out.println(UID);
		
		
		
		
		
		
	}

}
