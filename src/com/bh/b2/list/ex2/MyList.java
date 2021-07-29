package com.bh.b2.list.ex2;

import java.util.ArrayList;

public class MyList implements DataIO {
	                        //DataIO 구현
	
	
	//add num을 list의 맨 앞에 추가
	@Override
	public void add(ArrayList<Integer> ar, int num) {
		
		ar.add(0, num);
	
		
		
	}
	
	//remove list에서 무조건 마지막 요소를 삭제
	@Override
	public void remove(ArrayList<Integer> ar) {
		ar.remove(ar.size()-1);
		
	}
	
	
}
