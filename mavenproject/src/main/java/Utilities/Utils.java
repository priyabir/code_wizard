package Utilities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Utils {
	public static String getLocation() {
		String location = "C:\\Users\\PRIYA BIR\\eclipse-workspace\\mavenproject\\ss\\";
		return location;
	}
	
	public static String getBook() {
		String book = "gryff.xlsx";
		return book;
	}
	
	public static String getSheet() {
		String sheet = "insert";
		return sheet;
	}
	
	public static String getTime() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();  
		String time = (dtf.format(now));
		time = time.replaceAll("/", "_");
		time = time.replaceAll(":", "_");
		System.out.println(dtf.format(now));
		return time;
	}
	
	////////////////////////////////////
	public static void getRow() {
		
	}
	///////////////////////////////////

}