package grid;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class CrystalCruises {

	@Test
	public void crystalCruises() throws InterruptedException, MalformedURLException {

		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("chrome");
		dc.setPlatform(Platform.MAC);

		RemoteWebDriver driver = new RemoteWebDriver(
				new URL("http://192.168.1.129:4449/wd/hub"), dc);

		//Load the URL
		driver.get("http://legacy.crystalcruises.com/Calendar.aspx");

		//Maximize
		driver.manage().window().maximize();

		//Enter the UserName
		List<WebElement> allQuotes = driver.findElementsByLinkText
				("Request A Quote".toUpperCase());

		// Print the number of quote
		int count = allQuotes.size();
		System.out.println(count);

		// Click on the 4th link
		allQuotes.get(2).click();

		// 
		System.out.println(driver.getCurrentUrl());









	}
}