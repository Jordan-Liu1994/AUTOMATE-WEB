package xCommonUtilities;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Webdrivers {

	static String userDirectory = System.getProperty("user.dir");
	static String driverFolderPath = userDirectory + ".\\src\\test\\resources\\drivers\\";

	static WebDriver driver;

	public WebDriver getDriver() {
		return driver;
	}

	public void setChromeDriverProperty() {
		System.setProperty("webdriver.chrome.driver", driverFolderPath + "chromedriver.exe");
	}

	public void startChromeDriver() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	public void setFireFoxDriverProperty() {
		System.setProperty("webdriver.gecko.driver", driverFolderPath + "geckodriver.exe");
	}

	public void startFireFoxDriver() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	static OperaDriver browser;

	public void setOperaDriverProperty() {
		System.setProperty("webdriver.opera.driver", driverFolderPath + "operadriver.exe");
	}

	public void startOperaDriver() {
		driver = new OperaDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	public void setEdgeDriverProperty() {
		System.setProperty("webdriver.edge.driver", driverFolderPath + "msedgedriver.exe");
	}

	public void startEdgeDriver() {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	public void doRefresh() {
		driver.navigate().refresh();
	}

	public void getURL(String url) {
		driver.get(url);
	}

	public void setTimeOut() {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	public void setWait(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void setActionMoveTo(WebElement element) {
		Actions builder = new Actions(driver);
		builder.moveToElement(element).build().perform();
	}

	public void closeBrowser() {
		driver.close();
	}

	public void stopDriver() {
		driver.quit();
	}
}
