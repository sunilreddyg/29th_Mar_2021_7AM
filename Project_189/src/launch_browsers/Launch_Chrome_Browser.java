package launch_browsers;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Chrome_Browser 
{

	public static void main(String[] args) 
	{
		
		/*
		 * Steps to Download Chromedriver.exe file
		 * 			1. Visit offical site  http://selenium.dev/downloads
		 * 			2. Scroll down page until find Browser Header
		 * 			3. Click on Browsers + Button
		 * 			4. Under Chrome click on documentation
		 * 			5. Find Installed chrome browser version
		 * 					OpenChrome---> setting----> Help--> AboutChrome
		 * 			6. Download chromedriver.exe w.r.t chrome browser version
		 * 					chrome browser version:-->  90
		 * 					chromedriver version:---> 90.0.4430.24
		 * 			7. Downlaod windows zip format file 32-bit
		 * 			8. After Downlaod unzip file, For this actions
		 * 					we receive one  chromedriver.exe file
		 * 			9. Create Environment variable using chromedriver.exe file
		 */
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		ChromeDriver chrome=new ChromeDriver();
		chrome.get("http://facebook.com");
		

	}

}
