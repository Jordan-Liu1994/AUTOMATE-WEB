package xFunctions;

import javax.security.auth.login.FailedLoginException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import xCommonUtilities.ActionBuilder;
import xCommonUtilities.GenerateReports;
import xCommonUtilities.IterateWindow;
import xCommonUtilities.Webdrivers;

public class SelectSlotsGameAndBetF {

	Webdrivers driver = new Webdrivers();
	GenerateReports generateReports = new GenerateReports();
	ActionBuilder actionBuilder = new ActionBuilder();
	IterateWindow iterateWindow = new IterateWindow();

	String parentWindow;

	public void selectSlotsGame(String game) throws FailedLoginException {
		parentWindow = driver.getDriver().getWindowHandle();
		System.out.println("In " + parentWindow);

		try {
			driver.setTimeOut();
			WebElement element = driver.getDriver().findElement(By.xpath("//div[contains(text(),'" + game + "')]"));
			String elementText = element.getText();
			if (element.isDisplayed()) {
				actionBuilder.moveToElementAndClick(element);
				generateReports.setExtentTestInfo(elementText);
			}
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			generateReports.setExtentTestSkip(game + " skip");
		}
	}
}