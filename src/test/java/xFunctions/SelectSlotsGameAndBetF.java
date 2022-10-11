package xFunctions;

import java.util.ArrayList;

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

	public void selectSlotsGame(String game1, String game2, String game3) throws FailedLoginException {
		parentWindow = driver.getDriver().getWindowHandle();
		System.out.println("In " + parentWindow);

		ArrayList<String> gameList = new ArrayList<String>();
		gameList.add(game1);
		gameList.add(game2);
		gameList.add(game3);

		for (int i = 0; i <= 2; i++) {
			String game = gameList.get(i);
			try {
				driver.setTimeOut();
				WebElement element = driver.getDriver().findElement(By.xpath("//div[contains(text(),'" + game + "')]"));
				String elementText = element.getText();
				if (element.isDisplayed()) {
					actionBuilder.moveToElement(element);
					generateReports.setExtentTestInfo(elementText);
				}
			} catch (NoSuchElementException e) {
				e.printStackTrace();
				generateReports.setExtentTestSkip(game + " skip");
			}
			iterateWindow.iterateToGameWindow();
			iterateWindow.iterateToMainWindow(parentWindow);
		}
	}
}