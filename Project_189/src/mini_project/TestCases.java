package mini_project;

public class TestCases extends Repository implements Reusable_Objects,InputData
{
	
	
	public void initiate_browser()
	{
		launch_browser(BROWSER_NAME);
		loadwebpage(HRM_URL);
		manage_timeout(20);
		Capture_Screen("Homepage");
	}
	
	public void user_login()
	{
		
		Enter_text(LOC_USERNAME, IP_USERNAME);
		Enter_text(LOC_PASSWORD, IP_PASSWORD);
		click_Element(LOC_LOGIN_BUTTON);
		Capture_Screen("Account Page");
	}
	
	
	public void UserManageMent_Create_user()
	{
		Mouse_hover(LOC_ADMIN_MENU_TAB);
		Mouse_hover(LOC_ADMIN_TAB_USER_MANAGEMENT);
		click_Element(LOC_ADMIN_TAB_USER_MANAGEMENT_USERS);
	}
	
	
	public static void main(String args[])
	{
		TestCases obj=new TestCases();
		obj.initiate_browser();
		obj.user_login();
		obj.UserManageMent_Create_user();
	}

}
