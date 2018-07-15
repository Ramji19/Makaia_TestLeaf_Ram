	package tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lib.selenium.PreAndPost;

public class EditLead extends PreAndPost{

	@Test(dataProvider="TCS")//(dependsOnMethods= {"tests.CreateLead.createLead"},description="Edit a lead")

	public void editLead(String Fname,String compName) throws InterruptedException {

		WebElement eleLead= locateElement("link", "Leads");
		click(eleLead);
		Thread.sleep(1000);

		WebElement eleFindLead= locateElement("link", "Find Leads");
		click(eleFindLead);

		Thread.sleep(500);

		WebElement eleFirstName= locateElement("xpath", "(//input[@name='firstName'])[3]");
		type(eleFirstName,Fname);

		WebElement eleFindLead1= locateElement("xpath", "(//td[@class='x-btn-center'])[7]");
		click(eleFindLead1);

		Thread.sleep(500);

		WebElement eleLead1= locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
		click(eleLead1);

		Thread.sleep(500);

		WebElement eleEdit= locateElement("xpath", "//a[text()='Edit']");
		click(eleEdit);

		WebElement eleEditComp= locateElement("xpath", "//input[@id='updateLeadForm_companyName']");
		clear(eleEditComp);
		type(eleEditComp,compName);

		WebElement eleUpdate= locateElement("xpath", "(//input[@name='submitButton'])[1]");
		click(eleUpdate);

		/*WebElement eleVerifyText= locateElement("xpath", "//span[@id='viewLead_companyName_sp']");
		getText(eleVerifyText);
		 */
		//		VerifyErrorMsg(eleVerifyText, "BatmanCorp");
	}
	@BeforeTest
	public void setValue() {
		testName="Edit Lead";
		testDesc="Edit a lead";
		testCategory="Smoke";
		testAuthor="Ramji";
		testModule="Lead";
		excelName="editLead";
		
		
	}
	
}




