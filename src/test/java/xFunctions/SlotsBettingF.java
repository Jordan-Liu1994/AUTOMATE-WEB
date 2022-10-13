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

		waitTimeLong();

		s.wait(reduceBetAmountButton, 15).find(reduceBetAmountButton);
		if (s.exists(reduceBetAmountButton) != null) {
			s.mouseMove();
			int x = 1;
			while (x <= 5) {
				s.click();
				x++;
			}
		} else {
			generateReports.setExtentTestFail("Failed");
			throw new FailedLoginException();
		}

//		waitTime();
//
//		s.wait(betButton, 15).find(betButton);
//		if (s.exists(betButton) != null) {
//			s.mouseMove();
//			s.click();
//			s.mouseMove(-250, 0);
//		} else {
//			generateReports.setExtentTestFail("Failed");
//			throw new FailedLoginException();
//		}
//
//		waitTimeLong();
//
//		s.wait(winBetButton, 15).find(winBetButton);
//		if (s.exists(winBetButton) != null) {
//			s.mouseMove();
//			s.click();
//		} else {
//			generateReports.setExtentTestSkip("Skipped");
//		}
//
//		waitTime();
//
//		s.wait(betRecordButton, 15).find(betRecordButton);
//		if (s.exists(betRecordButton) != null) {
//			s.mouseMove();
//			s.click();
//		} else {
//			generateReports.setExtentTestFail("Failed");
//			throw new FailedLoginException();
//		}
//
//		waitTime();
//
//		s.wait(betRecordDetailButton, 15).find(betRecordDetailButton);
//		if (s.exists(betRecordDetailButton) != null) {
//			s.mouseMove();
//			s.click();
//		} else {
//			generateReports.setExtentTestSkip("Skipped");
//		}
//		
//		s.wait(betRecordDetailButton2, 15).find(betRecordDetailButton2);
//		if (s.exists(betRecordDetailButton2) != null) {
//			s.mouseMove();
//			s.click();
//		} else {
//			generateReports.setExtentTestSkip("Skipped");
//		}
	}

	public void waitTime() {
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void waitTimeLong() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}