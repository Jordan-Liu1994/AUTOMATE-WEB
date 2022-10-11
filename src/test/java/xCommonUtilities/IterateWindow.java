package xCommonUtilities;

public class IterateWindow {

	Webdrivers driver = new Webdrivers();

	String childWindow;

	public void iterateToGameWindow() {
		driver.setWindowMaximized();
		driver.setTimeOut();
		childWindow = driver.getDriver().getWindowHandles().toArray()[1].toString();
		driver.getDriver().switchTo().window(childWindow);
		System.out.println("Switch to " + childWindow);
//		ONLY FOR TESTING PURPOSE
//		driver.closeBrowser();
	}
	
	public void iterateToMainWindow(String parentWindowHandle) {
		driver.setTimeOut();
		driver.getDriver().switchTo().window(parentWindowHandle);
	}
}