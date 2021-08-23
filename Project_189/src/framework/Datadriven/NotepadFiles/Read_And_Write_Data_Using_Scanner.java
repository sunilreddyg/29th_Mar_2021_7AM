package framework.Datadriven.NotepadFiles;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Read_And_Write_Data_Using_Scanner {

	public static void main(String[] args) throws IOException {
		
		
		//Read notepad file location
		String filepath="src\\framework\\Datadriven\\NotepadFiles\\InputData.txt";
		FileReader fr=new FileReader(filepath);
		System.out.println("file is located");
		
		
		Scanner sc=new Scanner(fr);
		
		String Headers=sc.nextLine();
		System.out.println(Headers);
		
		
		while(sc.hasNextLine())
		{
			String line=sc.nextLine();
			//Split comma delimited file
			String arr[]=line.split(",");
			
			System.out.println(arr[0]+"\t"+arr[1]);
			
		}
		
		
		//CLose data
		sc.close();

	}

}
