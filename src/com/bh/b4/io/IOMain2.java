package com.bh.b4.io;

import java.util.Calendar;
import java.util.UUID;

public class IOMain2 {

	//어떤 폴더에 저장할 파일명을 자동으로 생성
	//단, 파일명 중복은 x
	//중복이 아니라는 확신이 있어야함.
	
	public static void main(String[] args) {
		String fileName = "";
		

		//fileName을 생성하는 코드
		Calendar calendar = Calendar.getInstance();
		long t = calendar.getTimeInMillis();
		
		fileName = String.valueOf("fileName : "+t);
		
		
		//몇 번을 돌리든 중복x 보장
		
		System.out.println(fileName);
	
		fileName = UUID.randomUUID().toString();
		System.out.println(fileName);
	}

}
