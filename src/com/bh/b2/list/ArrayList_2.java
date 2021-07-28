package com.bh.b2.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_2 {

	public static void main(String[] args) {
		
		//type이 안전하지 않다
		ArrayList<String> ar = new ArrayList<String>();
		
		//int 담을 ArrayList 선언하기
		ArrayList<Integer> ar2 = new ArrayList<Integer>();

//		List<Integer> list = ar; //generic이 다르기 때문에 에러남
//		List<Object> list = ar; //모든 object가 string타입 아님	
		
		//List는 ArrayList의 super class(Interface)
		//단, generic type도 일치해야 함
		
		List<Integer> list = ar2;

		
	}

}
