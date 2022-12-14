package xFunctions;

import javax.security.auth.login.FailedLoginException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import xCommonUtilities.ActionBuilder;
import xCommonUtilities.GenerateReports;
import xCommonUtilities.Webdrivers;

public class SelectGameCategoryAndVendorF {

	Webdrivers driver = new Webdrivers();
	GenerateReports generateReports = new GenerateReports();
	ActionBuilder actionBuilder = new ActionBuilder();

	public void selectGameCategory(String number) throws FailedLoginException {
		driver.setTimeOut();
		WebElement element = driver.getDriver().findElement(By.xpath("(//div[@class='header_menu_item'])[" + number + "]"));
		String elementText = element.getText();
		if (element.isDisplayed()) {
			actionBuilder.moveToElementAndClick(element);
			generateReports.setExtentTestInfo(elementText);
		} else {
			generateReports.setExtentTestFail(elementText);
			throw new FailedLoginException();
		}
	}

	public void selectSlotsGameVendor(String gameVendor) throws FailedLoginException {
		try {
			driver.setTimeOut();
			WebElement element = driver.getDriver().findElement(By.xpath("//div[contains(@class,'content_block')][normalize-space()='" + gameVendor + "']"));
			String elementText = element.getText();
			if (element.isDisplayed()) {
				actionBuilder.moveToElementAndClick(element);
				generateReports.setExtentTestInfo(elementText);
			} else {
				generateReports.setExtentTestFail(elementText);
				throw new FailedLoginException();
			}
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			generateReports.setExtentTestSkip(gameVendor + " skip");
		}
	}

	public void selectLiveGameVendor(String gameVendor) throws FailedLoginException {
		try {
			driver.setTimeOut();
			WebElement element = driver.getDriver().findElement(By.xpath("(//div[contains(text(),'" + gameVendor + "')])[2]"));
			String elementText = element.getText();
			if (element.isDisplayed()) {
				actionBuilder.moveToElementAndClick(element);
				generateReports.setExtentTestInfo(elementText);
			} else {
				generateReports.setExtentTestFail(elementText);
				throw new FailedLoginException();
			}
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			generateReports.setExtentTestSkip(gameVendor + " skip");
		}
	}

	public void selectFishGameVendor(String gameVendor) throws FailedLoginException {
		try {
			driver.setTimeOut();
			WebElement element = driver.getDriver().findElement(By.xpath("//div[contains(text(),'" + gameVendor + "')]"));
			String elementText = element.getText();
			if (element.isDisplayed()) {
				actionBuilder.moveToElementAndClick(element);
				generateReports.setExtentTestInfo(elementText);
			} else {
				generateReports.setExtentTestFail(elementText);
				throw new FailedLoginException();
			}
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			generateReports.setExtentTestSkip(gameVendor + " skip");
		}
	}
}