package xFunctions;

import javax.security.auth.login.FailedLoginException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import xCommonUtilities.GenerateReports;
import xCommonUtilities.Webdrivers;

public class LogoutF {

	Webdrivers driver = new Webdrivers();
	GenerateReports generateReports = new GenerateReports();
	
	static String space = " - ";
	
	public void setHoverUsername(String username) {
		driver.setTimeOut();
		WebElement element = driver.getDriver().findElement(By.xpath("//div[@class='header_after_login_id']//a[contains(text(),'" + username + "')]"));
		String elementText = element.getText();
		if (element.isDisplayed()) {
			driver.setActionMoveTo(element);
			generateReports.setExtentTestInfo("Hover" + space + elementText);
		} else {
			generateReports.setExtentTestFail(elementText);
		}
	}

	public void selectLogout() {
		driver.setTimeOut();
		WebElement element = driver.getDriver().findElement(By.xpath("//button[@class='btn btn_nav_logout']"));
		String elementText = element.getText();
		if (element.isDisplayed()) {
			element.click();
			generateReports.setExtentTestInfo(elementText);
		} else {
			generateReports.setExtentTestFail(elementText);
		}
	}

	public void getVerifyLogout() throws FailedLoginException {
		driver.setTimeOut();
		WebElement element = driver.getDriver().findElement(By.xpath("//div[@id='header_login']"));
		if (element.isDisplayed()) {
			generateReports.setExtentTestInfo("logout verified");
		} else {
			generateReports.setExtentTestFail("logout failed");
			throw new FailedLoginException();
		}
	}
}
