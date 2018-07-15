package edit_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import lib.selenium.WebDriverServiceImpl;

public class openTapsCRM extends WebDriverServiceImpl{

	public openTapsCRM(EventFiringWebDriver driver,ExtentTest test) {
		this.driver=driver;
		this.test=test;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@id='updateLeadForm_companyName']")
	WebElement editComp;
	@FindBy(xpath="(//input[@name='submitButton'])[1]")
	WebElement update;

	public openTapsCRM editComp(String compName) throws InterruptedException {
		clear(editComp);
		Thread.sleep(500);
		type(editComp, compName);

		return this;

	}
	public ViewLeadPage2 UpdateComp() {
		click(update);
		return new ViewLeadPage2(driver, test);

	}




}
