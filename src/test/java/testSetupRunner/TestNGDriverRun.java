package testSetupRunner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNGDriverRun {

	static WebDriver driver;

	@BeforeClass
	public void setup() {
		String userDirectory = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", userDirectory + "\\src\\test\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}

	@Test
	public void test() {
		driver.get("http://www.youtube.com");
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@AfterClass
	public void stop() {
		driver.quit();
	}
}