package xRunnersGames;

import javax.security.auth.login.FailedLoginException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import xCommonUtilities.UsedVariables;

public class SelectLiveGameVendorBBIN extends UsedVariables {

	@Test(priority = 0, groups = { "BBIN Live" })
	@Parameters({ "gameVendor" })
	public void selectLiveGameVendorBBIN(String gameVendor) throws FailedLoginException {
		generateReports.createTest("selectSlotsGameVendor");
		selectGameCategoryAndVendorF.selectLiveGameVendor(gameVendor);
		parentWindow = driver.getDriver().getWindowHandle();
		iterateWindow.iterateToGameWindow();
		iterateWindow.iterateToMainWindow(parentWindow);
	}
}