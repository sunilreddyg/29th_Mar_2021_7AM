package mq.java.Conditions;

public class Else_Condition {

	public static void main(String[] args) 
	{
		
		
		int a=20;
		int b=10;
		
		if(a > b)
		{
			System.out.println("true condition");
			System.out.println("a is greater than b");
		}
		else
		{
			System.out.println("false condition");
			System.out.println("a is not greater than b");
		}
		
		
		
		
		//Condition cab be define without block when single statement need to execute
		int Age=19;
		if(Age > 18)
			System.out.println("Access granted");
		else
			System.out.println("Access denied");
		
		
		
		
		

	}

}
