package reports;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport {

	public static void main(String[] args) throws IOException {
		// create a html file
		ExtentHtmlReporter html =new ExtentHtmlReporter("./reports/result.html");
		html.setAppendExisting(true);
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(html);
		// create a test node lead
		ExtentTest testSuite=extent.createTest("TC_01_CreateLead", "Lead ah create panrom");
		ExtentTest test=testSuite.createNode("Lead");
        test.assignCategory("Sample");
        test.assignAuthor("Ramji");
        
        test.pass("Entered login id Demosalesmanager is success",MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/snap1.png").build());
        test.pass("Entered password crmsfa is success"); 
        extent.flush();
	}

}
