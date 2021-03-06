package pageobjects.Element_Declarations;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class Element_Declarations
{
	
	//@Findby method look for object at webpage [This object only access using pagefactory class]
	@FindBy(name="firstname") WebElement Firstname_EB;
		
	//@FindBy also look for group of objects at webpage
	@FindBy(tagName="a") List<WebElement> page_links;
	 
	//@FindBy also look for group of objects at webpage
	@FindBy(tagName="select") List<WebElement> Dropdown;
	 
	//Finding list of options under drodpown
	@FindBy(css="select[id='month'] > option") List<WebElement> Month_options;
	 
	//Finding list of options under drodpown
	@FindBy(css="select[id='year'] > option") List<WebElement> year_options;
	
	
	
	/*
	 * Once object is located and it will not be sarched over and over again
	 * 		[Mostly it is usefull in ajax web application]
	 * 	
	 * 		Note:--> Some times we get staleElementReference exception
	 */
	@FindBy(name="reg_passwd__") @CacheLookup WebElement Password_EB;
	
	
	
	/*
	 * @FindBYS:
	 * When Required webelement objects need to match all of the given criteria..
	 */
	@FindBys
	({
		
		@FindBy(tagName="input"),			//Wrong tagname
		@FindBy(tagName="select"),
		@FindBy(css="input[type='checkbox']"),
		
	}) List<WebElement> By_Group_Objects;
	
	
	/*
	 * @FindAll:-->
	 *  When required webelement objects need to match atleast one of the give criteria
	 */
	
	@FindAll
	({
		@FindBy(tagName="select"),    		
		@FindBy(tagName="input1"),			//wrong tagname
		@FindBy(css="input[type='checkbox']"),
		
	}) List<WebElement> All_Group_objects;
	
		 

}
