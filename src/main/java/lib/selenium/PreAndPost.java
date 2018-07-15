package lib.selenium;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import data.ReadExcel;

public class PreAndPost extends WebDriverServiceImpl{
	//older version code
	/*	public ChromeDriver webdriver;
	public EventFiringWebDriver driver;
	public int i = 1;
	 */

	public String testName,testDesc,testCategory,testAuthor,testModule,excelName;

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("beforeSuite");
		startReport();
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("afterSuite");
		endResult();
	}

	@Parameters({"url","username","password"})
	@BeforeMethod
	public void beforeMethod(String URL,String uname,String pswd) {
		//for reports
		startTestModule(testModule);
		test.assignAuthor(testAuthor);
		test.assignCategory(testCategory);
		
		System.out.println("beforeMethod");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		webdriver = new ChromeDriver();
		driver = new EventFiringWebDriver(webdriver);
		driver.register(this);
		driver.manage().window().maximize();
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName,uname);

		WebElement elePassword = locateElement("id", "password");
		type(elePassword, pswd);

		WebElement eleLogin = locateElement("class", "decorativeSubmit");
		click(eleLogin);

		WebElement eleCRM = locateElement("link", "CRM/SFA");
		click(eleCRM);


	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("afterMethod");
		driver.close();
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeClass");
		startTestCase(testName, testDesc);
	}

	@AfterClass
	public void afterClass() {
		System.out.println("afterClass");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("beforeTest");

	}

	@AfterTest
	public void afterTest() {
		System.out.println("afterTest");
	}

	//To provide data from excel to the test case:
	@DataProvider(name="TCS")
	public String[][] getData1() throws IOException {
		ReadExcel excel=new ReadExcel();
		String[][] data= excel.readExcel(excelName);
		return data;

	}
}