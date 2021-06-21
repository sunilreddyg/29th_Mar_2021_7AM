package mq.java.variable.Global_Variables;

public class User1_Calling_Reusable_methods 
{

	public static void main(String[] args) 
	{
		
		
		Reusable_methods obj=new Reusable_methods();
		
		//Initlize Data to Global variables
		obj.driver_path="C:\\Users\\SUNIL\\git\\29th_Mar_2021_7AM\\Project_189\\drivers\\";
		obj.url="http://facebook.com";
		obj.username="Darshan";
		obj.password="NewDarshan_pwd";
		
		obj.Launch_Browser();
		obj.Enter_site_url();
		obj.User_login();
	}

}
