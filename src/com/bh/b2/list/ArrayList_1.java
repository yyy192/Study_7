package com.bh.b2.list;

import java.util.ArrayList;

public class ArrayList_1 {

	public static void main(String[] args) {
		
		//객체 생성
		ArrayList ar = new ArrayList();
		String [] str = new String[2];
		
		//같은 데이터타입을 모음
		String s = "First";
		Object e = s;
		
		ar.add("First"); 
		str[0] = "First";
		
		System.out.println(ar.size()); //배열 길이 -1
		System.out.println(str.length);
		
		ar.add("Second");
		str[1] = "Second";

		System.out.println("--");
		System.out.println(ar.size()); //배열 길이 -2
		System.out.println(str.length);
		
		ar.add("Third");
		System.out.println("--");
		System.out.println(ar.size()); //배열 길이 -3
		System.out.println(str.length);
		
//		Integer num = 5; //auto boxing
//		Object obj = num;
		Object obj = 5;
		ar.add(5); //auto boxing
		
		ar.add('a'); //auto boxing
		ar.add(true); //auto boxing
		
		System.out.println("------");
		for(int i=0;i<ar.size();i++) {
		System.out.println(ar.get(i));
		}
		
	}

}
