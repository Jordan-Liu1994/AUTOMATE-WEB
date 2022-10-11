package xRunnersGames;

import javax.security.auth.login.FailedLoginException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import xCommonUtilities.UsedVariables;

public class SelectSlotsGameVendorCQ9 extends UsedVariables {

	@Test(priority = 0, groups = { "cq9" })
	@Parameters({ "gameVendor", "game1", "game2", "game3" })
	public void selectSlotsGameVendor(String gameVendor, String game1, String game2, String game3) throws FailedLoginException {
		generateReports.createTest("selectSlotsGameVendor");
		selectGameCategoryAndVendorF.selectSlotsGameVendor(gameVendor);
		selectSlotsGameAndBetF.selectSlotsGame(game1);
		selectSlotsGameAndBetF.selectSlotsGame(game2);
		selectSlotsGameAndBetF.selectSlotsGame(game3);
	}
}