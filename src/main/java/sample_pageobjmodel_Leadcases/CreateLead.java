package sample_pageobjmodel_Leadcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import create_pages.MyHomePage;
import lib.selenium.PreAndPost;

public class CreateLead extends PreAndPost{

	@Test(dataProvider="TCS")
	public void createLead(String compName,String fName,String lName,String source)  {

		new MyHomePage(/*driver, test*/).clickLead().clickCreateLead().typeCompanyName(compName).
		typeFirstName(fName)/*.dropdownSource(source)*/.typeLastName(lName)
		.createLead_button().verifyFirstName(fName);
		
	}

	@BeforeTest
	public void setValue() {
		testName="Create Lead";
		testDesc="Create a lead";
		testCategory="Smoke";
		testAuthor="ramji";
		testModule="Lead";
		excelName="Createlead_Page";


	}


}





