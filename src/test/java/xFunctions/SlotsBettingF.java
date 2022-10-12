package xFunctions;

import javax.security.auth.login.FailedLoginException;

import org.sikuli.script.FindFailed;
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
		Pattern reduceBetAmountButton = new Pattern(imageFilePath + "reduceBetAmountButton.png").similar(0.9);
		Pattern betButton = new Pattern(imageFilePath + "betButton.png");
		Pattern betRecordButton = new Pattern(imageFilePath + "betRecordButton.png");
		Pattern betRecordDetailButton = new Pattern(imageFilePath + "betRecordDetailButton.png");
		Pattern betRecordDetailButton2 = new Pattern(imageFilePath + "betRecordButton2.png");
		Pattern winBetButton = new Pattern(imageFilePath + "winBetButton.png");

		s = new Screen(0);

		for (int a = 0; a <= 10; a++) {
			if (s.exists(reduceBetAmountButton) != null) {
				s.wait(reduceBetAmountButton, 30);
				s.find(reduceBetAmountButton).mouseMove();
				int x = 1;
				while (x <= 5) {
					s.click();
					x++;
				}
				break;
			}
		}

		waitTime();

		for (int b = 0; b <= 10; b++) {
			if (s.exists(betButton) != null) {
				s.wait(betButton, 30);
				s.find(betButton).mouseMove();
				s.click();
				s.mouseMove(-250, 0);
				break;
			}
		}

		waitTime();

		for (int b = 0; b <= 10; b++) {
			if (s.exists(winBetButton) != null) {
				s.wait(winBetButton, 30);
				s.find(winBetButton).mouseMove();
				waitTime();
				s.click();
				break;
			} else {
				generateReports.setExtentTestSkip("Bet win image skipped");
			}
		}

		waitTime();

		for (int c = 0; c <= 10; c++) {
			if (s.exists(betRecordButton) != null) {
				s.wait(betRecordButton, 30);
				s.find(betRecordButton).mouseMove();
				s.click();
				break;
			}
		}

		waitTime();

		if (s.exists(betRecordDetailButton) != null) {
			s.wait(betRecordDetailButton, 30);
			s.find(betRecordDetailButton).mouseMove();
			s.click();
		} else {
			generateReports.setExtentTestSkip("Bet detail image skipped");
		}

		if (s.exists(betRecordDetailButton2) != null) {
			s.wait(betRecordDetailButton2, 30);
			s.find(betRecordDetailButton2).mouseMove();
			s.click();
		} else {
			generateReports.setExtentTestSkip("Bet detail image skipped");
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