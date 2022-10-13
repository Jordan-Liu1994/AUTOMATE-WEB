package xFunctions;

import javax.security.auth.login.FailedLoginException;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import xCommonUtilities.GenerateReports;

public class SlotsBettingF {

	GenerateReports generateReports = new GenerateReports();

	public void doSlotsBet() throws FailedLoginException, FindFailed {

		Screen s = new Screen(0);
		String userDir = System.getProperty("user.dir");
		String imageFilePath = userDir + "\\src\\test\\resources\\images\\Slots\\";

		Pattern reduceBetAmount = new Pattern(imageFilePath + "reduceBetAmount.png").similar(0.6);
		Pattern betButton = new Pattern(imageFilePath + "betButton.png");
		Pattern settingsButton = new Pattern(imageFilePath + "settingsButton.png");
		Pattern betRecordButton = new Pattern(imageFilePath + "betRecordButton.png");
		Pattern betRecordButton2 = new Pattern(imageFilePath + "betRecordButton2.png");
		Pattern winBetButton = new Pattern(imageFilePath + "winBetButton.png");

		waitTimeLong();

		if (s.exists(reduceBetAmount) != null) {
			s.mouseMove();
			for (int b = 1; b <= 5; b++) {
				s.click();
			}
		} else {
			generateReports.setExtentTestFail("Image not found");
			throw new FailedLoginException();
		}

		if (s.exists(betButton) != null) {
			s.mouseMove();
			s.click();
			s.mouseMove(-250, 0);
		} else {
			generateReports.setExtentTestFail("Image not found");
			throw new FailedLoginException();
		}

		waitTimeLong();

		if (s.exists(winBetButton, 10) != null) {
			s.mouseMove();
			s.click();
		} else {
			String noWin = "Never win";
			generateReports.setExtentTestSkip(noWin);
		}

		if (s.exists(settingsButton) != null) {
			s.mouseMove();
			s.click();
		} else {
			generateReports.setExtentTestFail("Image not found");
			throw new FailedLoginException();
		}

		if (s.exists(betRecordButton, 15) != null) {
			s.mouseMove();
			s.click();
		} else if (s.exists(betRecordButton2, 15) != null) {
			s.mouseMove();
			s.click();
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
			Thread.sleep(1000);
			System.out.println("Wait time over");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}