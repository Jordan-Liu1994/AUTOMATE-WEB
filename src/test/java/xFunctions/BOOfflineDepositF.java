package xFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import xCommonUtilities.GenerateReports;
import xCommonUtilities.Webdrivers;

public class BOOfflineDepositF {

	Webdrivers driver = new Webdrivers();
	GenerateReports generateReports = new GenerateReports();

	static String attribute = "placeholder";
	static String space = " - ";

	public void hoverFinanceManagement() {
		WebElement element = driver.getDriver().findElement(By.xpath("//body/div/div/div/nav/div/div[1]/ul[1]/li[4]/a[1]"));
		driver.setWait(element);
		String elementText = element.getText();
		if (element.isDisplayed()) {
			driver.setActionMoveTo(element);
			generateReports.setExtentTestInfo(elementText);
		} else {
			generateReports.setExtentTestFail(elementText);
		}
	}

	public void selectOfflineDepositVerification() {
		WebElement element = driver.getDriver().findElement(By.xpath("//li[4]//ul[1]//li[7]//a[1]"));
		driver.setWait(element);
		String elementText = element.getText();
		if (element.isDisplayed()) {
			driver.setActionMoveToAndClick(element);
			generateReports.setExtentTestInfo(elementText);
		} else {
			generateReports.setExtentTestFail(elementText);
		}
	}

	public void verifyOfflineDepositVerificationTabOpened() {
		WebElement element = driver.getDriver().findElement(By.xpath("(//div)[21]"));
		driver.setWait(element);
		String elementText = element.getText();
		if (element.isDisplayed()) {
			driver.setActionMoveTo(element);
			generateReports.setExtentTestInfo(elementText + space + "opened & verified");
		} else {
			generateReports.setExtentTestFail(elementText);
		}
	}

	public void setUsernameToSearch(String username) {
		WebElement element = driver.getDriver().findElement(By.xpath("//*[@id=\"filter_form\"]/div[1]/label/span/span[1]/span/ul/li/input"));
		driver.setWait(element);
		String elementText = element.getAttribute(attribute);
		if (element.isDisplayed()) {
			driver.setActionMoveToAndClick(element);
			element.sendKeys(username);
			generateReports.setExtentTestInfo(elementText + space + username);
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			element.sendKeys(Keys.ENTER);
			element.sendKeys(Keys.ESCAPE);
		} else {
			generateReports.setExtentTestFail(elementText);
		}
	}
	
	public void selectSearchButton() {
		WebElement element = driver.getDriver().findElement(By.id("search_credit_btn"));
		driver.setWait(element);
		String elementText = element.getText();
		if (element.isDisplayed()) {
			driver.setActionMoveToAndClick(element);
			generateReports.setExtentTestInfo(elementText);
		} else {
			generateReports.setExtentTestFail(elementText);
		}
	}
}