package merge_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;


import cucumber.api.java.en.And;
import lib.selenium.WebDriverServiceImpl;

public class MyLeadPage extends WebDriverServiceImpl{

	public MyLeadPage(EventFiringWebDriver driver,ExtentTest test) {
		this.driver=driver;
		this.test=test;
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText="Merge Leads")
	WebElement MergeLead;

	@And("Click on create lead link")
	public MergeLeadsPage clickCreateLead() {
		click(MergeLead);
		return new MergeLeadsPage(driver, test); 

	}

}
