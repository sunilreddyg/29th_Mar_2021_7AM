package oops.Encapsulation;

public class Encaps 
{
	//IN Encapsulation all variable data declare with private variable so that outside class it can't access
	private String name;
	private String email;
	private String mobile;
	public String EMP_ID="MQ001";
	
	public String getName() 
	{
		System.out.println("Some one reading data --> "+name);
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
		System.out.println("Someone login into account --> "+name);
	}
	
	
	public String getEmail() 
	{
		return email;
	}
	public void setEmail(String email) 
	{
		this.email = email;
	}
	
	
	public String getMobile() 
	{
		return mobile;
	}
	
	public void setMobile(String mobile) 
	{
		this.mobile = mobile;
	}
	
	
	

}
