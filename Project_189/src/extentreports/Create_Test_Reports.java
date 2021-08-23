package extentreports;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Create_Test_Reports {

	public static void main(String[] args)
	{
		
		String filepath="reports\\report1.html";
		ExtentReports reporter=new ExtentReports(filepath,true);
		
				ExtentTest test1=reporter.startTest("Tc001_valid_login");
				
						
				
				reporter.endTest(test1);
				
				
				ExtentTest test2=reporter.startTest("Tc002_Invalid_login");
				
						
				
				reporter.endTest(test2);
		
	
		reporter.flush();   //Save and genarate report

	}

}
