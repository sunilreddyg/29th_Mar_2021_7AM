package oops.polymorphism.overloading;

public class Overloading_Example 
{
	
	
	void print_product()
	{
		System.out.println("IPhone");
	}
	
	void print_product(String Mobilename)
	{
		System.out.println(Mobilename);
	}
	
	
	void print_product(String Mobilename,double MobilePrice)
	{
		System.out.println(Mobilename+"\t"+MobilePrice);
	}
	
	
	void print_product(double MobilePrice,String Mobilename)
	{
		System.out.println(MobilePrice+"\t"+Mobilename);
		
	}
	
	

	public static void main(String[] args) {
		
		//Create object for Class
		Overloading_Example obj=new Overloading_Example();
		obj.print_product();
		obj.print_product("Samsung");
		obj.print_product("Oppo", 120000.00);
		obj.print_product(50000.00, "Vivo");

	}

}
