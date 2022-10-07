package xCommonUtilities;

import xFunctions.LoginF;
import xFunctions.LogoutF;
import xFunctions.RegisterF;
import xFunctions.StartDrivers;

public class UsedVariables {

	protected Webdrivers driver = new Webdrivers();
	protected StartDrivers startDrivers = new StartDrivers();
	protected GenerateReports generateReports = new GenerateReports();
	protected LogStatus logStatus = new LogStatus();
	protected Screenshots screenshots = new Screenshots();

	protected LoginF loginF = new LoginF();
	protected LogoutF logoutF = new LogoutF();
	protected RegisterF registerF = new RegisterF();

}
