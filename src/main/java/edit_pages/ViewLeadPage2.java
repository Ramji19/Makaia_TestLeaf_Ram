package edit_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import lib.selenium.WebDriverServiceImpl;

public class ViewLeadPage2 extends WebDriverServiceImpl{

	public ViewLeadPage2(EventFiringWebDriver driver,ExtentTest test) {
		this.driver=driver;
		this.test=test;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//div[@class='fieldgroup']//tr[1]//td[2]/span[1]")
	WebElement compVerify;


	public ViewLeadPage2 verifyEdit(String expectedText)
	{
		verifyPartialText(compVerify, expectedText);
		return this;

	}

}
