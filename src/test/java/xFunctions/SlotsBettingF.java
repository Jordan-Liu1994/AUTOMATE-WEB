package xFunctions;

import javax.security.auth.login.FailedLoginException;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Location;
import org.sikuli.script.Mouse;
import org.sikuli.script.Pattern;
import org.sikuli.script.Region;
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

	Region r;
	Screen s;

	public void reduceBetAmount() throws FailedLoginException, FindFailed {
		s = new Screen(0);

		waitTimeLong();

		if (s.exists(reduceBetAmount) != null) {
			s.mouseMove();
			waitTime("reduceBetAmount");
			Location x = Mouse.at();
			r = x.grow(100, 100);
			r.highlight("green");
			for (int b = 1; b <= 5; b++) {
				r.click();
			}
		} else {
			generateReports.setExtentTestFail("reduceBetAmount image not found");
			throw new FailedLoginException();
		}
		waitTime("reduceBetAmount");
		r.highlightOff();
	}

	public void selectBetButton() throws FailedLoginException, FindFailed {
		s = new Screen(0);

		if (s.exists(betButton) != null) {
			s.mouseMove();
			waitTime("betButton");
			Location x = Mouse.at();
			r = x.grow(100, 100);
			r.highlight("green");
			for (int b = 1; b <= 2; b++) {
				r.click();
			}
			s.mouseMove(-250, 0);
		} else {
			generateReports.setExtentTestFail("betButton image not found");
			throw new FailedLoginException();
		}
		waitTimeLong();
		r.highlightOff();
	}

	public void selectWinBet() throws FailedLoginException, FindFailed {
		s = new Screen(0);

		if (s.exists(winBetButton) != null) {
			s.mouseMove();
			waitTime("winBetButton");
			Location x = Mouse.at();
			r = x.grow(100, 100);
			r.highlight("green");
			r.click();
		} else {
			String noWin = "Never win";
			generateReports.setExtentTestSkip(noWin);
		}
		waitTime("winBetButton");
		r.highlightOff();
	}

	public void selectSettingsButton() throws FailedLoginException, FindFailed {
		s = new Screen(0);

		if (s.exists(settingsButton) != null) {
			s.mouseMove();
			waitTime("settingsButton");
			Location x = Mouse.at();
			r = x.grow(100, 100);
			r.highlight("green");
			r.click();
		} else {
			generateReports.setExtentTestFail("settingsButton image not found");
			throw new FailedLoginException();
		}
		waitTime("settingsButton");
		r.highlightOff();
	}

	public void selectBetRecordButton2() throws FailedLoginException, FindFailed {
		s = new Screen(0);

		if (s.exists(betRecordButton2) != null) {
			s.mouseMove();
			waitTime("betRecordButton2");
			Location x = Mouse.at();
			r = x.grow(100, 100);
			r.highlight("green");
			r.click();
		} else {
			generateReports.setExtentTestSkip("betRecordButton2 image not found");
		}
		r.highlightOff();
	}

	public void waitTimeLong() {
		try {
			Thread.sleep(5000);
			System.out.println("Wait time over");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void waitTime(String x) {
		try {
			Thread.sleep(1500);
			System.out.println("Wait time over " + x);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}