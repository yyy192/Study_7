package com.bh.b2.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarMain4 {
	
	public static void main(String [] args) {
		
		Calendar ca = Calendar.getInstance();
		//2021년 7월 29일
		int year = ca.get(Calendar.YEAR);
		int month = ca.get(Calendar.MONTH)+1;
		int date = ca.get(Calendar.DATE);
		System.out.println(year+"년"+month+"월"+date+"일");
	
		Date d = ca.getTime();
		String pattern = "yyyy년 MM월 dd일 E요일";
		SimpleDateFormat sf = new SimpleDateFormat(pattern);
		String result = sf.format(d);
		System.out.println(result);
	}

}
