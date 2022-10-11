package xSetups;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import xCommonUtilities.UsedVariables;

public class Setup extends UsedVariables {

	@BeforeSuite
	@Parameters({ "reportName", "platform", "browser", "javaVersion", "user" })
	public void setup(String reportName, String platform, String browser, String javaVersion, String user) {
		generateReports.startReport(reportName, platform, browser, javaVersion, user);
		startDrivers.startDriverDependingOnParameter(browser);
	}
	
	@AfterSuite
	public void tearDown() throws InterruptedException {
		Thread.sleep(1000);
		driver.stopDriver();
		generateReports.flushReport();
	}
	
	@AfterMethod
	public void logStatus(ITestResult result) {
		logStatus.logStatus(result);
	}
}