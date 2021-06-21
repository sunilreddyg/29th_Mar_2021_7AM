package mq.java.variable;

public class VariableTypes 
{
	
	int a=100;			//Instant Global variable		
	static int b=200;
	
	public void method1()
	{
		String name="Aakash";   	//Local Variable
		System.out.println(name);
	}
	
	public void method2()
	{
		System.out.println("Global variable is --> "+a);
	}


	public static void main(String[] args) 
	{
		//Calling instant variables
		VariableTypes obj=new VariableTypes();
		int value=obj.a;
		System.out.println("global varaible value is -> "+value);
		
		//Change Global variable value at runtime
		obj.a=240;
		System.out.println("changed value is "+obj.a);
		
		
		//Calling static variable
		int static_value=VariableTypes.b;
		System.out.println(static_value);
		
		//Change Global variabel value at runtime
		VariableTypes.b=350;
		System.out.println(VariableTypes.b);
		
	}

}
