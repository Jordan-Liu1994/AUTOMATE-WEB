package testSetupRunner;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.sikuli.script.Region;
import org.sikuli.script.Screen;

public class TestSikuliGetRegionImage {

	static Region r;

	public static void main(String[] args) {
		
		String userDir = System.getProperty("user.dir");
		String imageFilePath = userDir + "\\src\\test\\resources\\images\\FishCQ9\\";
		
		Screen s = new Screen(0);
		r = s.selectRegion();
		r.highlightOn();
		System.out.println(r);

		try {
			ImageIO.write(s.capture(r).getImage(), "png", new File(imageFilePath + "betRecordButton皇金渔场.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		r.highlightOff();
	}
}