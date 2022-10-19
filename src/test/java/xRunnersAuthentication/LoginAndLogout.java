package xRunnersAuthentication;

import javax.security.auth.login.FailedLoginException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import xCommonUtilities.UsedVariables;

public class LoginAndLogout extends UsedVariables {

	@Test(priority = 0, groups = { "login" })
	@Parameters({ "url" })
	public void goToSite(String url) {
		generateReports.createTest("goToSite");
		driver.getURL(url);
	}

	@Test(priority = 1, groups = { "login" })
	@Parameters({ "username", "password" })
	public void login(String username, String password) throws FailedLoginException {
		generateReports.createTest("login");
		loginF.selectLoginOption();
		loginF.setUsername(username);
		loginF.setPassword(password);
		loginF.selectLogin();
		loginF.getVerifyLogin(username);
	}

	@Test(priority = 2, groups = { "logout" })
	@Parameters({ "username"})
	public void logout(String username) throws FailedLoginException {
		generateReports.createTest("logout");
		logoutF.setHoverUsername(username);
		logoutF.selectLogout();
		logoutF.getVerifyLogout();
	}
}