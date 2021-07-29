package com.bh.b2.calendar;

import java.util.Calendar;
import java.util.Date;

public class CalendarMain3 {

	public static void main(String[] args) {
		Calendar ca = Calendar.getInstance();
		
		Date d1 = ca.getTime();
		System.out.println(d1);
		long l1 = ca.getTimeInMillis();
		long t = 1000L*60L*60L*8L;
		l1=l1+t;
		
		ca.setTimeInMillis(l1);
		d1=ca.getTime();
		System.out.println(d1);
		
		System.out.println("===구 분 선===");
		ca = Calendar.getInstance();
		d1 = ca.getTime();
		System.out.println(d1);
		
		ca.roll(Calendar.HOUR_OF_DAY, 8);
		d1 = ca.getTime();
		System.out.println(d1); //날짜는 안바뀌는
		
		System.out.println("===구 분 선===");
		ca = Calendar.getInstance();
		d1 = ca.getTime();
		System.out.println(d1);
		
		ca.add(Calendar.HOUR_OF_DAY, 8);
		d1 = ca.getTime();
		System.out.println(d1); //날짜는 안바뀌는
		

	}

}
