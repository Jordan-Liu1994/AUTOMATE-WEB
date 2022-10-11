package xRunnersGames;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import xCommonUtilities.UsedVariables;

public class SelectLiveGameVendorBBIN extends UsedVariables {

	@Test(priority = 0, groups = { "BBIN Live" })
	@Parameters({ "gameVendor" })
	public void selectLiveGameVendorBBIN(String gameVendor) throws Exception {
		generateReports.createTest("selectSlotsGameVendor");
		selectGameCategoryAndVendorF.selectLiveGameVendor(gameVendor);
		parentWindow = driver.getDriver().getWindowHandle();
		iterateWindow.iterateToGameWindow();
		Thread.sleep(5000);
		selectLiveBBINGameF.hoverGame();
		selectLiveBBINGameF.selectGame();
		iterateWindow.iterateToInGameWindow();
		Thread.sleep(5000);
		liveBBINBettingF.doLiveBBINBet();
		iterateWindow.iterateToInBetRecordWindow();
		iterateWindow.screenShotFinalWindow(gameVendor);
	}
}