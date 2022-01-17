package inportex.day0112;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ImportDate {

	public static void main(String[] args) {
		Date d=new Date();
		System.out.println(d);
		 
		SimpleDateFormat sdf 
		= new SimpleDateFormat("yyyy/MM/dd/hh:mm a");
		String now = sdf.format(d);
		System.out.println("현재시간 : "+now);
		
		

	}

}
