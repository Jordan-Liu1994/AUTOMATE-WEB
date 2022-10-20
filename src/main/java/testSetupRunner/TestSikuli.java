package testSetupRunner;

import org.sikuli.hotkey.Keys;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Location;
import org.sikuli.script.Mouse;
import org.sikuli.script.Pattern;
import org.sikuli.script.Region;
import org.sikuli.script.Screen;

public class TestSikuli {
//	SETS THE PATH TO THE IMAGE CAPTURED & SAVED
	static String userDir = System.getProperty("user.dir");
	static String imageFilePath = userDir + "\\crackCaptchaImages\\";
//	REGION FUNCTION METHOD
	static Region r;
//	LOCATION FUNCTION METHOD
	static Location x;
//	SETS A PATTERN TO REFERENCE THE IMAGE CAPTURED USING SIKULI
	static Pattern image1 = new Pattern(imageFilePath + "searchBox.png");

	public static void main(String[] args) throws InterruptedException, FindFailed {
//		SET SCREEN TO MAIN SCREEN = 0 = DEFAULT WORKING SCREEN
		Screen s = new Screen(0);
//		FIND IMAGE
		s.find(image1);
//		MOVE MOUSE TO IMAGE
		s.mouseMove();
		waitTime();
//		GET CURRENT POSITION OF MOUSE
		x = Mouse.at();
//		PROVIDE X & Y VALUES OF MOUSE POSITION
		int a = x.getX();
		int b = x.getY();
		System.out.println("X = " + a + " | " + "Y = " + b);
//		SET REGION POSITION TO CURRENT MOUSE POSITION & INCREASE THE CLICK SPOT AREA SIZE
		r = x.union(x).grow(10, 10);
		System.out.println("Region = " + r);
//		DISPLAYS A HIGHLIGHT TO INFORM USER WHERE THE MOUSE IS AT
		r.highlightOn();
//		CLICKS THE POSITION
		r.click();
//		TYPES INTO THE POSITION CLICKED IF AVAILABLE FOR TYPING
		r.type("google" + Keys.ENTER);
		waitTime();
//		DISPLAYED HIGHLIGHT IS TURNED OFF AFTER COMPLETION
		r.highlightOff();
	}
//	FORCES PROGRAM TO PAUSE FOR A CERTAIN AMOUNT OF TIME = 1000 = 1 SECONDS
	public static void waitTime() {
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
