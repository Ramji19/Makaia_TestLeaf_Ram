package delete_pages;

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

	@FindBy(xpath="(//a[@class='x-tab-right'])[2]")
	WebElement elePhonetab;
	@FindBy(xpath="(//div[@class='x-plain-body x-plain-body-noheader x-plain-body-noborder'])[14]/input")
	WebElement elePhoneInput;
	@FindBy(xpath="//button[text()='Find Leads']")
	WebElement eleFind;
	@FindBy(xpath="(//td//a[@class='linktext'])[1]")
	WebElement eleLead1link;
	@FindBy(xpath="(//label[text()='Lead ID:']/following::input)[1]")
	WebElement eleInputLead;
	@FindBy(className="x-paging-info")
	WebElement verifyError;


	public FindLeadsPage clickPhone() {
		click(elePhonetab);
		return this; 
	}

	public FindLeadsPage enterPhoneNo(String phone) {
		type(elePhoneInput, phone);
		return this; 
	}


	public FindLeadsPage clickFind() throws InterruptedException {
		click(eleFind);
		Thread.sleep(1000);
		return this;

	}
	static String text;
	public ViewLeadPage inputLead() {
		 text = getText(eleLead1link);
		click(eleLead1link);
		return new ViewLeadPage(driver, test);

	}

	public FindLeadsPage enterLeadID() throws InterruptedException {
		type(eleInputLead,text);
		click(eleFind);
		Thread.sleep(1000);
		return this; 

	}

	public FindLeadsPage verifyError(String errormsg) throws InterruptedException {
		verifyPartialText(verifyError, errormsg);
		return this; 

	}

}
