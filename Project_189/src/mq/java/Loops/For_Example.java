package mq.java.Loops;

public class For_Example {

	public static void main(String[] args) 
	{
		
		
		//print numbers from 1 to 10
		for (int i = 1; i <= 10; i++) 
		{
			System.out.println(i);
		}
		
		
		//Print number from 10 to 1
		for (int i = 10; i >= 1; i--) 
		{
			System.out.println(i);
		}
		
		
		//printing array value using for loop
		String browser[]= {"firefox","chrome","safari","opera","edge"};
		for (int i = 0; i < browser.length; i++) 
		{
			System.out.println(browser[i]);
		}
		
		
		
		//break iteration
		for (int i = 1; i <=5; i++) 
		{
			if(i==4)
			{
				break;   //Stop iteration and eject controls from  loop
			}
			System.out.println(i);
				
		}
		
		
		//Continue
		for (int i = 1; i <=5; i++) 
		{
			if(i==3)
			{
				continue;   //Skip iteration and continue next iteration from starting
			}
			System.out.println(i);
				
		}
		
		
		
		
		
		
		
		
		
		
	}

}
