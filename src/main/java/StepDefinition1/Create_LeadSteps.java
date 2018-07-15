//package StepDefinition1;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class Create_LeadSteps {
//
//
//	ChromeDriver driver;
//
//	@Given ("Launch the Browser")
//	public void launchBrowser()
//	{
//		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
//		driver=new ChromeDriver();
//
//	}
//	@And ("Load the LeafTaps Site URL")
//
//	public void loadURL()
//	{
//		driver.get("http://leaftaps.com/opentaps/control/main");
//	}
//	@And ("Maximize the browser and Set time out for loading the url")
//	public void maxBrowser()
//	{
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//
//	}
//
//	@And ("Login into the site and go to crmSfa with (.*)")
//
//	public void Login(String uName) {
//
//		driver.findElementById("username").sendKeys(uName);
//
//	}
//
//	@And ("give password as (.*)")
//	public void Login1(String pswd) {
//
//
//		driver.findElementById("password").sendKeys(pswd);
//
//		driver.findElementByClassName("decorativeSubmit").click();
//
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//		driver.findElementByLinkText("CRM/SFA").click();
//
//	}
//
//	@When ("Create a lead with (.*)")
//
//	public void createLead(String compname)
//	{
//		driver.findElementByLinkText("Create Lead").click();
//		driver.findElementById("createLeadForm_companyName").sendKeys(compname);
//	}
//
//	@And("give fName as (.*)")
//	public void FirstName(String fName)
//	{
//		driver.findElementById("createLeadForm_firstName").sendKeys(fName);
//
//	}
//	@And("give lname as (.*)")
//	public void lastNameandSubmit(String lName)
//	{
//		driver.findElementById("createLeadForm_lastName").sendKeys(lName);
//		driver.findElementByClassName("smallSubmit").click();
//	}
//
//	@Then ("Created Lead successfully")
//	public void verifyLead() {
//
//
//		System.out.println("Lead Created Successfully");
//	}
//
//}
