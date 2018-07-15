package sample_pageobjmodel_Leadcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import delete_pages.MyHomePage;
import lib.selenium.PreAndPost;

public class DeleteLead extends PreAndPost{

	
	
	@Test(dataProvider="TCS")
	public void createLead(String phone,String errormsg) throws InterruptedException  {

		new MyHomePage(driver, test).clickLead().findLead().clickPhone().enterPhoneNo(phone).clickFind().inputLead().clickDelete().findLead().
		enterLeadID().verifyError(errormsg);
	}

	@BeforeTest
	public void setValue() {
		testName="Delete Lead";
		testDesc="Deletes a lead";
		testCategory="Smoke";
		testAuthor="Ramji";
		testModule="Leads";
		excelName="Deletelead_Page";

	}


}





