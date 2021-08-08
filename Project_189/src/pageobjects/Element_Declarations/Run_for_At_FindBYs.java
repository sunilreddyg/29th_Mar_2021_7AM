package pageobjects.Element_Declarations;

import javax.sound.midi.Synthesizer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Run_for_At_FindBYs 
{

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "new_driver_path\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();			
		driver.get("https://www.facebook.com/r.php");			
		driver.manage().window().maximize();
		
		
		Element_Declarations Elements=PageFactory.initElements(driver, Element_Declarations.class);
		int Bys_obj_count=Elements.By_Group_Objects.size();
		System.out.println("Bys object count is --> "+Bys_obj_count);
		
		
		int All_obj_count=Elements.All_Group_objects.size();
		System.out.println("All object count is --> "+All_obj_count);
	}

}
