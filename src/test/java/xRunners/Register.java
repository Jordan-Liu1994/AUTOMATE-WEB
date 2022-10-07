package xRunners;

import javax.security.auth.login.FailedLoginException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import xCommonUtilities.UsedVariables;

public class Register extends UsedVariables {

	@Test(priority = 0, groups = { "register" })
	public void register() throws FailedLoginException {
		generateReports.createTest("register");
		registerF.selectRegisterOption();
		registerF.setUsername();
		registerF.setPassword();
		registerF.setCaptcha();
		registerF.selectRegister();
		registerF.getVerifyRegister();
	}

	@AfterMethod
	public void logStatus(ITestResult result) {
		logStatus.logStatus(result);
	}
}