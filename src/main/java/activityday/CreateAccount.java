package activityday;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import lib.selenium.WebDriverServiceImpl;

public class CreateAccount extends WebDriverServiceImpl{

	@Test
	public void CreateAcct() throws InterruptedException {

		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, "DemoSalesManager");

		WebElement elePassword = locateElement("id", "password");
		type(elePassword, "crmsfa");

		WebElement eleLogin = locateElement("class", "decorativeSubmit");
		click(eleLogin);

		WebElement eleCRM = locateElement("link", "CRM/SFA");
		click(eleCRM);

		WebElement eleAccount= locateElement("link", "Accounts");
		click(eleAccount);

		Thread.sleep(2000);

		WebElement eleCreateAccount= locateElement("link", "Create Account");
		click(eleCreateAccount);

		WebElement eleAccountName= locateElement("xpath", "//td/input[@id='accountName']");
		String name="Keplers11";
		type(eleAccountName,name);

		WebElement eleIndustrydd = locateElement("name", "industryEnumId");
		selectDropDownUsingVisibleText(eleIndustrydd, "Aerospace");

		WebElement eleCurrencydd = locateElement("xpath", "//td/select[@id='currencyUomId']");
		selectDropDownUsingVisibleText(eleCurrencydd, "INR - Indian Rupee");

		WebElement eleSourcedd = locateElement("name", "dataSourceId");
		selectDropDownUsingVisibleText(eleSourcedd,"Existing Customer");

		WebElement elemrktcmapaigndd = locateElement("id", "marketingCampaignId");
		selectDropDownUsingVisibleText(elemrktcmapaigndd, "Affiliate Sites");

		WebElement elePhone= locateElement("xpath", "//td/input[@id='primaryPhoneNumber']");
		type(elePhone,"8754465443");

		WebElement eleCity= locateElement("id", "generalCity");
		type(eleCity,"Chennai");

		WebElement eleEmailId= locateElement("xpath", "//td/input[@id='primaryEmail']");
		type(eleEmailId,"ramz@gmail.com");

		WebElement eleCountrydd = locateElement("id", "generalCountryGeoId");
		selectDropDownUsingVisibleText(eleCountrydd, "India");
		Thread.sleep(2000);

		WebElement eleStatedd = locateElement("id", "generalStateProvinceGeoId");
		selectDropDownUsingVisibleText(eleStatedd, "TAMILNADU");

		WebElement eleCreateAccount1= locateElement("xpath", "//input[@value='Create Account']");
		click(eleCreateAccount1);
		Thread.sleep(1000);

		WebElement eleAccountid= locateElement("xpath", "(//td[@class='titleCell'])[1]/following::span");
		String leadId = getText(eleAccountid);
		//		leadId=leadId.replaceAll("//D", "");//Replace text with blnk space
		//		System.out.println(leadId);

		WebElement eleFindAccount= locateElement("link", "Find Accounts");
		click(eleFindAccount);

		WebElement eleSearchAccount= locateElement("xpath", "(//input[@name='accountName'])[2]");
		type(eleSearchAccount,name);

		WebElement eleFindAccount1= locateElement("xpath", "//button[text()='Find Accounts']");
		click(eleFindAccount1);
		Thread.sleep(2000);

		WebElement eleAccountId= locateElement("xpath", "//table[@class='x-grid3-row-table']//tr/td[2]");
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.textToBe(By.xpath("//table[@class='x-grid3-row-table']//tr/td[2]"),name));
		verifyExactText(eleAccountId, name);
		
		
		//Getting id:
		/*WebElement eleAccountId= locateElement("xpath", "//table[@class='x-grid3-row-table']//tr/td[1]");
		String id = getText(eleAccountId);
		System.out.println(id);

		WebElement eleSearchId= locateElement("xpath", "(//div[@class='x-form-element']/input)[13]");
		type(eleSearchId,id);
		WebElement eleSearchAccount1= locateElement("xpath", "(//input[@name='accountName'])[2]");
		type(eleSearchAccount1,name);

		WebElement eleFindAccount2= locateElement("link", "Find Accounts");
		click(eleFindAccount2);

		WebElement eleAccountname= locateElement("xpath", "//table[@class='x-grid3-row-table']//tr/td[1]");
		String Accname= getText(eleAccountId);
		System.out.println(Accname);
		verifyExactText(eleAccountname,Accname);

		 */		closeActiveBrowser();



















	}
}




