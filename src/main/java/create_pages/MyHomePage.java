package create_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.When;
import lib.selenium.WebDriverServiceImpl;

public class MyHomePage extends WebDriverServiceImpl{

	public MyHomePage(/*EventFiringWebDriver driver,ExtentTest test*/) {
		/*this.driver=driver;
		this.test=test;
		*/PageFactory.initElements(driver, this);
	}

	@FindBy(linkText="Leads")
	WebElement Lead;

	@When("Click on the leadss")
	public MyLeadPage clickLead() {
		click(Lead);
		return new MyLeadPage(/*driver, test*/);
	}

}
