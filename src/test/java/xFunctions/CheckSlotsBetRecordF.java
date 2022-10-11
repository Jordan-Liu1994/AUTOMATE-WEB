package xFunctions;

import javax.security.auth.login.FailedLoginException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import xCommonUtilities.ActionBuilder;
import xCommonUtilities.GenerateReports;
import xCommonUtilities.Webdrivers;

public class CheckSlotsBetRecordF {

	Webdrivers driver = new Webdrivers();
	GenerateReports generateReports = new GenerateReports();
	ActionBuilder actionBuilder = new ActionBuilder();

	public void selectChangeTimeZone() {
		driver.setTimeOut();
		WebElement element = driver.getDriver().findElement(By.xpath("//p[@class='ga_timezone']"));
		String elementText = element.getText();
		if (element.isDisplayed()) {
			actionBuilder.moveToElementAndClick(element);
			generateReports.setExtentTestInfo(elementText);

			driver.setTimeOut();
			WebElement element2 = driver.getDriver().findElement(By.xpath("//span[@class='ga_timezone_beijing']"));
			String element2Text = element2.getText();
			if (element2.isDisplayed()) {
				actionBuilder.moveToElementAndClick(element2);
				generateReports.setExtentTestInfo(element2Text);
			}
		} else {
			generateReports.setExtentTestFail(elementText);
		}
	}

	public void selectToday() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.setTimeOut();
		WebElement element = driver.getDriver().findElement(By.xpath("//span[@class='ga_quicksearch_today']"));
		String elementText = element.getText();
		if (element.isDisplayed()) {
			actionBuilder.moveToElementAndClick(element);
			generateReports.setExtentTestInfo(elementText);
		} else {
			generateReports.setExtentTestFail(elementText);
		}
	}

	public void selectGameBetRecordDetail(String game) {
		driver.setTimeOut();
		WebElement element = driver.getDriver().findElement(By.xpath("(//div[@class='main-title'][contains(text(),'" + game + "')])[1]"));
		String elementText = element.getText();
		if (element.isDisplayed()) {
			actionBuilder.moveToElement(element);
			element.click();
			generateReports.setExtentTestInfo(elementText);
		} else {
			generateReports.setExtentTestFail(elementText);
		}
	}
}