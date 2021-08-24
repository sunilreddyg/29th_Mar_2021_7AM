package oops.InterFace.muttiple_inheritance;

public class C extends D implements A,B
{

	@Override
	public void method2() {
		System.out.println("method2 from B class");
		
	}

	@Override
	public void method1() {
		System.out.println("method1 from A class");
		
		
	}

}
