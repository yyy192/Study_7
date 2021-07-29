package com.bh.b2.list.ex2;

import java.util.ArrayList;

public class Ex2Main {

	public static void main(String[] args) {
		
		ArrayList<Integer> ar = new ArrayList<Integer>();
		
		MyList myList = new MyList();
		
		ar.add(1);
		ar.add(2);
		ar.add(3);

		myList.add(ar, 0);
		myList.remove(ar);
		
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
			
		}
	
	}

}
