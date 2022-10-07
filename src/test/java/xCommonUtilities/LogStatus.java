package xCommonUtilities;

import org.testng.ITestResult;

public class LogStatus {

	GenerateReports generateReports = new GenerateReports();
	Screenshots screenshots = new Screenshots();
	
	public void logStatus(ITestResult result) {
		String logStatus = result.getName();
		if (result.getStatus() == ITestResult.SUCCESS) {
			generateReports.setExtentTestPass(logStatus + " - Passed");
		} else if (result.getStatus() == ITestResult.SKIP) {
			generateReports.setExtentTestSkip(logStatus + " - Skipped");
		} else if (result.getStatus() == ITestResult.FAILURE) {
			generateReports.setExtentTestFail(logStatus + " - Failed");
			try {
				String screenShotOfFailedResult = screenshots.takeSnapShot(logStatus + ".png");
				generateReports.getExtentTest().addScreenCaptureFromPath(screenshots.screenShotPathExtent() + screenShotOfFailedResult);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
