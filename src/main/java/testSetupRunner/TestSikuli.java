package testSetupRunner;

import java.awt.MouseInfo;
import java.awt.Point;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Location;
import org.sikuli.script.Mouse;
import org.sikuli.script.Pattern;
import org.sikuli.script.Region;
import org.sikuli.script.Screen;

public class TestSikuli {

	static Region r;

	public static void main(String[] args) throws InterruptedException, FindFailed {
		Screen s = new Screen(0);

		String userDir = System.getProperty("user.dir");
		String imageFilePath = userDir + "\\src\\test\\resources\\images\\Slots\\";
		Pattern test = new Pattern(imageFilePath + "reduceBetAmount.png");
		Pattern test2 = new Pattern(imageFilePath + "betButton.png");
		Pattern test3 = new Pattern(imageFilePath + "settingsButton.png");
		Pattern test4 = new Pattern(imageFilePath + "betRecordButton.png");
		Pattern test5 = new Pattern(imageFilePath + "betRecordButton2.png");

//		r = s.newRegion(1322, 571, 100, 75).grow();
//		r = s.newRegion(x.set(1360, 605), 200, 200).grow();
		// r = s.newRegion(1309, 390, 97, 100).grow(15, 15);
//		r = s.newRegion(138, 668, 63, 63).grow(15, 15);
//		r = s.newRegion(880, 259, 67, 80).grow(15, 15);
//		r = s.newRegion(551, 667, 59, 64).grow(15, 15);

		s.find(test);
		s.mouseMove();
		Location x = Mouse.at();
		System.out.println(x);
		Region r = x.grow(100,100);
//		r = s.
//		System.out.println(x + " " + y);
//			int a = 1;
//			while (a <= 5) {
//				r.click();
//				a++;
//			}
		r.highlight("green");
		Thread.sleep(3000);
		r.highlightOff();
	}
}
