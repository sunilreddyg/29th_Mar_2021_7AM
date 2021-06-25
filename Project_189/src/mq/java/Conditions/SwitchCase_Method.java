package mq.java.Conditions;

public class SwitchCase_Method 
{

	public static void main(String[] args) 
	{
	
		String month="feb";
		
		
		switch (month) 
		{
		
		case "jan":
			System.out.println("10% discount");
			break;
			
		case "feb":
			System.out.println("20% discount");
			break;
			
		case "mar":
			System.out.println("30% discount");
			break;	

		default:System.out.println("Mismatch in month");
			break;
		}
		
		System.out.println("Condition finished");

	}

}
