package sample_pageobjmodel_Leadcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import lib.selenium.PreAndPost;
import merge_pages.MyHomePage;

public class MergeLead extends PreAndPost{

	@Test(dataProvider="TCS")
	public void createLead(String fromId,String toId) throws InterruptedException  {

		new MyHomePage(driver, test).clickLead().clickCreateLead().clickFromLead().typeLeadName(fromId).clickFind1().clickLeadid().clickToLead()
		.typeToLeadName(toId).clickFind2().clickLeadid2().clickMerge().manageAlert();
	}

	@BeforeTest
	public void setValue() {
		testName="Merge Lead";
		testDesc="Merge 2 leads";
		testCategory="Smoke";
		testAuthor="Ramji";
		testModule="Lead";
		excelName="Mergelead_Page";


	}


}





