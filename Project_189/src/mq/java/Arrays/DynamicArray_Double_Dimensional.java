package mq.java.Arrays;

public class DynamicArray_Double_Dimensional 
{

	public static void main(String[] args) 
	{
		
		
		String user_info[][]=
			{
					{"Ajay","9030245678","ajay@mq.com"},
					{"Hari","9030245222","hari@mq.com"},
					{"bhavya","7899245678","bhavya@mq.com"},
			};
		
		
		System.out.println(user_info[1][0]);
		
		
		for (String[] eachrecord : user_info) 
		{
			System.out.println(eachrecord[0]+"  "+eachrecord[1]+"   "+eachrecord[2]);
		}

	}

}
