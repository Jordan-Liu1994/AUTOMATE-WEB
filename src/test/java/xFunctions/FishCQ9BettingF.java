package xFunctions;

import javax.security.auth.login.FailedLoginException;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Location;
import org.sikuli.script.Mouse;
import org.sikuli.script.Pattern;
import org.sikuli.script.Region;
import org.sikuli.script.Screen;
import xCommonUtilities.GenerateReports;

public class FishCQ9BettingF {

	GenerateReports generateReports = new GenerateReports();

	String userDir = System.getProperty("user.dir");
	String imageFilePath = userDir + "\\src\\test\\resources\\images\\FishCQ9\\";

	Pattern closeInfoButton一炮捕鱼 = new Pattern(imageFilePath + "closeInfoButton一炮捕鱼.png");
	Pattern fishGameOption一炮捕鱼 = new Pattern(imageFilePath + "fishGameOption一炮捕鱼.png");
	Pattern closeTutorialButton一炮捕鱼 = new Pattern(imageFilePath + "closeTutorialButton一炮捕鱼.png");
	Pattern betButton一炮捕鱼 = new Pattern(imageFilePath + "betButton一炮捕鱼.png");
	Pattern settingsButton一炮捕鱼 = new Pattern(imageFilePath + "settingsButton一炮捕鱼.png");
	Pattern betRecordButton一炮捕鱼 = new Pattern(imageFilePath + "betRecordButton一炮捕鱼.png");

	Pattern fishGameOption皇金渔场 = new Pattern(imageFilePath + "fishGameOption皇金渔场.png");
	Pattern betButton皇金渔场 = new Pattern(imageFilePath + "betButton皇金渔场.png");
	Pattern settingsButton皇金渔场 = new Pattern(imageFilePath + "settingsButton皇金渔场.png");
	Pattern betRecordButton皇金渔场 = new Pattern(imageFilePath + "betRecordButton皇金渔场.png");

	Screen s;
	Region r;

	public void selectCloseInfoButton() throws FailedLoginException, FindFailed {
		s = new Screen(0);

		for (int a = 1; a <= 3; a++) {
			if (s.exists(closeInfoButton一炮捕鱼, 15) != null) {
				s.mouseMove();
				waitTime("closeInfoButton一炮捕鱼");
				Location x = Mouse.at();
				r = x.grow();
				r.highlight("green");
				r.click();
				s.mouseMove(100, 0);
				r.highlightOff();
				waitTime("closeInfoButton一炮捕鱼");
				break;
			} else if (s.exists(fishGameOption皇金渔场) != null) {
				generateReports.setExtentTestSkip("Skipped closeInfoButton一炮捕鱼");
			} else {
				generateReports.setExtentTestFail("closeInfoButton一炮捕鱼 not found");
				throw new FailedLoginException();
			}
		}
	}

	public void selectFishGameOption() throws FailedLoginException, FindFailed {
		s = new Screen(0);

		for (int a = 1; a <= 3; a++) {

			if (s.exists(fishGameOption一炮捕鱼) != null) {
				s.mouseMove();
				waitTime("fishGameOption一炮捕鱼");
				Location x = Mouse.at();
				r = x.grow(50, 50);
				r.highlight("green");
				r.click();
				s.mouseMove(100, 0);
				r.highlightOff();
				waitTime("fishGameOption一炮捕鱼");
				break;
			} else if (s.exists(fishGameOption皇金渔场) != null) {
				s.mouseMove();
				waitTime("fishGameOption皇金渔场");
				Location x = Mouse.at();
				r = x.grow(50, 50);
				r.highlight("green");
				r.click();
				s.mouseMove(100, 0);
				r.highlightOff();
				waitTime("fishGameOption皇金渔场");
				break;
			} else {
				generateReports.setExtentTestFail("fishGameOption not found");
				throw new FailedLoginException();
			}
		}
	}

	public void selectCloseTutorialButton() throws FailedLoginException, FindFailed {
		s = new Screen(0);

		if (s.exists(closeTutorialButton一炮捕鱼) != null) {
			s.mouseMove();
			waitTime("closeTutorialButton一炮捕鱼");
			Location x = Mouse.at();
			r = x.grow(50, 50);
			r.highlight("green");
			r.click();
			s.mouseMove(100, 0);
			for (int z = 1; z <= 10; z++) {
				if (s.exists(closeTutorialButton一炮捕鱼) != null) {
					s.click(closeTutorialButton一炮捕鱼);
					s.mouseMove(500, -250);
					System.out.println(z);
				} else {
					break;
				}
			}
			r.highlightOff();
			waitTime("closeTutorialButton一炮捕鱼");
		} else if (s.exists(settingsButton皇金渔场) != null) {
			for (int a = 1; a <= 3; a++) {
				waitTimeLong(15000);
			}
			waitTime("New fish game");
		} else {
			generateReports.setExtentTestFail("selectCloseTutorialButton image not found");
			throw new FailedLoginException();
		}
	}

	public void selectBetArea() throws FailedLoginException, FindFailed {
		s = new Screen(0);

		if (s.exists(betButton一炮捕鱼) != null) {
			s.mouseMove();
			waitTime("confirmBet");
			Location x = Mouse.at();
			r = x.grow(50, 50);
			r.highlight("green");
			r.click();
			s.mouseMove(100, 0);
			r.highlightOff();
		} else if (s.exists(betButton皇金渔场) != null) {
			s.mouseMove();
			waitTime("confirmBet");
			Location x = Mouse.at();
			r = x.grow(50, 50);
			r.highlight("green");
			r.click();
			s.mouseMove(100, 0);
			r.highlightOff();
		} else {
			generateReports.setExtentTestFail("betButton image not found");
			throw new FailedLoginException();
		}

		for (int a = 1; a <= 3; a++) {
			waitTimeLong(15000);
		}
	}

	public void selectSettingsButton() throws FailedLoginException, FindFailed {
		s = new Screen(0);

		if (s.exists(settingsButton一炮捕鱼) != null) {
			s.mouseMove();
			waitTime("settingsButton一炮捕鱼");
			Location x = Mouse.at();
			r = x.grow(50, 50);
			r.highlight("green");
			r.click();
			s.mouseMove(100, 0);
			for (int z = 1; z <= 10; z++) {
				if (s.exists(settingsButton一炮捕鱼) != null) {
					s.click(settingsButton一炮捕鱼);
					s.mouseMove(500, -250);
					System.out.println(z);
				} else {
					break;
				}
			}
			r.highlightOff();
			waitTime("settingsButton一炮捕鱼");
		} else if (s.exists(settingsButton皇金渔场) != null) {
			s.mouseMove();
			waitTime("settingsButton皇金渔场");
			Location x = Mouse.at();
			r = x.grow(50, 50);
			r.highlight("green");
			r.click();
			s.mouseMove(100, 0);
			for (int z = 1; z <= 10; z++) {
				if (s.exists(settingsButton一炮捕鱼) != null) {
					s.click(settingsButton一炮捕鱼);
					s.mouseMove(500, -250);
					System.out.println(z);
				} else {
					break;
				}
			}
			r.highlightOff();
			waitTime("settingsButton皇金渔场");
		} else {
			generateReports.setExtentTestFail("settingsButton image not found");
			throw new FailedLoginException();
		}
	}

	public void seletBetRecordButton() throws FailedLoginException, FindFailed {
		s = new Screen(0);

		if (s.exists(betRecordButton一炮捕鱼) != null) {
			s.mouseMove();
			waitTime("betRecordButton一炮捕鱼");
			Location x = Mouse.at();
			r = x.grow(50, 50);
			r.highlight("green");
			r.click();
			s.mouseMove(100, 0);
			for (int z = 1; z <= 10; z++) {
				if (s.exists(betRecordButton一炮捕鱼) != null) {
					s.click(betRecordButton一炮捕鱼);
					s.mouseMove(500, -250);
					System.out.println(z);
				} else {
					break;
				}
			}
			r.highlightOff();
			waitTime("betRecordButton一炮捕鱼");
		} else if (s.exists(betRecordButton皇金渔场) != null) {
			s.mouseMove();
			waitTime("betRecordButton一炮捕鱼");
			Location x = Mouse.at();
			r = x.grow(50, 50);
			r.highlight("green");
			r.click();
			s.mouseMove(100, 0);
			for (int z = 1; z <= 10; z++) {
				if (s.exists(betRecordButton一炮捕鱼) != null) {
					s.click(betRecordButton一炮捕鱼);
					s.mouseMove(500, -250);
					System.out.println(z);
				} else {
					break;
				}
			}
			r.highlightOff();
			waitTime("betRecordButton皇金渔场");
		} else {
			generateReports.setExtentTestFail("betRecordButton一炮捕鱼 image not found");
			throw new FailedLoginException();
		}
	}

	public void waitTimeLong(int waitTime) {
		try {
			Thread.sleep(waitTime);
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