package xRunnersGames;

import javax.security.auth.login.FailedLoginException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import xCommonUtilities.UsedVariables;

public class SelectGameCategory extends UsedVariables {

	@Test(priority = 0)
	@Parameters({ "number" })
	public void selectGameCategory(String number) throws FailedLoginException {
		generateReports.createTest("selectGameCategory");
		selectGameCategoryAndVendorF.selectGameCategory(number);
	}
}