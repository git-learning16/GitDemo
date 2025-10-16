package CoreJava;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateandCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date d = new Date();
		//String da = "03/11/2025";
		//d.getDate();
		System.out.println(d.toString());
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");
		SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(sdf.format(d));
		System.out.println(sd.format(d));
		
		Calendar cal = Calendar.getInstance();
		System.out.println(sdf.format(cal.getTime()));
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println(cal.get(Calendar.AM_PM));
		System.out.println(cal.get(Calendar.HOUR));
		
	}

}
