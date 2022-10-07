package xFunctions;

import javax.security.auth.login.FailedLoginException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import xCommonUtilities.GenerateReports;
import xCommonUtilities.Webdrivers;

public class LoginF {

	Webdrivers driver = new Webdrivers();
	GenerateReports generateReports = new GenerateReports();
	
	static String attribute = "placeholder";
	static String space = " - ";
	
	public void selectLoginOption() throws FailedLoginException {
		driver.setTimeOut();
		WebElement element = driver.getDriver().findElement(By.xpath("//div[@id='header_login']"));
		String elementText = element.getText();
		if (element.isDisplayed()) {
			element.click();
			generateReports.setExtentTestInfo(elementText);
		} else {
			generateReports.setExtentTestFail(elementText);
			throw new FailedLoginException();
		}
	}
	
	public void setUsername(String username) {
		driver.setTimeOut();
		WebElement element = driver.getDriver().findElement(By.id("username"));
		driver.setWait(element);
		String elementText = element.getAttribute(attribute);
		if (element.isDisplayed()) {
			element.clear();
			element.sendKeys(username);
			generateReports.setExtentTestInfo(elementText + space + username);
		} else {
			generateReports.setExtentTestFail(elementText);
		}
	}

	public void setPassword(String password) {
		driver.setTimeOut();
		WebElement element = driver.getDriver().findElement(By.id("password"));
		String elementText = element.getAttribute(attribute);
		if (element.isDisplayed()) {
			element.clear();
			element.sendKeys(password);
			generateReports.setExtentTestInfo(elementText + space + password);
		} else {
			generateReports.setExtentTestFail(elementText);
		}
	}

	public void selectLogin() throws FailedLoginException {
		driver.setTimeOut();
		WebElement element = driver.getDriver().findElement(By.id("login_popup_btn"));
		String elementText = element.getText();
		if (element.isDisplayed()) {
			element.click();
			generateReports.setExtentTestInfo(elementText);
		} else {
			generateReports.setExtentTestFail(elementText);
			throw new FailedLoginException();
		}
	}

	public void getVerifyLogin(String username) throws FailedLoginException {
		driver.setTimeOut();
		WebElement element = driver.getDriver().findElement(By.xpath("//div[@class='header_after_login_id']//a[contains(text(),'" + username + "')]"));
		String elementText = element.getText();
		if (element.isDisplayed()) {
			generateReports.setExtentTestInfo(elementText + space + "login verified");
		} else {
			generateReports.setExtentTestFail("login failed");
			throw new FailedLoginException();
		}
	}
}