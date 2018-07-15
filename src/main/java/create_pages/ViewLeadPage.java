package create_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Then;
import lib.selenium.WebDriverServiceImpl;

public class ViewLeadPage extends WebDriverServiceImpl{

	public ViewLeadPage(/*EventFiringWebDriver driver,ExtentTest test*/) {
		/*this.driver=driver;
		this.test=test;
		*/PageFactory.initElements(driver, this);
	}

	@FindBy(id="viewLead_firstName_sp")
	WebElement verifyFname;

	@Then("Created Lead successfully with leadname (.*)")
	public ViewLeadPage verifyFirstName(String fVname) {
		verifyExactText(verifyFname, fVname);
		return this;
		
	}

}
