package xCommonUtilities;

import xFunctions.BOLoginF;
import xFunctions.BOOfflineDepositF;
import xFunctions.CheckSlotsBetRecordF;
import xFunctions.FishCQ9BettingF;
import xFunctions.LiveBBINBettingF;
import xFunctions.LoginF;
import xFunctions.LogoutF;
import xFunctions.OfflineDepositF;
import xFunctions.RegisterF;
import xFunctions.SelectGameCategoryAndVendorF;
import xFunctions.SelectLiveBBINGameAndBetF;
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
	protected SelectLiveBBINGameAndBetF selectLiveBBINGameF = new SelectLiveBBINGameAndBetF();
	protected IterateWindow iterateWindow = new IterateWindow();
	protected LiveBBINBettingF liveBBINBettingF = new LiveBBINBettingF();
	protected SlotsBettingF slotsBettingF = new SlotsBettingF();
	protected CheckSlotsBetRecordF checkSlotsBetRecordF = new CheckSlotsBetRecordF();
	protected FishCQ9BettingF fishCQ9BettingF = new FishCQ9BettingF();
	protected OfflineDepositF offlineDepositF = new OfflineDepositF();
	protected BOLoginF boLoginF = new BOLoginF();
	protected BOOfflineDepositF boOfflineDepositF = new BOOfflineDepositF();
	
	protected static String parentWindow;
}
