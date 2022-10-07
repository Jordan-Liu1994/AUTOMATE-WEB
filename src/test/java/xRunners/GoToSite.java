package xRunners;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import xCommonUtilities.UsedVariables;

public class GoToSite extends UsedVariables {

	@BeforeClass
	@Parameters({ "browser" })
	public void setup(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			driver.setChromeDriverProperty();
		} else if (browser.equalsIgnoreCase("firefox")) {
			driver.setFireFoxDriverProperty();
		} else if (browser.equalsIgnoreCase("opera")) {
			driver.setOperaDriverProperty();
		} else if (browser.equalsIgnoreCase("edge")) {
			driver.setEdgeDriverProperty();
		}
	}

	@Test(priority = 0)
	@Parameters({ "browser" })
	public void startBrowser(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			driver.startChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			driver.startFireFoxDriver();
		} else if (browser.equalsIgnoreCase("opera")) {
			driver.startOperaDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			driver.startEdgeDriver();
		}
	}

	@Test(priority = 1)
	@Parameters({ "url" })
	public void goToSite(String url) {
		driver.getURL(url);
	}

	@AfterClass
	public void tearDown() throws InterruptedException {
		Thread.sleep(1000);
		driver.stopDriver();
	}
}