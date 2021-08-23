package extentreports;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Create_Report_Under_Tests {

	public static void main(String[] args) 
	{
		
		String filepath="reports\\report2.html";
		ExtentReports reporter=new ExtentReports(filepath,true);
		
				ExtentTest test1=reporter.startTest("Tc001_valid_login");
				
						test1.log(LogStatus.INFO, "Browser launched");
						test1.log(LogStatus.INFO, "site url loaded");
						test1.log(LogStatus.INFO, "Username Entered");
						test1.log(LogStatus.INFO, "Password Entered");
						test1.log(LogStatus.INFO, "Click on signin button");
						test1.log(LogStatus.PASS, "Login successfull");
				
				reporter.endTest(test1);

	
		reporter.flush();   //Save and genarate report

		

	}

}
