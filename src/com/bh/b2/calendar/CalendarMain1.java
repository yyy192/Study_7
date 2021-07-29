package com.bh.b2.calendar;

import java.util.Date;
import java.util.Calendar;

public class CalendarMain1 {

	public static void main(String[] args) {
		
		//현재 날짜와 시간의 정보
		Calendar ca = Calendar.getInstance();//new GregorianCalendar();
		System.out.println(ca);//.toString(); 자동 호출
		
		System.out.println(" ");
		System.out.println("==============구 분 선==============");
		System.out.println(" ");
		
		int year = ca.get(Calendar.YEAR);
		System.out.println("YEAR  : "+year+"년");
		int month = ca.get(Calendar.MONTH)+1;
		System.out.println("MONTH : "+month+"월");
		int date = ca.get(Calendar.DATE);
		System.out.println("DATE  : "+date+"일");
		
		System.out.println(" ");
		System.out.println("==============구 분 선==============");
		System.out.println(" ");
		
		int hour = ca.get(Calendar.HOUR);  //시
		int min = ca.get(Calendar.MINUTE); //분
		int sec = ca.get(Calendar.SECOND); //초
		System.out.println("현재 시각은 "+hour+"시 "+min+"분 "+sec+"초 입니다.");
		
		Date d = ca.getTime();
		System.out.println(d);
		
		
	}

}
