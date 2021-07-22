package chrome_options;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class IE_Desired_Capabilities {

	public static void main(String[] args) throws IOException 
	{
		
		DesiredCapabilities ieCapabilities = DesiredCapabilities.internetExplorer();
		ieCapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
		ieCapabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		ieCapabilities.setCapability("enableElementCacheCleanup",true);
		
		InternetExplorerOptions options=new InternetExplorerOptions();
		options.ignoreZoomSettings();
		options.takeFullPageScreenshot();
		options.withInitialBrowserUrl("http://google.com");
		ieCapabilities.merge(options);
		
		
		System.setProperty("webdriver.ie.driver", "drivers\\IEDriverServer.exe");
		InternetExplorerDriver ie=new InternetExplorerDriver(options);
		
		
		File src=((TakesScreenshot)ie).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("screens\\google.png"));

	}

}
