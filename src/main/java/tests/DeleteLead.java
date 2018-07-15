package tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import lib.selenium.WebDriverServiceImpl;

public class DeleteLead extends WebDriverServiceImpl{

	@Test(dataProvider="editLead")//(dependsOnMethods= {"tests.CreateLead.createLead"},alwaysRun=true)
	public void deleteLead(String phoneNum) throws InterruptedException {

		

		WebElement eleLead= locateElement("link", "Leads");
		click(eleLead);

		Thread.sleep(1000);

		WebElement eleFindLead= locateElement("link", "Find Leads");
		click(eleFindLead);

		Thread.sleep(2000);

		WebElement elePhone= locateElement("xpath", "(//a[@class='x-tab-right'])[2]");
		click(elePhone);

		WebElement elePhonefield= locateElement("xpath", "(//div[@class='x-plain-body x-plain-body-noheader x-plain-body-noborder'])[14]/input");
		type(elePhonefield,phoneNum);

		WebElement elePhFindLead= locateElement("xpath", "//button[text()='Find Leads']");
		click(elePhFindLead);

		WebElement eleLeadIDtxt= locateElement("xpath", "(//td//a[@class='linktext'])[1]");
		String text = getText(eleLeadIDtxt);
		System.out.println(text);

		Thread.sleep(1000);

		WebElement eleLeadIDclick= locateElement("xpath", "(//td//a[@class='linktext'])[1]");
		click(eleLeadIDclick);

		WebElement eleDelete = locateElement("class", "subMenuButtonDangerous");
		click(eleDelete);

		Thread.sleep(1000);

		WebElement eleFindLead1= locateElement("link", "Find Leads");
		click(eleFindLead1);

		WebElement eleLeadIDenter= locateElement("xpath", "(//label[text()='Lead ID:']/following::input)[1]");
		type(eleLeadIDenter,text);
		click(eleLeadIDenter);

		WebElement eleFindLead2= locateElement("link", "Find Leads");
		click(eleFindLead2);

		WebElement eleFinderror= locateElement("class", "x-paging-info");
		verifyExactText(eleFinderror, "No records to display");

		closeActiveBrowser();

	}


	@DataProvider(name="editLead")
	public Object getData2()
	{
		Object[][] ramData=new Object[1][1];
		ramData[0][0]="123456789";
		return ramData;	
	}


}



