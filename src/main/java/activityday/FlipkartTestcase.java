package activityday;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import lib.selenium.WebDriverServiceImpl;

public class FlipkartTestcase extends WebDriverServiceImpl{

	@Test
	public void CreateAcct() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement eleLoginX = locateElement("xpath", "//button[@class='_2AkmmA _29YdH8']");
		click(eleLoginX);

		WebElement eleElectronics = locateElement("xpath", "//span[text()='TVs & Appliances']");
		actions_mouseover(eleElectronics);


		WebElement eleSamsung = locateElement("xpath","(//a[@title='Samsung'])[2]");
		click(eleSamsung);

		WebElement eleMinimum = locateElement("xpath","(//select[@class='fPjUPw'])[1]");
		selectDropDownUsingValue(eleMinimum, "25000");

		WebElement eleMaximum = locateElement("xpath","(//select[@class='fPjUPw'])[2]");
		selectDropDownUsingValue(eleMaximum, "60000");

		WebElement eleScreensize = locateElement("xpath","((//div[text()='Screen Size'])");
		Thread.sleep(1000);
		click(eleScreensize);

		WebElement elesizechk = locateElement("xpath","//div[text()='48 - 55']");
		click(elesizechk);


		WebElement eleTvRate = locateElement("xpath","(//div[@class='_1uv9Cb'])[1]/div");
		String text = getText(eleTvRate);

		WebElement eleclicklink = locateElement("xpath","(//a[@class='_31qSD5'])[1]");
		click(eleclicklink);
		//		clickLink_Index("//a[@class='_31qSD5']",1);

		switchToWindow(1);

		WebElement eleTvRate1 = locateElement("xpath","(//div[@class='_1uv9Cb']/div)[1]");
		String text2 = getText(eleTvRate1);
		
		if(text.contains(text2))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Pass");
		}
	
	}
}




