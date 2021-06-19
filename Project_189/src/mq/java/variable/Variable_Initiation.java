package mq.java.variable;

public class Variable_Initiation 
{

	public static void main(String[] args)
	{
		
		
		int a=10;
		a=20;
		System.out.println("a value is -> "+a);
		
		
		int b;
		b=100;
		b=200;
		System.out.println("b value is -> "+b);
		
		
		
		//Variable Initiation while using conditions.
		
		int x;
		if(true)
		{
			x=100;	
		}
		System.out.println("x value is ->"+x);
		
		
		
		
		int Age=17;
		boolean flag;
		if(Age >= 18)
		{
			 flag=true;
		}
		else
		{
			 flag=false;
		}
		System.out.println("Status is --> "+flag);
		
		
		
		
		
		//Variable Initiation with loops
		int sum=0;
		for (int i = 1; i <= 100; i++) 
		{
			sum=sum+i;
		}
		System.out.println(sum);
		

	}

}
