package xCommonUtilities;

public class IterateWindow {

	Webdrivers driver = new Webdrivers();
	Screenshots screenshots = new Screenshots();
	GenerateReports generateReports = new GenerateReports();

	String startGameWindow;
	String gameSelectWindow;
	String betWindow;
	String betRecordWindow;
	String betResult;

	public void iterateToGameWindow() {
		startGameWindow = driver.getDriver().getWindowHandles().toArray()[1].toString();
		driver.getDriver().switchTo().window(startGameWindow);
		driver.setWindowMaximized();
		driver.setTimeOut();
		System.out.println("Switch to " + startGameWindow);
	}

	public void iterateToInGameWindow() {
		gameSelectWindow = driver.getDriver().getWindowHandles().toArray()[2].toString();
		driver.getDriver().switchTo().window(gameSelectWindow);
		driver.setWindowMaximized();
		driver.setTimeOut();
		System.out.println("Switch to " + gameSelectWindow);
	}

	public void iterateToInBetRecordWindow() {
		betWindow = driver.getDriver().getWindowHandles().toArray()[3].toString();
		driver.getDriver().switchTo().window(betWindow);
		driver.setWindowMaximized();
		driver.setTimeOut();
		System.out.println("Switch to " + betWindow);
	}

	public void screenShotFinalWindow(String gameVendor) throws Exception {
		driver.setTimeOut();
		betResult = gameVendor + ".png";
		screenshots.takeSnapShot(betResult);
		generateReports.getExtentTest().addScreenCaptureFromPath(screenshots.screenShotPathExtent() + betResult, gameVendor);
	}

	public void iterateToMainWindow(String parentWindowHandle) {
		driver.getDriver().switchTo().window(parentWindowHandle);
		driver.setTimeOut();
	}
}