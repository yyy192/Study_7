package com.bh.b1.String;

public class StringMain6 {

	public static void main(String[] args) {
	
		String weather = "서울-대전-대구-광주-부산-제주";
		String [] cities = weather.split("-");
		
		for(int i = 0; i<cities.length;i++) {
			System.out.println(cities[i]);
		}
		
		System.out.println(" ");
		
		weather = "32 89 45 67";
		String [] temperatures = weather.split(" ");

		for(int i=0;i<temperatures.length;i++) {
			System.out.println(temperatures[i]);
		}
		
		System.out.println(" ");
		
		String bh = "byun baekhyun";
		//소문자로 변경
		bh = bh.toLowerCase();
		System.out.println(bh);
		
		System.out.println(" ");
		
		//대문자로 변경
		bh = bh.toUpperCase();
		System.out.println(bh);
		
		System.out.println(" "); //구분선
		
		String name = "T e  st         ";
		name=name.trim();
//		String [] names = name.split(" ");
//		String result="";
//		for(int i=0;i<names.length;i++) {
//			result = result + names[i];
//		}
//		System.out.println(result);
//		System.out.println(result.equals("Test"));
//		내 코딩,,^^
		
		
		name = name.replace(" ", "");
		System.out.println(name);
		System.out.println(name.equals("Test"));
	}

}
