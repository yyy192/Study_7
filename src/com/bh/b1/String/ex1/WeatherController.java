package com.bh.b1.String.ex1;

import java.util.Scanner;

public class WeatherController {

	private WeatherInfo weatherInfo;
	private WeatherView weatherView;
	
	public WeatherController() {
		weatherInfo = new WeatherInfo();
		weatherView = new WeatherView();
	}
	
	public void start () {
		System.out.println("Start");
		
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		
		WeatherDTO [] weathers = weatherInfo.makeWeather();
		
		while(check) {
			
			System.out.println(" ");//구분선
			System.out.print("1. 전체 날씨 정보 출력\t");
			System.out.print("2. 검색 지역 정보 출력\t");
			System.out.print("3. 지역 정보 추가\t");
			System.out.println("4. 프로그램 종료");
			
			int num = sc.nextInt();
			System.out.println(" ");//구분선
			
			if(num==1) {
				this.weatherView.view(weathers);
			}else if(num==2) {
				WeatherDTO weatherDTO = this.weatherInfo.searchWeather(weathers);
				
				if(weatherDTO == null) {
					this.weatherView.view("도시의 정보가 없습니다.");
				}else {
					this.weatherView.view(weatherDTO);
				}
			}else if(num==3) {
				
			}else if(num==4) {
				System.out.println("프로그램을 종료합니다.");
				check = false;
			}else{
				System.out.println("잘못된 번호 입니다. 다시 누르세요.");
			}
		}
		
		
		System.out.println(" ");//구분선
		System.out.println("Finish");
	}
}
