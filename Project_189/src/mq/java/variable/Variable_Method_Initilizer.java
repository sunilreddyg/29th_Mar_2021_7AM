package mq.java.variable;

public class Variable_Method_Initilizer 
{
	
	int a;
	int b;
	
	
	public void method1()
	{
		a=100;
		b=200;
	}
	
	
	

	public static void main(String[] args) 
	{
		
		Variable_Method_Initilizer obj=new Variable_Method_Initilizer();
		obj.method1();
		System.out.println(obj.a);
		System.out.println(obj.b);
	}

}
