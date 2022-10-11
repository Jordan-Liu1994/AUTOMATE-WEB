package xFunctions;

import javax.security.auth.login.FailedLoginException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import xCommonUtilities.GenerateRandomNumbers;
import xCommonUtilities.GenerateReports;
import xCommonUtilities.Webdrivers;

public class RegisterF {

	Webdrivers driver = new Webdrivers();
	GenerateReports generateReports = new GenerateReports();
	GenerateRandomNumbers generateRandomNumbers = new GenerateRandomNumbers();

	static String attribute = "placeholder";
	static String space = " - ";
	static String username;
	static String password = "test123";
	static String captcha = "123456";

	public void selectRegisterOption() throws FailedLoginException {
		driver.setTimeOut();
		WebElement element = driver.getDriver().findElement(By.id("header_register"));
		String elementText = element.getText();
		if (element.isDisplayed()) {
			element.click();
			generateReports.setExtentTestInfo(elementText);
		} else {
			generateReports.setExtentTestFail(elementText);
			throw new FailedLoginException();
		}
	}

	public void setUsername() {
		driver.setTimeOut();
		WebElement element = driver.getDriver().findElement(By.id("r_username"));
		driver.setWait(element);
		String elementText = element.getAttribute(attribute);
		if (element.isDisplayed()) {
			element.clear();
			username = "qctester" + generateRandomNumbers.generateRandomNumbers();
			element.sendKeys(username);
			generateReports.setExtentTestInfo(elementText + space + username);
		} else {
			generateReports.setExtentTestFail(elementText);
		}
	}

	public void setPassword() {
		driver.setTimeOut();
		WebElement element = driver.getDriver().findElement(By.id("r_password"));
		String elementText = element.getAttribute(attribute);
		if (element.isDisplayed()) {
			element.clear();
			element.sendKeys(password);
			generateReports.setExtentTestInfo(elementText + space + password);
		} else {
			generateReports.setExtentTestFail(elementText);
		}
	}

	public void setCaptcha() {
		try {
			driver.setTimeOut();
			WebElement element = driver.getDriver().findElement(By.id("ipt_code3"));
			String elementText = element.getAttribute(attribute);
			if (element.isDisplayed()) {
				element.clear();
				element.sendKeys(captcha);
				generateReports.setExtentTestInfo(elementText + space + captcha);
			} else {
				generateReports.setExtentTestFail(elementText);
			}
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			generateReports.setExtentTestSkip("captcha skip");
		}
	}

	public void selectRegister() throws FailedLoginException {
		driver.setTimeOut();
		WebElement element = driver.getDriver().findElement(By.id("register_btn"));
		String elementText = element.getText();
		if (element.isDisplayed()) {
			element.click();
			generateReports.setExtentTestInfo(elementText);
		} else {
			generateReports.setExtentTestFail(elementText);
			throw new FailedLoginException();
		}
	}

	public void getVerifyRegister() throws FailedLoginException {
		driver.setTimeOut();
		WebElement element = driver.getDriver().findElement(By.xpath("//div[@class='header_after_login_id']//a[contains(text(),'" + username + "')]"));
		String elementText = element.getText();
		if (element.isDisplayed()) {
			generateReports.setExtentTestInfo(elementText + space + "register verified");
		} else {
			generateReports.setExtentTestFail("register failed");
			throw new FailedLoginException();
		}
	}
}
