package xRunnersDeposit;

import javax.security.auth.login.FailedLoginException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import xCommonUtilities.UsedVariables;

public class OfflineDepositBO extends UsedVariables {

	@Test(priority = 0, groups = { "offlineDepositBO" })
	@Parameters({ "username" })
	public void offlineDepositBO(String username) throws FailedLoginException {
		generateReports.createTest("offlineDepositBO");
		boOfflineDepositF.hoverFinanceManagement();
		boOfflineDepositF.selectOfflineDepositVerification();
		boOfflineDepositF.verifyOfflineDepositVerificationTabOpened();
		boOfflineDepositF.setUsernameToSearch(username);
		boOfflineDepositF.selectSearchButton();
	}
}