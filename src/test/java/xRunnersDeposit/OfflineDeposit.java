package xRunnersDeposit;

import javax.security.auth.login.FailedLoginException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import xCommonUtilities.UsedVariables;

public class OfflineDeposit extends UsedVariables {

	@Test(priority = 0, groups = { "offlineDeposit" })
	@Parameters({ "username", "depositAmount", "depositName", "joinOrNo" })
	public void offlineDeposit(String username, String depositAmount, String depositName, String joinOrNo) throws FailedLoginException {
		generateReports.createTest("offlineDeposit");
		offlineDepositF.hoverUsername(username);
		offlineDepositF.selectDepositOption();
		offlineDepositF.selectCloseDepositInfoPopUp();
		offlineDepositF.selectOfflineDeposit();
		offlineDepositF.selectOfflineDepositMethod();
		offlineDepositF.inputDepositAmount(depositAmount);
		offlineDepositF.inputDepositName(depositName);
		offlineDepositF.checkJoinPromoOrNoJoinPromo(joinOrNo);
		offlineDepositF.checkActualAmountReceivedAfterDeposit();
		offlineDepositF.selectDepositButton();
	}
}