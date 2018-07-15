package tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import lib.selenium.WebDriverServiceImpl;

public class MergeLead extends WebDriverServiceImpl{

	@Test(dataProvider="mergeLead")//(enabled=false)
	public void EditLead(String fromLead,String toLead) throws InterruptedException {

	

		WebElement eleLead= locateElement("link", "Leads");
		click(eleLead);
		Thread.sleep(1000);

		WebElement eleMergeLead= locateElement("link", "Merge Leads");
		click(eleMergeLead);

		getTitle();
		
		WebElement eleFromLeadicon= locateElement("xpath", "(//table[@name='ComboBox_partyIdFrom']/following::a)[1]");
		click(eleFromLeadicon);
		
		switchToWindow(1);
		
		getTitle();
		
		WebElement eleFromLeadbox= locateElement("xpath", "(//label[text()='Lead ID:']/following::input)[1]");
		type(eleFromLeadbox,fromLead);
		
		WebElement eleFindLead= locateElement("xpath", "//button[text()='Find Leads']");
		click(eleFindLead);
		
		Thread.sleep(1000);
		
		WebElement eleLead1ID= locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
		String iD1 = getText(eleLead1ID);
		System.out.println("Lead 1 entered is"+iD1);
		click(eleLead1ID);
		
		Thread.sleep(500);
		
		switchToWindow(0);
		
		getTitle();
		
		WebElement eleToLeadicon= locateElement("xpath", "//input[@name='ComboBox_partyIdTo']/following::a");
		click(eleToLeadicon);
		
		switchToWindow(1);
		
		getTitle();
		
		WebElement eleToLeadbox= locateElement("xpath", "//input[@name='id']");
		type(eleToLeadbox,toLead);
		
		Thread.sleep(500);
		
		WebElement eleFindLead1= locateElement("xpath", "//button[text()='Find Leads']");
		click(eleFindLead1);
		
		Thread.sleep(1000);
		
		WebElement eleLead2ID= locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
		String iD2 = getText(eleLead2ID);
		System.out.println("Lead 1 entered is"+iD2);
		click(eleLead2ID);
		
		switchToWindow(0);
		
		getTitle();
		
		Thread.sleep(200);
		
		WebElement eleMerge= locateElement("link", "Merge");
		click(eleMerge);
		
		acceptAlert();
		
		Thread.sleep(1000);
		
		WebElement eleFindLead2= locateElement("link", "Find Leads");
		click(eleFindLead2);
		
		WebElement eleFindLeadbox= locateElement("xpath", "//input[@name='id']");
		type(eleFindLeadbox,iD1);
		
		WebElement eleFindLead3= locateElement("xpath", "//button[text()='Find Leads']");
		click(eleFindLead3);
			
	}

	@DataProvider(name="mergeLead")
	public Object getData2()
	{
		Object[][] ramData=new Object[1][4];
		ramData[0][0]="10007";
		ramData[0][1]="10008";
		return ramData;	
	}


}




