package testSetupRunner;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Location;
import org.sikuli.script.Mouse;
import org.sikuli.script.Pattern;
import org.sikuli.script.Region;
import org.sikuli.script.Screen;

public class TryToCrackCaptcha19Stage {

	public static void main(String[] args) throws FindFailed, AWTException {

		String userDirectory = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", userDirectory + "\\src\\test\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
//		driver.get("https://wltestmembersite.the777888.com/");
		driver.get("https://new19membersite.the777888.com/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		String userDir = System.getProperty("user.dir");
		String imageFilePath = userDir + "\\crackCaptcha\\";

		Pattern numberCaptcha = new Pattern(imageFilePath + "numberCaptcha.png");

		Screen s;
		Region r;
		for (int number = 0; number <= 10; number++) {
			try {
				WebDriverWait wait = new WebDriverWait(driver, 30);
				for (int zzz = 0; zzz <= 10; zzz++) {
					WebElement elementA = driver.findElement(By.xpath("//label[@for='aip_" + zzz + "']//div[@class='checkbox']//*[name()='svg']"));
					wait.until(ExpectedConditions.visibilityOf(elementA));
					elementA.click();
					WebElement elementA2 = driver.findElement(By.xpath("//div[@class='modal fade web_announcement_image_popout show']//button[@aria-label='Close']"));
					elementA2.click();
					waitTime();
					if (driver.findElement(By.xpath("//label[@for='normal_announcement_radio']")).isDisplayed()) {
						System.out.println("end announcement");
						break;
					}
				}

				WebElement elementAA = driver.findElement(By.xpath("//label[@for='normal_announcement_radio']"));
				wait.until(ExpectedConditions.visibilityOf(elementAA));
				if (elementAA.isDisplayed()) {
					elementAA.click();

					WebElement elementAA2 = driver.findElement(By.xpath("//div[@class='modal fade large wna_style show']//button[@aria-label='Close']"));
					elementAA2.click();
					break;
				} else {
					driver.navigate().refresh();
				}
			} catch (NoSuchElementException e) {
				e.printStackTrace();
			}
		}

		for (int z = 0; z <= 10; z++) {

			WebDriverWait wait = new WebDriverWait(driver, 30);

			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			WebElement element = driver.findElement(By.xpath("//a[@class='register']"));
			wait.until(ExpectedConditions.visibilityOf(element));
			element.click();

			waitTime();

			WebElement captchaWeb = driver.findElement(By.xpath("(//img[@class='renewCaptcha b4-input-height w-100'])[1]"));
			Actions actions = new Actions(driver);
			actions.moveToElement(captchaWeb);
			actions.perform();
			waitTime();
			waitTime();
			waitTime();
			waitTime();
			waitTime();
			Point loc = captchaWeb.getLocation();
			System.out.println("x = " + loc.getX());
			System.out.println("y = " + loc.getY());
			Robot robo = new Robot();
			robo.mouseMove(loc.getX(), loc.getY());
			Location x = Mouse.at();
			System.out.println(x);
//			Robot robo = new Robot();
//			robo.mouseMove(loc.getX(), loc.getY());

//			s = new Screen();
//			Location x = Mouse.at();
//			System.out.println(x);
//			r = new Region(x.x, x.y).grow();
//			System.out.println(r);
//			r.highlight();
//			try {
//				Thread.sleep(3000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			r.highlightOff();
			waitTime();
			waitTime();
			waitTime();
			waitTime();
			waitTime();
			driver.quit();
			break;
		}
	}

	public static void waitTime() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}