package xRunnersDeposit;

import javax.security.auth.login.FailedLoginException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import xCommonUtilities.UsedVariables;

public class LoginBO extends UsedVariables {

	@Test(priority = 0, groups = { "loginBO" })
	@Parameters({ "urlBO" })
	public void goToSite(String urlBO) {
		generateReports.createTest("goToSite");
		driver.getURL(urlBO);
	}

	@Test(priority = 1, groups = { "loginBO" })
	@Parameters({ "usernameBO", "password" })
	public void loginBO(String usernameBO, String password) throws FailedLoginException {
		generateReports.createTest("loginBO");
		boLoginF.setUsername(usernameBO);
		boLoginF.setPassword(password);
		boLoginF.setOtp();
		boLoginF.selectLogin();
		boLoginF.getVerifyLogin(usernameBO);
	}
}