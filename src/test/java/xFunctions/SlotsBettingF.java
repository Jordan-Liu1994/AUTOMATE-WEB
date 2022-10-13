package xFunctions;

import javax.security.auth.login.FailedLoginException;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Location;
import org.sikuli.script.Mouse;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import xCommonUtilities.ActionBuilder;
import xCommonUtilities.GenerateReports;

public class SlotsBettingF {

	ActionBuilder actionBuilder = new ActionBuilder();
	GenerateReports generateReports = new GenerateReports();

	String userDir = System.getProperty("user.dir");
	String imageFilePath = userDir + "\\src\\test\\resources\\images\\Slots\\";

	Pattern reduceBetAmount = new Pattern(imageFilePath + "reduceBetAmount.png");
	Pattern betButton = new Pattern(imageFilePath + "betButton.png");
	Pattern settingsButton = new Pattern(imageFilePath + "settingsButton.png");
	Pattern betRecordButton = new Pattern(imageFilePath + "betRecordButton.png");
	Pattern betRecordButton2 = new Pattern(imageFilePath + "betRecordButton2.png");
	Pattern winBetButton = new Pattern(imageFilePath + "winBetButton.png");

	public void doSlotsBet() throws FailedLoginException, FindFailed {

		Screen s = new Screen(0);

		waitTimeLong();

		if (s.exists(reduceBetAmount) != null) {
			s.mouseMove();
			waitTime();
			Location x = Mouse.at();
			for (int b = 1; b <= 5; b++) {
				x.click();
			}
		} else {
			generateReports.setExtentTestFail("reduceBetAmount image not found");
			throw new FailedLoginException();
		}

		waitTime();

		if (s.exists(betButton) != null) {
			s.mouseMove();
			waitTime();
			Location x = Mouse.at();
			for (int b = 1; b <= 2; b++) {
				x.click();
			}
			s.mouseMove(-250, 0);
		} else {
			generateReports.setExtentTestFail("betButton image not found");
			throw new FailedLoginException();
		}

		waitTimeLong();

//		if (s.exists(winBetButton, 10) != null) {
//			s.mouseMove();
//			waitTime();
//			x = Mouse.at();
//			r = x.grow(150,150);
//			r.highlightOn();
//			for (int b = 1; b <= 3; b++) {
//				r.click();
//			}
//			r.highlightOff();
//			r.click();
//		} else {
//			String noWin = "Never win";
//			generateReports.setExtentTestSkip(noWin);
//		}

		waitTime();

		if (s.exists(settingsButton) != null) {
			s.mouseMove();
			waitTime();
			Location x = Mouse.at().click();
		} else {
			generateReports.setExtentTestFail("settingsButton image not found");
			throw new FailedLoginException();
		}

		waitTime();

		if (s.exists(betRecordButton, 15) != null) {
			s.mouseMove();
			waitTime();
			Location x = Mouse.at().click();
		} else {
			generateReports.setExtentTestSkip("betRecordButton image not found");
		}

		if (s.exists(betRecordButton2, 15) != null) {
			s.mouseMove();
			waitTime();
			Location x = Mouse.at().click();
		} else {
			generateReports.setExtentTestSkip("betRecordButton2 image not found");
		}
	}

	public void waitTimeLong() {
		try {
			Thread.sleep(7500);
			System.out.println("Wait time over");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void waitTime() {
		try {
			Thread.sleep(3000);
			System.out.println("Wait time over");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}