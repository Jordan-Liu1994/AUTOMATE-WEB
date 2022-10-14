package xRunnersGames;

import java.util.ArrayList;

import javax.security.auth.login.FailedLoginException;

import org.sikuli.script.FindFailed;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import xCommonUtilities.UsedVariables;

public class SelectSlotsGameVendorCQ9 extends UsedVariables {

	@Test(priority = 0, groups = { "CQ9 Slots" })
	@Parameters({ "gameVendor", "game1", "game2", "game3" })
	public void selectSlotsGameVendor(String gameVendor, String game1, String game2, String game3) throws Exception {
		generateReports.createTest("selectSlotsGameVendor");
		selectGameCategoryAndVendorF.selectSlotsGameVendor(gameVendor);
		parentWindow = driver.getDriver().getWindowHandle();
		ArrayList<String> gameList = new ArrayList<String>();
		gameList.add(game1);
		gameList.add(game2);
		gameList.add(game3);

		for (int i = 0; i <= 2; i++) {
			String game = gameList.get(i);
			selectSlotsGameAndBetF.selectSlotsGame(game);
			iterateWindow.iterateToSecondWindow();
			slotsBettingF.reduceBetAmount();
//			slotsBettingF.selectBetButton();
//			slotsBettingF.selectWinBet();
			slotsBettingF.selectSettingsButton();
			slotsBettingF.selectBetRecordButton2();
			iterateWindow.iterateToThirdWindow();
			checkSlotsBetRecordF.selectChangeTimeZone();
			checkSlotsBetRecordF.selectToday();
			checkSlotsBetRecordF.selectGameBetRecordDetail(game);
			iterateWindow.iterateToFourthWindow();
			iterateWindow.screenShotFinalWindow(game);
			iterateWindow.closeWindowsTillMain();
			iterateWindow.iterateToMainWindow(parentWindow);
		}
	}
}