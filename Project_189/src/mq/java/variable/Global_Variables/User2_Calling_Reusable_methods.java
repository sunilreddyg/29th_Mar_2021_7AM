package mq.java.variable.Global_Variables;

public class User2_Calling_Reusable_methods {

	public static void main(String[] args) 
	{
		Reusable_methods obj=new Reusable_methods();
		
		//Initlize Data to Global variables
		obj.driver_path="drivers\\";
		obj.url="http://facebook.com";
		obj.username="Harsha";
		obj.password="Hrsh_pwd";
		
		obj.Launch_Browser();
		obj.Enter_site_url();
		obj.User_login();
		

	}

}
