package com.bh.b2.calendar;

import java.util.Calendar;
import java.util.Date;

public class CalendarMain2 {

	public static void main(String [] args) {
		
		Calendar ca = Calendar.getInstance();
		Date d1 = ca.getTime();
		System.out.println(d1);
		
		long l1 = ca.getTimeInMillis(); //밀리세컨즈
		//1000밀리세컨즈  = 1초
		//1분 -> 60초 -> 60000밀리세컨즈
		System.out.println(l1);
		
		ca.set(1998, 8, 12); 
		Date d2=ca.getTime();
		System.out.println(d2);
		
		long l2 = ca.getTimeInMillis();
		System.out.println(l2);
		
		long l3 = l1 - l2;
		System.out.println(l3);
		
		System.out.println("SEC : "+l3/1000L+"초");
		System.out.println("MIN : "+l3/(1000L*60L)+"분");
		System.out.println("HOUR : "+l3/(1000L*60L*60L)+"시");
		System.out.println("DATE : "+l3/(1000L*60L*60L*24L)+"일");
		System.out.println("YEAR : "+l3/(1000L*60L*60L*24L*365L)+"년");
		
		//19세 이상 술집 출입 가능 코딩해보기
	}
}
