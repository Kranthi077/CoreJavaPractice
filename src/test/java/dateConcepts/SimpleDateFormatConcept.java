package dateConcepts;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date d = new Date();
		System.out.println(d);
		System.out.println(d.toString());
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		SimpleDateFormat sdf1 = new SimpleDateFormat("d-MMMM-yy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("E/d-M-yy & hh:mm:ss a z");
		System.out.println(sdf.format(d));
		System.out.println(sdf1.format(d));
		System.out.println(sdf2.format(d));
		


	}

}
