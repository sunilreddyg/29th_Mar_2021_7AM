package pageobjects.with_PageFactory;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Admin 
{
	

	@FindBy(id="menu_admin_viewAdminModule") public WebElement Admin_Menu_Tab;
	@FindBy(name="searchSystemUser[userName]") public WebElement Username;
	@FindBy(xpath = "//select[contains(@id,'userType')]") public WebElement UserRole_DD;
	@FindBy(xpath = "//input[@type='text'][contains(@id,'empName')]") public WebElement EmployeeName;
	@FindBy(xpath = "//select[@id='searchSystemUser_status']") public WebElement Status_DD;
	@FindBy(id="searchBtn") public WebElement Search_button;
	@FindBy(xpath = "//input[@id='resetBtn']") public WebElement Reset_button;
	
	//List of options
	@FindBy(css="#searchSystemUser_userType > option") public List<WebElement> Role_options;
	@FindBy(xpath="//select[@id='searchSystemUser_status']/option") public List<WebElement> Emplyee_options;
	@FindBy(xpath = "//select[@id='searchSystemUser_status']") public Select Status_Selector;
	
}
