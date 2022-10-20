package testSetupRunner;

import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import org.sikuli.script.Location;
import org.sikuli.script.Region;
import org.sikuli.script.Screen;

public class TestSikuliCaptureImageAndSave {

//	IMPORTANT, USE THIS TO CAPTURE IMAGES FOR SIKULI TESTING

//	SETS THE PATH TO THE IMAGE CAPTURED & SAVED
	static String userDir = System.getProperty("user.dir");
	static String imageFilePath = userDir + "\\crackCaptchaImages\\";
//	PROVIDE STATIC NAMING FOR MULTI AREA USE
	static String png = ".png";
	static String imageName = "captchaSlider 5" + png;
//	REGION FUNCTION METHOD
	static Region r;
//	LOCATION FUNCTION METHOD
	static Location x;

	public static void main(String[] args) {
//		SET SCREEN TO MAIN SCREEN = 0 = DEFAULT WORKING SCREEN
		Screen s = new Screen(0);
//		PROMPTS USER TO SELECT A REGION ANYWHERE ON THE SCREEN
		r = s.selectRegion();
//		GETS THE CENTER POINT OF THE REGION THAT USER WILL CAPTURE
		x = r.getCenter();
		System.out.println("Center point = " + x);
//		DISPLAYS A HIGHLIGHT TO INFORM USER OF THE REGION TO CAPTURE
		r.highlightOn();
		System.out.println("Region = " + r);
//		CAPTURES THE REGION SELECTED AND SAVE IT TO THE SPECIFIC FILE PATH FOLDER
		try {
			ImageIO.write(s.capture(r).getImage(), "png", new File(imageFilePath + imageName));
		} catch (IOException e) {
			e.printStackTrace();
		}
//		DISPLAYED HIGHLIGHT IS TURNED OFF AFTER COMPLETION
		r.highlightOff();
	}
}