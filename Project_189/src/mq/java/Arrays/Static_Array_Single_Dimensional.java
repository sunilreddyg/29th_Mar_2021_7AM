package mq.java.Arrays;

public class Static_Array_Single_Dimensional
{

	public static void main(String[] args) 
	{
		
		
		
		//Single dimensional array
		
		
		int num[]=new int[5];
		num[0]=100;
		num[1]=200;
		num[2]=300;
		num[3]=400;
		num[4]=500;
		
		System.out.println("3rd index value is "+num[3]);
		
		
		
		String tools[]=new String[4];
		tools[0]="IDE";
		tools[0]="RC";
		tools[0]="WD";
		tools[0]="GRID";
		
		System.out.println("Tool count is --> "+tools.length);
		
		
		
		Object obj[]=new Object[3];
		obj[0]="Iphone";
		obj[1]=5;
		obj[2]=35000.00;
		
		System.out.println(obj[0]+"   "+obj[1]+"   "+obj[2]);
		
		
		
		for (Object object : obj) {
			System.out.println("=>"+object);
		}
		
		
		

	}

}
