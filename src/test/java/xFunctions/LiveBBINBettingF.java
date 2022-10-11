package xFunctions;

import javax.security.auth.login.FailedLoginException;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import xCommonUtilities.GenerateReports;

public class LiveBBINBettingF {

	GenerateReports generateReports = new GenerateReports();

	Screen s;

	String userDir = System.getProperty("user.dir");

	public void doLiveBBINBet() throws FailedLoginException, FindFailed {
		String imageFilePath = userDir + "\\src\\test\\resources\\images\\liveBBIN.sikuli\\";
		Pattern betRecordButton = new Pattern(imageFilePath + "betRecordButton-1.png").similar(0.9);
		Pattern setBetAmount = new Pattern(imageFilePath + "setBetAmount.png");
		Pattern allowBet = new Pattern(imageFilePath + "allowBet.png");
		Pattern betPosition = new Pattern(imageFilePath + "betPosition.png");
		Pattern confirmBetButton = new Pattern(imageFilePath + "confirmBetButton.png");

		s = new Screen(0);

		for (int a = 0; a <= 5; a++) {
			if (s.exists(setBetAmount) != null) {
				s.wait(setBetAmount, 15);
				s.find(setBetAmount).mouseMove();
				s.click();
				break;
			}
		}

		for (int b = 0; b <= 10; b++) {
			if (s.exists(allowBet) != null) {
				s.wait(allowBet, 60);
				s.find(allowBet);
				break;
			}
		}

		for (int c = 0; c <= 5; c++) {
			if (s.exists(betPosition) != null) {
				s.wait(betPosition, 15);
				s.find(betPosition).mouseMove();
				s.click();
				break;
			}
		}

		for (int d = 0; d <= 5; d++) {
			if (s.exists(confirmBetButton) != null) {
				s.wait(confirmBetButton, 15);
				s.find(confirmBetButton).mouseMove();
				s.click();
				break;
			}
		}

		for (int z = 0; z <= 5; z++) {
			if (s.exists(betRecordButton) != null) {
				s.wait(betRecordButton, 15);
				s.find(betRecordButton).mouseMove();
				s.click();
				break;
			}
		}
	}
}