package framework.Datadriven.PropertyFiles;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Write_Data_into_PropertyFiles {

	public static void main(String[] args) throws IOException 
	{
		
		
		//Create object for property files
		Properties repository=new Properties();
		
		//Add objects to repository
		repository.setProperty("Tc001", "Testpass");
		repository.setProperty("Tc002", "Testfail");
		repository.setProperty("Tc003", "Testpass");
		
		
		
		//Create output file
		FileOutputStream fo=new FileOutputStream("TestData\\OP.properties");
		repository.store(fo, "Login Test Result");
	}

}
