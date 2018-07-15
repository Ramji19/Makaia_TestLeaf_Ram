package merge_pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import lib.selenium.WebDriverServiceImpl;

public class MergeLeadsPage extends WebDriverServiceImpl{

	public MergeLeadsPage(EventFiringWebDriver driver,ExtentTest test) {
		this.driver=driver;
		this.test=test;
		PageFactory.initElements(driver, this);
	}
	//From lead
	@FindBy(xpath="(//table[@name='ComboBox_partyIdFrom']/following::a)[1]")
	WebElement FromLeadsIcon;
	@FindBy(xpath="(//label[text()='Lead ID:']/following::input)[1]")
	WebElement FromLeadIDInput;
	@FindBy(xpath="//button[text()='Find Leads']")
	WebElement eleFindLead1;
	@FindBy(xpath="//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")
	WebElement eleClickLead1;
	//To Lead
	@FindBy(xpath="//input[@name='ComboBox_partyIdTo']/following::a")
	WebElement ToLeadsIcon;
	@FindBy(xpath="//input[@name='id']")
	WebElement ToLeadIDInput;
	@FindBy(xpath="//button[text()='Find Leads']")
	WebElement eleFindLead2;
	@FindBy(xpath="//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")
	WebElement eleClickLead2;
	//click Merge icon
	@FindBy(linkText="Merge")
	WebElement MergeButton;


	public MergeLeadsPage clickFromLead() {
		click(FromLeadsIcon);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		switchToWindow(1);
		return this; 
	}

	public MergeLeadsPage typeLeadName(String fromId) {
		type(FromLeadIDInput, fromId);
		return this; 
	}

	public MergeLeadsPage clickFind1() {
		click(eleFindLead1);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return this;
	}

	public MergeLeadsPage clickLeadid() throws InterruptedException {
		click(eleClickLead1);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		switchToWindow(0);
		return this; 

	}

	public MergeLeadsPage clickToLead() {
		click(ToLeadsIcon);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		switchToWindow(1);
		return this; 
	}

	public MergeLeadsPage typeToLeadName(String toId) {
		type(ToLeadIDInput, toId);
		/*	String iD1 = getText(FromLeadIDInput);
		System.out.println("Lead 1 entered is"+iD1);
		 */	return this; 
	}

	public MergeLeadsPage clickFind2() {
		click(eleFindLead2);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return this;
	}

	public MergeLeadsPage clickLeadid2() throws InterruptedException {
		click(eleClickLead2);
		Thread.sleep(2000);
		return this; 

	}
	public MergeLeadsPage clickMerge() {
		click(MergeButton);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return this;
	}
	public MergeLeadsPage manageAlert() throws InterruptedException {
		acceptAlert();
		Thread.sleep(1000);
		return this;
	}








}
