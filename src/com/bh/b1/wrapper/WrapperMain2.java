package com.bh.b1.wrapper;

import java.util.Scanner;

public class WrapperMain2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//주민번호 입력
		//980912-1234567
		//몇 살인지
		//3-5 : 봄
		//6-8 : 여름
		//9-11 : 가을
		//12-2 : 겨울
		System.out.println("주민번호를 입력하세요.");
//		String num = sc.next();
		String num = "991224-1234567";
		String y = num.substring(0,2);
		int year = Integer.parseInt(y);
		year = 1900+year;
		int age = 2021 - year;
		System.out.println(age);
		
		String m = num.substring(2, 4);
		int month = Integer.parseInt(m);
		System.out.println(month);
		
		if(month>=3 && month<6) {
			System.out.println("봄");
		}else if(month>=6 && month<9) {
			System.out.println("여름");
			
		}else if(month>=9 && month<12) {
			System.out.println("가을");
			
		}else {
			System.out.println("겨울");
		}
		
	}

}
