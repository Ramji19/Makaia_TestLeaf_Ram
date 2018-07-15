package delete_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import lib.selenium.WebDriverServiceImpl;

public class ViewLeadPage extends WebDriverServiceImpl{

	public ViewLeadPage(EventFiringWebDriver driver,ExtentTest test) {
		this.driver=driver;
		this.test=test;
		PageFactory.initElements(driver, this);
	}

	@FindBy(className="subMenuButtonDangerous")
	WebElement deleteLead;


	public MyLeadPage clickDelete() throws InterruptedException {
		click(deleteLead);
		Thread.sleep(1000);
		return new MyLeadPage(driver, test);
		
	}

}
