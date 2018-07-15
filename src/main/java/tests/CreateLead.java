package tests;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import data.ReadExcel;
import lib.selenium.PreAndPost;

public class CreateLead extends PreAndPost{

	@Test(dataProvider="TCS")//(invocationCount=2,timeOut=100000)
	public void createLead(String compName,String fName,String lName,String source)  {

		
		WebElement eleCreateLead = locateElement("link", "Create Lead");
		click(eleCreateLead);

		WebElement eleComp_Name = locateElement("id", "createLeadForm_companyName");
		type(eleComp_Name, compName);

		WebElement eleFirst_Name = locateElement("id", "createLeadForm_firstName");
		type(eleFirst_Name, fName);

		WebElement eleLast_Name = locateElement("id", "createLeadForm_lastName");
		type(eleLast_Name, lName);

		WebElement eleSource_dd = locateElement("id", "createLeadForm_dataSourceId");
		selectDropDownUsingVisibleText(eleSource_dd, source);

		WebElement eleCreate = locateElement("class", "smallSubmit");
		click(eleCreate);

	}
	@BeforeTest
	public void setValue() {
		testName="Create Lead";
		testDesc="Create a lead";
		testCategory="Smoke";
		testAuthor="ramji";
		testModule="Lead";
		excelName="createLead";
		
		
	}

	@DataProvider(name="CTS")
	public Object getData() {
		Object[][] ramData=new Object[2][4];
		ramData[0][0]="PottiKada";
		ramData[0][1]="Nayar";
		ramData[0][2]="Chetta";
		ramData[0][3]="Cold Call";

		ramData[1][0]="CTS";
		ramData[1][1]="Ram";
		ramData[1][2]="Ji";
		ramData[1][3]="Cold Call";
		return ramData;
	}

//datapovider exmple
	/*@DataProvider(name="TCS")
	public Object getData1() {
		Object[][] ramData=new Object[1][4];
		ramData[0][0]="PottiKada";
		ramData[0][1]="Nayar";
		ramData[0][2]="Chetta";
		ramData[0][3]="Cold Call";

		return ramData;
	}
*/
	//dataprovider using excel 3x5 matrix value
	
	
		
		
	}





