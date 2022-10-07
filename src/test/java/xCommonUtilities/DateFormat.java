package xCommonUtilities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {

	public void setDateAndTime() {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM - HH:mm:ss");
		String timeStamp = simpleDateFormat.format(new Date());
		System.out.println(timeStamp);
	}
}
