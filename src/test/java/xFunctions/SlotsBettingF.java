package xFunctions;

import javax.security.auth.login.FailedLoginException;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Location;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.SkipException;

import xCommonUtilities.GenerateReports;

public class SlotsBettingF {

	GenerateReports generateReports = new GenerateReports();

	Screen s;

	String userDir = System.getProperty("user.dir");

	public void doSlotsBet() throws FailedLoginException, FindFailed {
		String imageFilePath = userDir + "\\src\\test\\resources\\images\\slots.sikuli\\";
		Pattern reduceBetAmountButton = new Pattern(imageFilePath + "reduceBetAmountButton.png").similar(0.8);
		Pattern betButton = new Pattern(imageFilePath + "betButton.png").similar(0.5);
		Pattern betRecordButton = new Pattern(imageFilePath + "betRecordButton.png").similar(0.5);
		Pattern betRecordDetailButton = new Pattern(imageFilePath + "betRecordDetailButton-1.png");
		Pattern betRecordDetailButton2 = new Pattern(imageFilePath + "betRecordButton2.png");
		Pattern winBetButton = new Pattern(imageFilePath + "winBetButton.png");

		s = new Screen(0);

		for (int a = 0; a <= 10; a++) {
			if (s.exists(reduceBetAmountButton) != null) {
				s.wait(reduceBetAmountButton, 15);
				s.find(reduceBetAmountButton).mouseMove();
				int x = 1;
				while (x <= 5) {
					s.click();
					x++;
				}
				break;
			} else {
				generateReports.setExtentTestFail("Failed");
				throw new FailedLoginException();
			}
		}

		waitTime();

//		int x = 0;
//		while (x <= 3) {
//			if (s.exists(betButton) != null) {
//				s.wait(betButton, 15);
//				s.find(betButton).mouseMove();
//				s.click();
//				s.mouseMove(-250, 0);
//				break;
//			} else {
//				x++;
//			}
//		}

		waitTime();

		if (s.exists(winBetButton) != null) {
			s.wait(winBetButton, 15);
			s.find(winBetButton).mouseMove();
			waitTime();
			s.click();
		} else {
			generateReports.setExtentTestSkip("Skipped");
		}

		waitTime();

		if (s.exists(betRecordButton) != null) {
			s.wait(betRecordButton, 15);
			s.find(betRecordButton).mouseMove();
			s.click();
		} else {
			generateReports.setExtentTestFail("Failed");
			throw new FailedLoginException();
		}

		waitTime();

		if (s.exists(betRecordDetailButton) != null) {
			s.wait(betRecordDetailButton, 15);
			s.find(betRecordDetailButton).mouseMove();
			s.click();
		} else if (s.exists(betRecordDetailButton2) != null) {
			s.wait(betRecordDetailButton2, 15);
			s.find(betRecordDetailButton2).mouseMove();
			s.click();
		} else {
			generateReports.setExtentTestFail("Failed");
			throw new FailedLoginException();
		}
	}

	public void waitTime() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}