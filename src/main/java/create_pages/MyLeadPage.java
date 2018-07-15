package create_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import lib.selenium.WebDriverServiceImpl;

public class MyLeadPage extends WebDriverServiceImpl{

	public MyLeadPage(/*EventFiringWebDriver driver,ExtentTest test*/) {
		/*this.driver=driver;
		this.test=test;
		*/PageFactory.initElements(driver, this);
	}

	@FindBy(linkText="Create Lead")
	WebElement CreateLead;

	@And("Click on create lead links")
	public CreateleadPage clickCreateLead() {
		click(CreateLead);
		return new CreateleadPage(/*driver, test*/); 

	}

}
