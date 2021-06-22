package mq.java.variable;

public class Final_Variable 
{
	
	static int a=100;			//Here variable is override type	
	static final int b=200;		//It is final variable we can't change values
	

	public static void main(String[] args) 
	{
		a=1000;
		System.out.println(a);
	}

}
