package sample_pageobjmodel_Leadcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import edit_pages.MyHomePage;
import lib.selenium.PreAndPost;

public class EditLead extends PreAndPost{

	@Test(dataProvider="TCS")
	public void createLead(String fName,String compName) throws InterruptedException  {

		new MyHomePage(driver, test).clickLead().findLead().typeLeadName(fName).clickFindLead().clickLeadid().clickEdit()
		.editComp(compName).UpdateComp().verifyEdit(compName);
		
	}

	@BeforeTest
	public void setValue() {
		testName="Edit Lead";
		testDesc="Edit a leads company name";
		testCategory="Smoke";
		testAuthor="Ramji";
		testModule="Lead";
		excelName="Editelead_Page";


	}


}





