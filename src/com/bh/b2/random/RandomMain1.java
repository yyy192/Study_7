package com.bh.b2.random;

import java.util.Random;
import java.util.HashSet;
import java.util.Iterator;

public class RandomMain1 {

	public static void main(String[] args) {
		
		Random random = new Random();
		Lotto lotto = new Lotto();
		HashSet<Integer> hs = new HashSet<Integer>();
		
		hs = lotto.makeLotto();
		System.out.println(hs);
		System.out.println(" ");

		//전체출력
			Iterator <Integer> it = hs.iterator();
				
			//Stringtokenizer와 비슷함
			while(it.hasNext()) {
				System.out.println(it.next());
			}
		

	}

}
