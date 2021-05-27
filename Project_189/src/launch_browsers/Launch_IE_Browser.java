package launch_browsers;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class Launch_IE_Browser 
{

	public static void main(String[] args) 
	{
		
		/*
		 * Downlaod IEDriverServer.exe file
		 * 	
		 * 		=> visit site https://www.selenium.dev/downloads/
		 * 		=> under The Internet Explorer Driver Server
		 * 		=> Make sure your IEdriver version match with selenium version.
		 * 		=> Download IEDriverServer according to hotspot size 32bit / 64 bit
		 * 		=> Click To download zip format file
		 * 		=> Unzip file to back up folder
		 * 		=> Setup Runtime Environment varibale for IEDriverServer.exe file
		 * 
		 * 
		 * 		Rule1:-->
		 * 				IE browser zoom level should be 100
		 * 
		 * 		RUle2:-->
		 * 				Disable all privacy and Security Setting.
		 * 				uncheck every security and privacy feature
		 * 	
		 */
		
		
		
		
		
		System.setProperty("webdriver.ie.driver", "drivers\\IEDriverServer.exe");
		InternetExplorerDriver ie=new InternetExplorerDriver();
		ie.get("http://google.com");
		
		

	}

}
