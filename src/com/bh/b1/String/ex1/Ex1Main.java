package com.bh.b1.String.ex1;

public class Ex1Main {

	public static void main(String[] args) {
		// 날씨 정보를 받아서 조회하는 program
		// 날씨 정보는 도시명, 기온, 습도, 상태
		// 1. 날씨 정보 전체 출력
		// 2. 지역 검색 정보 출력
		// 3. 지역 정보 추가
		// 4. program 종료
		

		//main은 프로그램 실행이나 테스트 역할
		WeatherController wc = new WeatherController();
		wc.start();

		//WeatherInfo Test
//		WeatherInfo weatherInfo = new WeatherInfo();
//		WeatherDTO [] weatherDTOs = weatherInfo.makeWeather();
//		
//		for(int i=0;i<weatherDTOs.length;i++) {
//			System.out.println(weatherDTOs[i].getCity());
//			System.out.println(weatherDTOs[i].getGion());
//			System.out.println(weatherDTOs[i].getHum());
//			System.out.println(weatherDTOs[i].getCondition());
//			System.out.println("=======================");
//		}

	}

}
