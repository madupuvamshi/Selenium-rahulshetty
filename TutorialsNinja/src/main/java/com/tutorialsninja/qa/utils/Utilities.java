package com.tutorialsninja.qa.utils;

import java.util.Date;

public class Utilities {
	
	public static final int implicitWaitTime=10;
	public static final int pageLoadTime=5;

	public static String generateEmailWithTimeStamp() {
		
		Date date=new Date();
		String timestamp= date.toString().replace(" ","_").replace(":", "_");
		return "vamshi"+timestamp+"@gmail.com";
	}
	
}
