package xCommonUtilities;

import xFunctions.CheckSlotsBetRecordF;
import xFunctions.LiveBBINBettingF;
import xFunctions.LoginF;
import xFunctions.LogoutF;
import xFunctions.RegisterF;
import xFunctions.SelectGameCategoryAndVendorF;
import xFunctions.SelectLiveBBINGameF;
import xFunctions.SelectSlotsGameAndBetF;
import xFunctions.SlotsBettingF;
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
	protected SelectGameCategoryAndVendorF selectGameCategoryAndVendorF = new SelectGameCategoryAndVendorF();
	protected SelectSlotsGameAndBetF selectSlotsGameAndBetF = new SelectSlotsGameAndBetF();
	protected SelectLiveBBINGameF selectLiveBBINGameF = new SelectLiveBBINGameF();
	protected IterateWindow iterateWindow = new IterateWindow();
	protected LiveBBINBettingF liveBBINBettingF = new LiveBBINBettingF();
	protected SlotsBettingF slotsBettingF = new SlotsBettingF();
	protected CheckSlotsBetRecordF checkSlotsBetRecordF = new CheckSlotsBetRecordF();
	
	protected static String parentWindow;
}
