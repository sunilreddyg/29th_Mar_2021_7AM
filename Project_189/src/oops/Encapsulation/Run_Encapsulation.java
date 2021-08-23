package oops.Encapsulation;

public class Run_Encapsulation {

	public static void main(String[] args)
	{
		
		
		Encaps obj=new Encaps();
		obj.EMP_ID="MQE002";
		System.out.println(obj.EMP_ID);
		
		
		obj.setName("Arjun");
		String username=obj.getName();
		System.out.println(username);
		
		
		obj.setEmail("info.mqdsrn@gmail.com");
		String useremail=obj.getEmail();
		System.out.println(useremail);
		
		
		obj.setMobile("9030248855");
		String usermobile=obj.getMobile();
		System.out.println(usermobile);
		

	}

}
