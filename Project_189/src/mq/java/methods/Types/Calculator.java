package mq.java.methods.Types;

public class Calculator 
{
	
	public void Open_Calculator()
	{
		System.out.println("Calculator opened");
	}
	
	public int add(int a, int b)
	{
		return a+b;
	}
	
	public int sub(int x, int y)
	{
		return x-y;
	}
	
	
	public static void main(String[] args) {
		
		Calculator obj=new Calculator();
		
		//Calling integer method type
		int total=obj.add(30, 42);
		System.out.println(total);
		
		//Calling integer method type
		int s=obj.sub(20, 3);
		System.out.println(s);

	}

}
