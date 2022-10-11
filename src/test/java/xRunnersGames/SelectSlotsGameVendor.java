package xRunnersGames;

import javax.security.auth.login.FailedLoginException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import xCommonUtilities.UsedVariables;

public class SelectSlotsGameVendor extends UsedVariables {

	@Test(priority = 0)
	@Parameters({ "gameVendor" })
	public void selectSlotsGameVendor(String gameVendor) throws FailedLoginException {
		generateReports.createTest("selectSlotsGameVendor");
		if (gameVendor.equalsIgnoreCase("0")) {
			selectGameCategoryAndVendorF.selectSlotsGameVendor(gameVendor);
		} else if (gameVendor.equalsIgnoreCase("6")) {
			selectGameCategoryAndVendorF.selectSlotsGameVendor(gameVendor);
		}
	}
}