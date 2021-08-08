package pageobjects.with_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PIM 
{
	WebDriver driver;
	
	public PIM(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//b[contains(.,'PIM')]") public WebElement PIM_menu_Tab;
	@FindBy(xpath = "//input[contains(@id,'empName')]") public WebElement Employeename;
	@FindBy(xpath = "//input[@id='empsearch_id']") public WebElement ID_textbox;
	@FindBy(xpath = "//select[contains(@id,'status')]") public WebElement Employee_Status_DD;
	@FindBy(xpath = "//select[contains(@id,'termination')]") public WebElement Include_DD;
	@FindBy(xpath = "//input[@id='empsearch_supervisor_name']") public WebElement Supervise_name;
	@FindBy(xpath = "//select[contains(@id,'title')]") public WebElement job_title_DD;
	@FindBy(xpath = "//select[contains(@id,'unit')]") public WebElement Sub_unit_DD;
	@FindBy(xpath = "//input[@id='searchBtn']") public WebElement Search_btn;
	
	
	public void PIM_Search(String Empname,String EmpID,String Emp_status_Option)
	{
		Employeename.sendKeys(Empname);
		ID_textbox.sendKeys(EmpID);
		new Select(Employee_Status_DD).selectByVisibleText(Emp_status_Option);
		Search_btn.click();
	}
	

}
