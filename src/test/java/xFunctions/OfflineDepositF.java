package xFunctions;

import javax.security.auth.login.FailedLoginException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import xCommonUtilities.GenerateReports;
import xCommonUtilities.Webdrivers;

public class OfflineDepositF {

	Webdrivers driver = new Webdrivers();
	GenerateReports generateReports = new GenerateReports();

	static String attribute = "placeholder";
	static String space = " - ";

	public void hoverUsername(String username) {
		driver.setTimeOut();
		WebElement element = driver.getDriver().findElement(By.xpath("//div[@class='header_after_login_id']//a[contains(text(),'" + username + "')]"));
		if (element.isDisplayed()) {
			driver.setActionMoveTo(element);
		} else {
			generateReports.setExtentTestFail("hoverUsername failed");
		}
	}

	public void selectDepositOption() throws FailedLoginException {
		driver.setTimeOut();
		WebElement element = driver.getDriver().findElement(By.xpath("//div[@id='change_wallet_notice']//div[@class='nav_label']"));
		driver.setWait(element);
		String elementText = element.getText();
		if (element.isDisplayed()) {
			driver.setActionMoveToAndClick(element);
			generateReports.setExtentTestInfo(elementText);
		} else {
			generateReports.setExtentTestFail("selectDepositOption failed");
			throw new FailedLoginException();
		}
	}

	public void selectCloseDepositInfoPopUp() {
		driver.setTimeOut();
		WebElement element = driver.getDriver().findElement(By.xpath("//button[@class='btn_major']"));
		driver.setWait(element);
		String elementText = element.getText();
		if (element.isDisplayed()) {
			driver.setActionMoveToAndClick(element);
			generateReports.setExtentTestInfo(elementText);
		} else {
			generateReports.setExtentTestSkip("selectCloseDepositInfoPopUp failed");
		}
	}

	public void selectOfflineDeposit() {
		driver.setTimeOut();
		WebElement element = driver.getDriver().findElement(By.xpath("(//div[@class='method_name'])[1]"));
		driver.setWait(element);
		String elementText = element.getText();
		if (element.isDisplayed()) {
			driver.setActionMoveToAndClick(element);
			generateReports.setExtentTestInfo(elementText);
		} else {
			generateReports.setExtentTestFail("selectOfflineDeposit failed");
		}
	}

	public void selectOfflineDepositMethod() {
		driver.setTimeOut();
		WebElement element = driver.getDriver().findElement(By.xpath("(//li[@class='recommend'])[1]"));
		driver.setWait(element);
		String elementText = element.getText();
		if (element.isDisplayed()) {
			driver.setActionMoveToAndClick(element);
			generateReports.setExtentTestInfo(elementText);
		} else {
			generateReports.setExtentTestFail("selectOfflineDepositMethod failed");
		}
	}

	public void inputDepositAmount(String depositAmount) {
		driver.setTimeOut();
		WebElement element = driver.getDriver().findElement(By.id("deposit_amount"));
		driver.setWait(element);
		String elementText = element.getAttribute(attribute);
		if (element.isDisplayed()) {
			element.sendKeys(depositAmount);
			generateReports.setExtentTestInfo(elementText + space + depositAmount);
		} else {
			generateReports.setExtentTestFail("inputDepositAmount failed");
		}
	}

	public void inputDepositName(String depositName) {
		driver.setTimeOut();
		WebElement element = driver.getDriver().findElement(By.id("real_name"));
		driver.setWait(element);
		String elementText = element.getAttribute(attribute);
		if (element.isDisplayed()) {
			element.sendKeys(depositName);
			generateReports.setExtentTestInfo(elementText + space + depositName);
		} else {
			generateReports.setExtentTestFail("inputDepositName failed");
		}
	}

	public void checkJoinPromoOrNoJoinPromo(String joinOrNo) {
		if (joinOrNo.equalsIgnoreCase("yes")) {
			driver.setTimeOut();
			WebElement element = driver.getDriver().findElement(By.id("radio_txt"));
			driver.setWait(element);
			String elementText = element.getText();
			if (element.isDisplayed()) {
				driver.setActionMoveToAndClick(element);
				generateReports.setExtentTestInfo(elementText + space + joinOrNo);
			} else {
				generateReports.setExtentTestInfo("Joined promo");
			}
		} else if (joinOrNo.equalsIgnoreCase("no")) {
			driver.setTimeOut();
			WebElement element = driver.getDriver().findElement(By.id("radio_txt_false"));
			driver.setWait(element);
			String elementText = element.getText();
			if (element.isDisplayed()) {
				driver.setActionMoveToAndClick(element);
				generateReports.setExtentTestInfo(elementText + space + joinOrNo);
			} else {
				generateReports.setExtentTestInfo("No join promo");
			}
		} else {
			generateReports.setExtentTestFail("checkJoinPromoOrNoJoinPromo failed");

		}
	}
	
	public void checkActualAmountReceivedAfterDeposit() {
		driver.setTimeOut();
		WebElement element = driver.getDriver().findElement(By.id("actual_amount"));
		driver.setWait(element);
		String elementText = element.getText();
		if (element.isDisplayed()) {
			driver.setActionMoveTo(element);
			generateReports.setExtentTestInfo(elementText);
		} else {
			generateReports.setExtentTestFail("checkActualAmountReceivedAfterDeposit failed");
		}
	}
	
	public void selectDepositButton() {
		driver.setTimeOut();
		WebElement element = driver.getDriver().findElement(By.id("payment"));
		driver.setWait(element);
		String elementText = element.getText();
		if (element.isDisplayed()) {
			driver.setActionMoveToAndClick(element);
			generateReports.setExtentTestInfo(elementText);
		} else {
			generateReports.setExtentTestFail("selectDepositButton failed");
		}
	}
}