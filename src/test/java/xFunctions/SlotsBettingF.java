package xFunctions;

import javax.security.auth.login.FailedLoginException;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Location;
import org.sikuli.script.Mouse;
import org.sikuli.script.Pattern;
import org.sikuli.script.Region;
import org.sikuli.script.Screen;

import xCommonUtilities.GenerateReports;

public class SlotsBettingF {

	GenerateReports generateReports = new GenerateReports();

	String userDir = System.getProperty("user.dir");
	String imageFilePath = userDir + "\\src\\test\\resources\\images\\Slots\\";

	Pattern reduceBetAmount = new Pattern(imageFilePath + "reduceBetAmount.png").similar(0.6);
	Pattern betButton = new Pattern(imageFilePath + "betButton.png");
	Pattern settingsButton = new Pattern(imageFilePath + "settingsButton.png").similar(0.6);
	Pattern betRecordButton = new Pattern(imageFilePath + "betRecordButton.png");
	Pattern betRecordButton2 = new Pattern(imageFilePath + "betRecordButton2.png");
	Pattern winBetButton = new Pattern(imageFilePath + "winBetButton.png");
	
	Location x;
	Region r;
	
	public void doSlotsBet() throws FailedLoginException, FindFailed {

		Screen s = new Screen(0);
		
		waitTimeLong();

		if (s.exists(reduceBetAmount) != null) {
			s.find(reduceBetAmount);
			s.mouseMove();
			waitTime();
			x = Mouse.at();
			r = x.grow(150,150);
			r.highlightOn();
			for (int b = 1; b <= 5; b++) {
				r.click();
			}
			r.highlightOff();
		} else {
			generateReports.setExtentTestFail("Image not found");
			throw new FailedLoginException();
		}

		waitTime();
		
		if (s.exists(betButton) != null) {
			s.find(betButton);
			s.mouseMove();
			waitTime();
			x = Mouse.at();
			r = x.grow(150,150);
			r.highlightOn();
			r.click();
			s.mouseMove(-250, 0);
			r.highlightOff();
		} else {
			generateReports.setExtentTestFail("Image not found");
			throw new FailedLoginException();
		}

		waitTimeLong();

		if (s.exists(winBetButton, 10) != null) {
			s.mouseMove();
			waitTime();
			x = Mouse.at();
			r = x.grow(150,150);
			r.highlightOn();
			r.click();
			r.highlightOff();
			r.click();
		} else {
			String noWin = "Never win";
			generateReports.setExtentTestSkip(noWin);
		}

		waitTime();
		
		if (s.exists(settingsButton) != null) {
			s.find(settingsButton);
			s.mouseMove();
			waitTime();
			x = Mouse.at();
			r = x.grow(150,150);
			r.highlightOn();
			r.click();
			r.highlightOff();
		} else {
			generateReports.setExtentTestFail("Image not found");
			throw new FailedLoginException();
		}

		waitTime();
		
		if (s.exists(betRecordButton, 15) != null) {
			s.find(betRecordButton);
			s.mouseMove();
			waitTime();
			x = Mouse.at();
			r = x.grow(150,150);
			r.highlightOn();
			r.click();
			r.highlightOff();
		} else if (s.exists(betRecordButton2, 15) != null) {
			s.find(betRecordButton2);
			s.mouseMove();
			waitTime();
			x = Mouse.at();
			r = x.grow(150,150);
			r.highlightOn();
			r.click();
			r.highlightOff();
		} else {
			generateReports.setExtentTestFail("Image not found");
		}
	}

	public void waitTimeLong() {
		try {
			Thread.sleep(5000);
			System.out.println("Wait time over");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void waitTime() {
		try {
			Thread.sleep(1500);
			System.out.println("Wait time over");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}