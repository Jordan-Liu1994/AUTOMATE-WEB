package xFunctions;

import javax.security.auth.login.FailedLoginException;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
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
		Pattern winBetButton = new Pattern(imageFilePath + "winBetButton.png");

		s = new Screen(0);

		for (int a = 0; a <= 10; a++) {
			if (s.exists(reduceBetAmountButton) != null) {
				s.wait(reduceBetAmountButton, 60);
				s.find(reduceBetAmountButton).mouseMove();
				int x = 1;
				while (x <= 5) {
					s.click();
					x++;
				}
				break;
			}
		}

//		for (int b = 0; b <= 5; b++) {
//			if (s.exists(betButton) != null) {
//				s.wait(betButton, 15);
//				s.find(betButton).mouseMove();
//				s.click();
//				break;
//			}
//		}

		for (int b = 0; b <= 3; b++) {
			if (s.exists(winBetButton) != null) {
				s.wait(winBetButton, 15);
				s.find(winBetButton).mouseMove();
				s.click();
			} else {
				break;
			}
		}

		for (int c = 0; c <= 5; c++) {
			if (s.exists(betRecordButton) != null) {
				s.wait(betRecordButton, 15);
				s.find(betRecordButton).mouseMove();
				s.click();
				break;
			}
		}

		for (int d = 0; d <= 5; d++) {
			if (s.exists(betRecordDetailButton) != null) {
				s.wait(betRecordDetailButton, 15);
				s.find(betRecordDetailButton).mouseMove();
				s.click();
				break;
			}
		}
	}
}