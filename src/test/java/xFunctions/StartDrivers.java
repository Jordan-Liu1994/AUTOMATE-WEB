package xFunctions;

import xCommonUtilities.Webdrivers;

public class StartDrivers {

	Webdrivers driver = new Webdrivers();

	public void startDriverDependingOnParameter(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			driver.setChromeDriverProperty();
			driver.startChromeDriver();

		} else if (browser.equalsIgnoreCase("firefox")) {
			driver.setFireFoxDriverProperty();
			driver.startFireFoxDriver();

		} else if (browser.equalsIgnoreCase("opera")) {
			driver.setOperaDriverProperty();
			driver.startOperaDriver();

		} else if (browser.equalsIgnoreCase("edge")) {
			driver.setEdgeDriverProperty();
			driver.startEdgeDriver();
		}
	}

}
