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
		System.out.println(ar.get(0));
		
		System.out.println("------------------");
		ar.add(1, "add"); //1번째 인덱스에 "add" 삽입
		//나머지 애들 한칸씩 밀려나
		
		ar.set(0, 1);
		ar.remove(0);
		ar.clear();
		System.out.println(ar.size());
		System.out.println(ar.isEmpty()); //boolean타입 비어져있냐없냐 판단
		
		
		for(int i=0;i<ar.size();i++) {
		System.out.println(ar.get(i));
		}
		
	}

}
