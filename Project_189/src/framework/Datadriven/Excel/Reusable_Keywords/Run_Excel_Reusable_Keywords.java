package framework.Datadriven.Excel.Reusable_Keywords;

public class Run_Excel_Reusable_Keywords {

	public static void main(String[] args) 
	{
		
		
		Excel_Keywords.ConnectTo_Excel_Workbook("Sheet3");
		
		
		for (int i = 1; i < Excel_Keywords.get_rowcount(); i++) 
		{
			String username=Excel_Keywords.get_cellData(i, 0);
			String password=Excel_Keywords.get_cellData(i, 1);
			System.out.println(username+"   "+password);
			
			Excel_Keywords.Write_CellData(i, 2, "Testapss");
			
		}
		
		
		Excel_Keywords.Close_workbook();

	}

}
