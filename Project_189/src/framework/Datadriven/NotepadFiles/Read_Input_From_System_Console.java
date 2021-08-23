package framework.Datadriven.NotepadFiles;

import java.util.Scanner;

public class Read_Input_From_System_Console 
{

	public static void main(String[] args) {
		
		//Create obejct from scanner   [System.in allowed to read data from system console]
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your name:-->");
		String UID=sc.nextLine();
		System.out.println(UID);
		
		System.out.println("Enter start iteration");
		int Start=sc.nextInt();
		
		
		System.out.println("Enter End iteration");
		int End=sc.nextInt();
		
		for (int i = Start; i <= End; i++)
		{
			System.out.println(i);
		}

	}

}
