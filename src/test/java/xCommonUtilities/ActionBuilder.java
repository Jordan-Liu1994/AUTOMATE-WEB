package xCommonUtilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionBuilder {

	Webdrivers driver = new Webdrivers();

	public void moveToElement(WebElement element) {
		Actions builder = new Actions(driver.getDriver());
		builder.moveToElement(element).build().perform();
	}
	
	public void moveToElementAndClick(WebElement element) {
		Actions builder = new Actions(driver.getDriver());
		builder.moveToElement(element).click().build().perform();
	}
}
