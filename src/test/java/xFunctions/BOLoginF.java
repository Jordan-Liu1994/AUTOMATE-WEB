package xFunctions;

import javax.security.auth.login.FailedLoginException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import xCommonUtilities.GenerateReports;
import xCommonUtilities.Webdrivers;

public class BOLoginF {

	Webdrivers driver = new Webdrivers();
	GenerateReports generateReports = new GenerateReports();

	static String attribute = "placeholder";
	static String space = " - ";

	public void setUsername(String usernameBO) {
		driver.setTimeOut();
		WebElement element = driver.getDriver().findElement(By.id("userEmail"));
		driver.setWait(element);
		String elementText = element.getAttribute(attribute);
		if (element.isDisplayed()) {
			element.clear();
			element.sendKeys(usernameBO);
			generateReports.setExtentTestInfo(elementText + space + usernameBO);
		} else {
			generateReports.setExtentTestFail(elementText);
		}
	}

	public void setPassword(String password) {
		driver.setTimeOut();
		WebElement element = driver.getDriver().findElement(By.id("userPassword"));
		String elementText = element.getAttribute(attribute);
		if (element.isDisplayed()) {
			element.clear();
			element.sendKeys(password);
			generateReports.setExtentTestInfo(elementText + space + password);
		} else {
			generateReports.setExtentTestFail(elementText);
		}
	}

	public void setOtp() {
		driver.setTimeOut();
		WebElement element = driver.getDriver().findElement(By.id("totp"));
		String elementText = element.getAttribute(attribute);
		if (element.isDisplayed()) {
			element.clear();
			element.sendKeys("123456");
			generateReports.setExtentTestInfo(elementText + space + "123456");
		} else {
			generateReports.setExtentTestFail(elementText);
		}
	}

	public void selectLogin() throws FailedLoginException {
		driver.setTimeOut();
		WebElement element = driver.getDriver().findElement(By.xpath("//button[@type='button']"));
		String elementText = element.getText();
		if (element.isDisplayed()) {
			element.click();
			generateReports.setExtentTestInfo(elementText);
		} else {
			generateReports.setExtentTestFail(elementText);
			throw new FailedLoginException();
		}
	}

	public void getVerifyLogin(String usernameBO) throws FailedLoginException {
		driver.setTimeOut();
		WebElement element = driver.getDriver().findElement(By.xpath("//a[normalize-space()='" + usernameBO + "']"));
		String elementText = element.getText();
		if (element.isDisplayed()) {
			generateReports.setExtentTestInfo(elementText + space + "login verified");
		} else {
			generateReports.setExtentTestFail("login failed");
			throw new FailedLoginException();
		}
	}
}