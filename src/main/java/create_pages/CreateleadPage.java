package create_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.And;
import lib.selenium.WebDriverServiceImpl;

public class CreateleadPage extends WebDriverServiceImpl{

	public CreateleadPage(/*EventFiringWebDriver driver,ExtentTest test*/) {
		/*this.driver=driver;
		this.test=test;
		*/PageFactory.initElements(driver, this);
	}

	@FindBy(id="createLeadForm_companyName")
	WebElement companyName;
	@FindBy(id="createLeadForm_firstName")
	WebElement firstName;
	@FindBy(id="createLeadForm_lastName")
	WebElement lastName;
	@FindBy(id="createLeadForm_dataSourceId")
	WebElement eleSource_dd;
	@FindBy(className="smallSubmit")
	WebElement submit;


	@And("Create a leads with (.*)") 
	public  CreateleadPage typeCompanyName(String compName) {
		type(companyName, compName);
		return this; 
	}

	@And("gives fName as (.*)")   
	public  CreateleadPage typeFirstName(String fName) {
		type(firstName, fName);
		return this; 
	}

	@And("gives lname as (.*)")
	public  CreateleadPage typeLastName(String lName) {
		type(lastName, lName);
		return this; 
	}
	
//	@And("select a dropdown value from (.*)") 
//	public  CreateleadPage dropdownSource(String source) {
//		selectDropDownUsingVisibleText(eleSource_dd, source);
//		return this; 
//	}

	@And("Click on createLead button")
	public  ViewLeadPage createLead_button() {
		click(submit);
		return new ViewLeadPage(/*driver, test*/); 
	}



}
