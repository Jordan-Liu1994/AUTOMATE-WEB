package testSetupRunner;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Region;
import org.sikuli.script.Screen;

public class TestSikuli {

	static Region r;

	public static void main(String[] args) {
		Screen s = new Screen(0);

		String userDir = System.getProperty("user.dir");
		String imageFilePath = userDir + "\\src\\test\\resources\\images\\Slots\\";
		Pattern test = new Pattern(imageFilePath + "reduceBetAmount.png");
		Pattern test2 = new Pattern(imageFilePath + "betButton.png");
		Pattern test3 = new Pattern(imageFilePath + "settingsButton.png");
		Pattern test4 = new Pattern(imageFilePath + "betRecordButton.png");
		Pattern test5 = new Pattern(imageFilePath + "betRecordButton2.png");

//		r = s.newRegion(1322, 571, 71, 64).grow(15, 15);
//		r = s.newRegion(1309, 390, 97, 100).grow(15, 15);
//		r = s.newRegion(138, 668, 63, 63).grow(15, 15);
//		r = s.newRegion(880, 259, 67, 80).grow(15, 15);
		r = s.newRegion(551, 667, 59, 64).grow(15, 15);
		
		r.highlight("green");
		try {
			r.find(test5);
			r.mouseMove();
//			int a = 1;
//			while (a <= 5) {
//				r.click();
//				a++;
//			}
		} catch (FindFailed e) {
			e.printStackTrace();
		}
		r.highlightOff();
	}
}
