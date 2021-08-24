package oops.Abstract;

public class Main extends Car
{

	public static void main(String[] args) {
		
		
		Main obj=new Main();
		obj.Strat_Car();
		

		Dog dog=new Dog();
		dog.makesourd();
		dog.sleep();
		
		
		Cat cat=new Cat();
		cat.makesourd();
		cat.sleep();
		
		//Abstract class allow static methods to call directly...
		System.out.println(Animal.life);
		

	}

}
