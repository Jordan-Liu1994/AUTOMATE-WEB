package testSetupRunner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.Button;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Location;
import org.sikuli.script.Pattern;
import org.sikuli.script.Region;
import org.sikuli.script.Screen;

public class TryToCrackCaptchaSlider {

	static String userDir = System.getProperty("user.dir");
	static String imageFilePath = userDir + "\\crackCaptchaImages\\";
	static String username = "tester1234567890";
	static String password = "tester123";
	static Screen s;
	static Region r;
	static Location x;
	static Pattern image1 = new Pattern(imageFilePath + "captchaSlider 1.png");
	static Pattern image1x = new Pattern(imageFilePath + "captchaSlider 1x.png");
	static Pattern image2 = new Pattern(imageFilePath + "captchaSlider 2.png");
	static Pattern image2x = new Pattern(imageFilePath + "captchaSlider 2x.png");
	static Pattern image3 = new Pattern(imageFilePath + "captchaSlider 3.png");
	static Pattern image3x = new Pattern(imageFilePath + "captchaSlider 3x.png");
	static Pattern image4 = new Pattern(imageFilePath + "captchaSlider 4.png");
	static Pattern image4x = new Pattern(imageFilePath + "captchaSlider 4x.png");
	static Pattern image5 = new Pattern(imageFilePath + "captchaSlider 5.png");
	static Pattern image5x = new Pattern(imageFilePath + "captchaSlider 5x.png");
	static WebDriver driver;
	static WebDriverWait wait;
	static Actions builder;

	public static void main(String[] args) throws FindFailed {
		System.setProperty("webdriver.chrome.driver", userDir + "\\src\\test\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://wltestmembersite.the777888.com/");

		wait = new WebDriverWait(driver, 30);

		for (int a = 0; a <= 10; a++) {

			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			WebElement element = driver.findElement(By.id("header_login"));
			wait.until(ExpectedConditions.visibilityOf(element));
			element.click();
			System.out.println("- Clicked login option");
			waitTime();

			WebElement element2 = driver.findElement(By.id("username"));
			element2.clear();
			element2.sendKeys(username);
			System.out.println("- Filled in " + username);

			WebElement element3 = driver.findElement(By.id("password"));
			element3.clear();
			element3.sendKeys(password);
			System.out.println("- Filled in " + password);

			WebElement element4 = driver.findElement(By.className("geetest_radar_tip_content"));
			element4.click();
			System.out.println("- Clicked captcha button");

			s = new Screen(0);
			waitTime();
			if (s.exists(image1) != null) {
				s.find(image1);
				s.mouseMove();
				s.mouseDown(Button.LEFT);
				waitTime();
				s.mouseMove(image1x);
				s.mouseUp();
				break;
			} else if (s.exists(image2) != null) {
				s.find(image2);
				s.mouseMove();
				s.mouseDown(Button.LEFT);
				waitTime();
				s.mouseMove(image2x);
				s.mouseUp();
				break;
			} else if (s.exists(image3) != null) {
				s.find(image3);
				s.mouseMove();
				s.mouseDown(Button.LEFT);
				waitTime();
				s.mouseMove(image3x);
				s.mouseUp();
				break;
			} else if (s.exists(image4) != null) {
				s.find(image4);
				s.mouseMove();
				s.mouseDown(Button.LEFT);
				waitTime();
				s.mouseMove(image4x);
				s.mouseUp();
				break;
			} else if (s.exists(image5) != null) {
				s.find(image5);
				s.mouseMove();
				s.mouseDown(Button.LEFT);
				waitTime();
				s.mouseMove(image5x);
				s.mouseUp();
				break;
			} else {
				System.out.println("Round = " + a);
				driver.navigate().refresh();
			}
		}
		waitTime();
		driver.quit();
	}

	public static void waitTime() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}