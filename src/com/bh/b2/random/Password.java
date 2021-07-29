package com.bh.b2.random;

import java.util.ArrayList;
import java.util.Random;

public class Password {
	
	//메서드명 = makePassword
	//랜덤 패스워드 생성
	//대문자, 소문자, 숫자 조합
	//8글자
	//1. 첫번째 글자를 대문자, 소문자, 숫자 랜덤결정 후 랜덤 출력 
	//random.nextInt(3)+1; = 1, 2, 3
	//1이면 대문자, 2면 소문자 3이면 숫자
	//글자    - 아스키코드
	
	public ArrayList<Object> makePassword() {
		Random random = new Random();
		StringBuffer sb = new StringBuffer();
		ArrayList<Object> ar = new ArrayList<Object>();
		
		
		System.out.println("비밀번호 생성하기");
		
		for(int i =0;i<8;i++) {
			int select = random.nextInt(3)+1;
			
			if(select ==1) {
					int a = random.nextInt(26)+65;
					char b = (char)a;
					ar.add(b);
					
				}else if(select==2) {
					int a = random.nextInt(26)+97;
					char b = (char)a;
					ar.add(b);
				}else {
					int a = random.nextInt(10);
					ar.add(a);
					
				}
		}//for문 끝
		
		return ar;
	}

}
