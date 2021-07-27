package mq.java.Arrays;

public class Static_Array_Double_Dimensional 
{

	public static void main(String[] args) 
	{
		
		
		String data[][]=new String[3][2];
		
		//1st row data
		data[0][0]="iphone";
		data[0][1]="IOS OS,cost arround 50,000 RS";
		
		//2nd row data
		data[1][0]="Samsung";
		data[1][1]="Android OS,cost arround 40,000 RS";
		
		//3rd row data
		data[2][0]="Vivo";
		data[2][1]="Android OS,cost arround 30,000 RS";
		
		
		System.out.println(data[1][0]);
		
		
		//print number of rows available
		System.out.println("Array count is --> "+data.length);
		

	}

}
