package testSetupRunner;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.sikuli.script.Location;
import org.sikuli.script.Region;
import org.sikuli.script.Screen;

public class TestSikuliGetRegion {

	static Region r;
	static Location x;

	public static void main(String[] args) {
		
		String userDir = System.getProperty("user.dir");
		String imageFilePath = userDir + "\\src\\test\\resources\\images\\Slots\\";
		
		Screen s = new Screen(0);
		x = s.selectRegion().getCenter();
		r = s.selectRegion();
		r.highlightOn();
		System.out.println(x);
		System.out.println(r);
		r.highlightOff();
	}
}