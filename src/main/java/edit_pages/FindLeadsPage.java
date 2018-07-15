package edit_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import lib.selenium.WebDriverServiceImpl;

public class FindLeadsPage extends WebDriverServiceImpl{

	public FindLeadsPage(EventFiringWebDriver driver,ExtentTest test) {
		this.driver=driver;
		this.test=test;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="(//input[@name='firstName'])[3]")
	WebElement eleFirstName;
	@FindBy(xpath="(//td[@class='x-btn-center'])[7]")
	WebElement eleFindLead;
	@FindBy(xpath="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")
	WebElement eleFirstLead;



	public FindLeadsPage typeLeadName(String fName) {
		type(eleFirstName, fName);
		return this; 
	}

	public FindLeadsPage clickFindLead() {
		click(eleFindLead);
		return this; 
	}


		public ViewLeadPage clickLeadid() throws InterruptedException {
			click(eleFirstLead);
			Thread.sleep(2000);
			return new ViewLeadPage(driver, test); 

		}

	}
