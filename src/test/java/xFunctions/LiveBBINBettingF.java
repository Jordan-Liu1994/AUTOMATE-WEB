package xFunctions;

import javax.security.auth.login.FailedLoginException;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Location;
import org.sikuli.script.Mouse;
import org.sikuli.script.Pattern;
import org.sikuli.script.Region;
import org.sikuli.script.Screen;
import xCommonUtilities.GenerateReports;

public class LiveBBINBettingF {

	GenerateReports generateReports = new GenerateReports();

	String userDir = System.getProperty("user.dir");
	String imageFilePath = userDir + "\\src\\test\\resources\\images\\LiveBBIN\\";

	Pattern betPosition = new Pattern(imageFilePath + "betPosition.png");
	Pattern betAmount = new Pattern(imageFilePath + "betAmount.png");
	Pattern betAllow = new Pattern(imageFilePath + "betAllow.png");
	Pattern betRecordButton = new Pattern(imageFilePath + "betRecordButton.png");
	Pattern confirmBet = new Pattern(imageFilePath + "confirmBet.png");

	Screen s;
	Region r;

	public void setBetAmount() throws FailedLoginException, FindFailed {
		s = new Screen(0);

		for (int a = 1; a <= 3; a++) {
			waitTimeLong();
		}

		if (s.exists(betAmount) != null) {
			s.mouseMove();
			waitTime("betAmount");
			Location x = Mouse.at();
			r = x.grow();
			r.highlight("green");
			r.click();
			s.mouseMove(-250, 0);
			r.highlightOff();
		} else {
			generateReports.setExtentTestFail("betAmount image not found");
			throw new FailedLoginException();
		}
	}

	public void checkAllowBet() throws FailedLoginException, FindFailed {
		s = new Screen(0);

		if (s.exists(betAllow, 360) != null) {
			s.mouseMove();
			waitTime("betAllow");
			Location x = Mouse.at();
			r = x.grow(500, 50);
			r.highlight("green");
			r.highlightOff();
		} else {
			generateReports.setExtentTestFail("betAllow image not found");
			throw new FailedLoginException();
		}
	}

	public void placeBetPosition() throws FailedLoginException, FindFailed {
		s = new Screen(0);

		if (s.exists(betPosition) != null) {
			s.mouseMove();
			waitTime("betPosition");
			Location x = Mouse.at();
			r = x.grow(50, 50);
			r.highlight("green");
			r.click();
			s.mouseMove(-250, 250);
			r.highlightOff();
		} else {
			generateReports.setExtentTestFail("betPosition image not found");
			throw new FailedLoginException();
		}
		waitTime("betPosition");
	}

	public void confirmBet() throws FailedLoginException, FindFailed {
		s = new Screen(0);

		if (s.exists(confirmBet) != null) {
			s.mouseMove();
			waitTime("confirmBet");
			Location x = Mouse.at();
			r = x.grow(50, 50);
			r.highlight("green");
			r.click();
			s.mouseMove(-250, 250);
			r.highlightOff();
		} else {
			generateReports.setExtentTestFail("confirmBet image not found");
			throw new FailedLoginException();
		}

		int a = 0;
		while (a <= 5) {
			waitTimeLong();
			a++;
			System.out.println(a);
		}
	}

	public void seletBetRecordButton() throws FailedLoginException, FindFailed {
		s = new Screen(0);

		if (s.exists(betRecordButton) != null) {
			s.mouseMove();
			waitTime("betRecordButton");
			Location x = Mouse.at();
			r = x.grow(50, 50);
			r.highlight("green");
			r.click();
			s.mouseMove(-250, 250);
			for (int z = 1; z <= 10; z++) {
				if (s.exists(betRecordButton) != null) {
					s.click(betRecordButton);
					s.mouseMove(500, -250);
					System.out.println(z);
				} else {
					break;
				}
			}
			r.highlightOff();
		} else {
			generateReports.setExtentTestFail("betRecordButton image not found");
			throw new FailedLoginException();
		}
		waitTime("betRecordButton");
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
			Thread.sleep(2500);
			System.out.println("Wait time over " + x);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}