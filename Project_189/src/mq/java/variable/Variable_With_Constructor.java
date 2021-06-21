package mq.java.variable;

public class Variable_With_Constructor 
{
	int a;
	int b;
	
	
	public Variable_With_Constructor(int x, int y) 
	{
		this.a=x;
		this.b=y;
	}
	
	
	public void method1()
	{
		System.out.println("a value is --> "+a);
		System.out.println("b value is --> "+b);
	}
	

	public static void main(String[] args) 
	{
		
		Variable_With_Constructor obj=new Variable_With_Constructor(100, 200);
		obj.method1();

	}

}
