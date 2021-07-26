package com.bh.b1.String;

public class StringMain2 {

	public static void main(String[] args) {
		
		//String name = new String("hello World");
		String name = "hello World";

		char ch = name.charAt(6);
		
		System.out.println(ch);
		
		name = "991021-1234567";
		
		//남 녀 판별
		ch = name.charAt(7);
		System.out.println(ch);
		if(ch=='2' || ch =='4') {
			System.out.println("여자");
		}else if(ch=='1' || ch =='3') {
			System.out.println("남자");
		}else {
			System.out.println("다시 입력");
		}
		
//		ch = name.charAt(200);
//		System.out.println(ch);
		//배열 크기보다 더 많이 벗어나서 오류남.
	}

}
