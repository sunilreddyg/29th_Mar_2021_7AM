package launch_browsers;

import org.openqa.selenium.edge.EdgeDriver;

public class Launching_Edge_Browser 
{

	public static void main(String[] args) 
	{
		
		/*
		 * Downlaod msedgedriver.exe file
		 * 
		 * 		URL:---> https://developer.microsoft.com/en-us/microsoft-edge/tools/webdriver/#downloads
		 * 		FInd your edge browser version
		 * 		Downlaod msedgedriver w.r.t your edgebrowser version
		 * 		Downlaod zip format file w.r.t hotspot size
		 * 		Unzip file to back up folder
		 * 		Setup runtime environment variable before launch edgebrowser
		 */
		
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\SUNIL\\Desktop\\drivers\\msedgedriver.exe");
		EdgeDriver driver=new EdgeDriver();
		driver.get("http://google.com");

	}

}
