package xFunctions;

import javax.security.auth.login.FailedLoginException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import xCommonUtilities.ActionBuilder;
import xCommonUtilities.GenerateReports;
import xCommonUtilities.Webdrivers;

public class SelectLiveBBINGameF {

	Webdrivers driver = new Webdrivers();
	GenerateReports generateReports = new GenerateReports();
	ActionBuilder actionBuilder = new ActionBuilder();

	public void hoverGame() throws FailedLoginException {
		driver.setTimeOut();
		WebElement element = driver.getDriver().findElement(By.xpath("(//img[@role='presentation'])[2]"));
		if (element.isDisplayed()) {
			actionBuilder.moveToElement(element);
		} else {
			generateReports.setExtentTestFail("Cannot find game");
			throw new FailedLoginException();
		}
	}

	public void selectGame() throws FailedLoginException {
		driver.setTimeOut();
		WebElement element = driver.getDriver().findElement(By.xpath("(//a[@role='button'][normalize-space()='BC1'])[2]"));
		String elementText = element.getText();
		if (element.isDisplayed()) {
			actionBuilder.moveToElementAndClick(element);
			generateReports.setExtentTestInfo(elementText);
		} else {
			generateReports.setExtentTestFail(elementText);
			throw new FailedLoginException();
		}
	}
}