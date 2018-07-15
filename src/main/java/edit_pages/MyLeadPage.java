package edit_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import lib.selenium.WebDriverServiceImpl;

public class MyLeadPage extends WebDriverServiceImpl{

	public MyLeadPage(EventFiringWebDriver driver,ExtentTest test) {
		this.driver=driver;
		this.test=test;
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText="Find Leads")
	WebElement FindLead;


	public FindLeadsPage findLead() {
		click(FindLead);
		return new FindLeadsPage(driver, test); 
		
	}

}
