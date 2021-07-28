package com.bh.b1.String.ex1;

import java.util.Scanner;

public class WeatherInfo {
	
	//기상청 데이터 받아오기
	 private String info;
	 StringBuffer sb;
	 
	 //기본 생성자
	 public WeatherInfo() {
		 sb = new StringBuffer();
		 sb.append("Seoul, 37, 80, 맑음,");
		 sb.append("Daegu, 43, 90, 지옥,");
		 sb.append("Busan, -32, 10, 눈,");
		 sb.append("Jeju, 3, 40, 비");
	 }
	 
	 //searchWeather
	 //도시명 입력받고 전체정보에서 일치하는 도시 찾아서 DTO 리턴
	 public WeatherDTO searchWeather(WeatherDTO [] weathers) {
		 Scanner sc = new Scanner(System.in);
		
		 System.out.println("도시명을 입력하세요.");
		 String cityName = sc.next();
		 
		 WeatherDTO weatherDTO = null;
		 
		 for(int i=0;i<weathers.length;i++) {
			 if(weathers[i].getCity().equals(cityName)) {
				 weatherDTO = weathers[i];
				 break;
			 }
		 }
		 
		 return weatherDTO;
	 }
	 
	 public WeatherDTO [] makeWeather() {
		 info = sb.toString();
		 System.out.println(info);
		 
		 //파싱(parsing, 문자열을 자르는 작업)
		 String [] strings = info.split(",");
		 System.out.println(strings.length); //배열의 길이
		 WeatherDTO [] weathers = new WeatherDTO[strings.length/4];
		 
		 int j = -1;
		 
		for(int i = 0; i<weathers.length;i++) {
			WeatherDTO weatherDTO = new WeatherDTO();
			weatherDTO.setCity(strings[++j].trim());
			weatherDTO.setGion(strings[++j].trim());
			weatherDTO.setHum(strings[++j].trim());
			weatherDTO.setCondition(strings[++j].trim());
			
			weathers[i] = weatherDTO;
		}
		 
		 return weathers;
		 
		 
	 }
	 


}
